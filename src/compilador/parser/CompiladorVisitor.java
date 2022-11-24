// Generated from java-escape by ANTLR 4.11.1
package compilador.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompiladorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompiladorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#compilador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilador(CompiladorParser.CompiladorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(CompiladorParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#fin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin(CompiladorParser.FinContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CompiladorParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(CompiladorParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(CompiladorParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(CompiladorParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(CompiladorParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(CompiladorParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CompiladorParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link CompiladorParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CompiladorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompiladorParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(CompiladorParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pare}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPare(CompiladorParser.PareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potencia}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(CompiladorParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(CompiladorParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicacion_o_division}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion_o_division(CompiladorParser.Multiplicacion_o_divisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CompiladorParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suma_o_resta}
	 * labeled alternative in {@link CompiladorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma_o_resta(CompiladorParser.Suma_o_restaContext ctx);
}