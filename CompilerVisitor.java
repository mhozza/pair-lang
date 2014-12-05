import java.util.HashMap;
import java.util.Map;
import org.stringtemplate.v4.*;


public class CompilerVisitor extends gcBaseVisitor<CodeFragment> {
        public final int INT = 0;
        public final int PAIR = 1;
        private Map<String, String> mem = new HashMap<String, String>();
        private int labelIndex = 0;
        private int registerIndex = 0;

        private String generateNewLabel() {
                return String.format("L%d", this.labelIndex++);
        }

        private String generateNewRegister() {
                return String.format("%%R%d", this.registerIndex++);
        }

        @Override
        public CodeFragment visitAssign(gcParser.AssignContext ctx) {
                CodeFragment value = visit(ctx.expression());
                String mem_register;
                String code_stub = "";

                String identifier = ctx.lvalue().getText();
                if (!mem.containsKey(identifier)) {
                        mem_register = this.generateNewRegister();
                        code_stub = "<mem_register> = alloca %struct.object*\n";
                        mem.put(identifier, mem_register);
                } else {
                        mem_register = mem.get(identifier);
                }
                ST template = new ST(
                        "<value_code>" +
                        code_stub +
                        "store %struct.object* <value_register>, %struct.object** <mem_register>\n"
                );
                template.add("value_code", value);
                template.add("value_register", value.getRegister());
                template.add("mem_register", mem_register);
                CodeFragment code = new CodeFragment();
                code.addCode(template.render());
                code.setRegister(value.getRegister());
                return code;
        }

        @Override
        public CodeFragment visitPrint(gcParser.PrintContext ctx) {
                CodeFragment code = visit(ctx.expression());
                ST template = new ST(
                         "<value_code>" +
                         "call i32 @print (%struct.object* <value>)\n"
                );
                template.add("value_code", code);
                template.add("value", code.getRegister());

                CodeFragment ret = new CodeFragment();
                ret.addCode(template.render());
                return ret;
        }



        @Override
        public CodeFragment visitVar(gcParser.VarContext ctx) {
                String id = ctx.STRING().getText();
                CodeFragment code = new CodeFragment();
                String register = generateNewRegister();
                String pointer = "!\"Unknown identifier\"";
                if (!mem.containsKey(id)) {
                        System.err.println(String.format("Error: idenifier '%s' does not exists", id));

                } else {
                        pointer = mem.get(id);
                }
                ST template = new ST(
                         "<ret> = load %struct.object** <ptr>\n"
                );
                template.add("ptr", pointer);
                template.add("ret", register);

                code.addCode(template.render());
                code.setRegister(register);
                return code;
        }

        @Override
        public CodeFragment visitInt(gcParser.IntContext ctx) {
                String value = ctx.INT().getText();
                CodeFragment code = new CodeFragment();

                ST template = new ST(
                        "<ret_reg> = call %struct.object* @createInt (i32 <val>)\n"
                );
                String register = generateNewRegister();
                template.add("ret_reg", register);
                template.add("val", value);
                code.setRegister(register);
                code.addCode(template.render());
                return code;
        }

        @Override
        public CodeFragment visitPair(gcParser.PairContext ctx) {
                CodeFragment first = visit(ctx.expression(0));
                CodeFragment second = visit(ctx.expression(1));
                CodeFragment code = new CodeFragment();

                ST template = new ST(
                        "<first>" +
                        "<second>" +
                        "<ret_reg> = call %struct.object* @createPair(%struct.object* <first_val>, %struct.object* <second_val>)\n"
                );
                String register = generateNewRegister();
                template.add("ret_reg", register);
                template.add("first", first);
                template.add("first_val", first.getRegister());
                template.add("second", second);
                template.add("second_val", second.getRegister());
                code.setRegister(register);
                code.addCode(template.render());
                return code;

        }

        @Override
        public CodeFragment visitFirst(gcParser.FirstContext ctx) {
                CodeFragment obj = visit(ctx.expression());
                CodeFragment code = new CodeFragment();

                ST template = new ST(
                        "<obj>" +
                        "<ret_reg> = call %struct.object* @first(%struct.object* <obj_val>)\n"
                );
                String register = generateNewRegister();
                template.add("ret_reg", register);
                template.add("obj", obj);
                template.add("obj_val", obj.getRegister());
                code.setRegister(register);
                code.addCode(template.render());
                return code;

        }

        @Override
        public CodeFragment visitSecond(gcParser.SecondContext ctx) {
                CodeFragment obj = visit(ctx.expression());
                CodeFragment code = new CodeFragment();

                ST template = new ST(
                        "<obj>" +
                        "<ret_reg> = call %struct.object* @second(%struct.object* <obj_val>)\n"
                );
                String register = generateNewRegister();
                template.add("ret_reg", register);
                template.add("obj", obj);
                template.add("obj_val", obj.getRegister());
                code.setRegister(register);
                code.addCode(template.render());
                return code;
        }


        @Override
        public CodeFragment visitInit(gcParser.InitContext ctx) {
                CodeFragment body = visit(ctx.statements());

                ST template = new ST(
                        "%struct.object = type { %struct.object*, %struct.object*, i32 }\n" +
                        "declare i32 @print(%struct.object*)\n" +
                        "declare %struct.object* @createInt(i32)\n" +
                        "declare %struct.object* @createPair(%struct.object*, %struct.object*)\n" +
                        "declare %struct.object* @first(%struct.object*)\n" +
                        "declare %struct.object* @second(%struct.object*)\n" +
                        "define i32 @main() {\n" +
                        "start:\n" +
                        "<body_code>" +
                        "ret i32 0\n" +
                        "}\n"
                );
                template.add("body_code", body);

                CodeFragment code = new CodeFragment();
                code.addCode(template.render());
                code.setRegister(body.getRegister());
                return code;
        }

        @Override
        public CodeFragment visitStatements(gcParser.StatementsContext ctx) {
                CodeFragment code = new CodeFragment();
                for(gcParser.StatementContext s: ctx.statement()) {
                        CodeFragment statement = visit(s);
                        code.addCode(statement);
                        code.setRegister(statement.getRegister());
                }
                return code;
        }

        @Override
        public CodeFragment visitEmp(gcParser.EmpContext ctx) {
                return new CodeFragment();
        }

}
