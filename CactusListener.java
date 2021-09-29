// Generated from Cactus.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CactusParser}.
 */
public interface CactusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CactusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CactusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CactusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(CactusParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(CactusParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#declarations_E}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations_E(CactusParser.Declarations_EContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#declarations_E}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations_E(CactusParser.Declarations_EContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(CactusParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(CactusParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#statements_E}.
	 * @param ctx the parse tree
	 */
	void enterStatements_E(CactusParser.Statements_EContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#statements_E}.
	 * @param ctx the parse tree
	 */
	void exitStatements_E(CactusParser.Statements_EContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CactusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CactusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(CactusParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(CactusParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#booleanExpression_E}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression_E(CactusParser.BooleanExpression_EContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#booleanExpression_E}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression_E(CactusParser.BooleanExpression_EContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#booleanTerm}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTerm(CactusParser.BooleanTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#booleanTerm}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTerm(CactusParser.BooleanTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#booleanTerm_E}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTerm_E(CactusParser.BooleanTerm_EContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#booleanTerm_E}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTerm_E(CactusParser.BooleanTerm_EContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#booleanFactor}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFactor(CactusParser.BooleanFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#booleanFactor}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFactor(CactusParser.BooleanFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpression(CactusParser.RelationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#relationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpression(CactusParser.RelationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(CactusParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(CactusParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#arithmeticExpression_E}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression_E(CactusParser.ArithmeticExpression_EContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#arithmeticExpression_E}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression_E(CactusParser.ArithmeticExpression_EContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#arithmeticTerm}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticTerm(CactusParser.ArithmeticTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#arithmeticTerm}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticTerm(CactusParser.ArithmeticTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#arithmeticTerm_E}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticTerm_E(CactusParser.ArithmeticTerm_EContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#arithmeticTerm_E}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticTerm_E(CactusParser.ArithmeticTerm_EContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#arithmeticFactor}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticFactor(CactusParser.ArithmeticFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#arithmeticFactor}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticFactor(CactusParser.ArithmeticFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CactusParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CactusParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CactusParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CactusParser.PrimaryExpressionContext ctx);
}