// Generated from java-escape by ANTLR 4.11.1
package calculadora.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#calculadora}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculadora(CalculadoraParser.CalculadoraContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(CalculadoraParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CalculadoraParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(CalculadoraParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(CalculadoraParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(CalculadoraParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(CalculadoraParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(CalculadoraParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link CalculadoraParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CalculadoraParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CalculadoraParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(CalculadoraParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potencia}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(CalculadoraParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(CalculadoraParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicacion_o_division}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion_o_division(CalculadoraParser.Multiplicacion_o_divisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CalculadoraParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suma_o_resta}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma_o_resta(CalculadoraParser.Suma_o_restaContext ctx);
}