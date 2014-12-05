// Generated from gc.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gcParser}.
 */
public interface gcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gcParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull gcParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull gcParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link gcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull gcParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link gcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull gcParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(@NotNull gcParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(@NotNull gcParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Second}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSecond(@NotNull gcParser.SecondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Second}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSecond(@NotNull gcParser.SecondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull gcParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull gcParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link gcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmp(@NotNull gcParser.EmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link gcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmp(@NotNull gcParser.EmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gcParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull gcParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gcParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull gcParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link gcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull gcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link gcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull gcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code First}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(@NotNull gcParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code First}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(@NotNull gcParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull gcParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull gcParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pair}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPair(@NotNull gcParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pair}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPair(@NotNull gcParser.PairContext ctx);
}