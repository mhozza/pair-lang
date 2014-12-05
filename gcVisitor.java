// Generated from gc.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gcParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull gcParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link gcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull gcParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(@NotNull gcParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Second}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond(@NotNull gcParser.SecondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull gcParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Emp}
	 * labeled alternative in {@link gcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmp(@NotNull gcParser.EmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gcParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull gcParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link gcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull gcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code First}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(@NotNull gcParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull gcParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pair}
	 * labeled alternative in {@link gcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(@NotNull gcParser.PairContext ctx);
}