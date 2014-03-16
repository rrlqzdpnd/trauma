// Generated from Trauma.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TraumaParser}.
 */
public interface TraumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TraumaParser#compoundstmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundstmt(@NotNull TraumaParser.CompoundstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#compoundstmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundstmt(@NotNull TraumaParser.CompoundstmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#vardeclinit}.
	 * @param ctx the parse tree
	 */
	void enterVardeclinit(@NotNull TraumaParser.VardeclinitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#vardeclinit}.
	 * @param ctx the parse tree
	 */
	void exitVardeclinit(@NotNull TraumaParser.VardeclinitContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull TraumaParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull TraumaParser.ArglistContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TraumaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TraumaParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull TraumaParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull TraumaParser.CallContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull TraumaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull TraumaParser.ArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#sumexpression}.
	 * @param ctx the parse tree
	 */
	void enterSumexpression(@NotNull TraumaParser.SumexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#sumexpression}.
	 * @param ctx the parse tree
	 */
	void exitSumexpression(@NotNull TraumaParser.SumexpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(@NotNull TraumaParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(@NotNull TraumaParser.ReturnstmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(@NotNull TraumaParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(@NotNull TraumaParser.ParamlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#relexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelexpression(@NotNull TraumaParser.RelexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#relexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelexpression(@NotNull TraumaParser.RelexpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#iterationstmt}.
	 * @param ctx the parse tree
	 */
	void enterIterationstmt(@NotNull TraumaParser.IterationstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#iterationstmt}.
	 * @param ctx the parse tree
	 */
	void exitIterationstmt(@NotNull TraumaParser.IterationstmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#localdeclarations}.
	 * @param ctx the parse tree
	 */
	void enterLocaldeclarations(@NotNull TraumaParser.LocaldeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#localdeclarations}.
	 * @param ctx the parse tree
	 */
	void exitLocaldeclarations(@NotNull TraumaParser.LocaldeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#immutable}.
	 * @param ctx the parse tree
	 */
	void enterImmutable(@NotNull TraumaParser.ImmutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#immutable}.
	 * @param ctx the parse tree
	 */
	void exitImmutable(@NotNull TraumaParser.ImmutableContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#expressionstmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionstmt(@NotNull TraumaParser.ExpressionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#expressionstmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionstmt(@NotNull TraumaParser.ExpressionstmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndexpression(@NotNull TraumaParser.AndexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndexpression(@NotNull TraumaParser.AndexpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifier(@NotNull TraumaParser.TypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifier(@NotNull TraumaParser.TypespecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#breakstmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakstmt(@NotNull TraumaParser.BreakstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#breakstmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakstmt(@NotNull TraumaParser.BreakstmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull TraumaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull TraumaParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull TraumaParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull TraumaParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpression(@NotNull TraumaParser.UnaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpression(@NotNull TraumaParser.UnaryexpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#funcdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncdeclaration(@NotNull TraumaParser.FuncdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#funcdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncdeclaration(@NotNull TraumaParser.FuncdeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#vardeclist}.
	 * @param ctx the parse tree
	 */
	void enterVardeclist(@NotNull TraumaParser.VardeclistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#vardeclist}.
	 * @param ctx the parse tree
	 */
	void exitVardeclist(@NotNull TraumaParser.VardeclistContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleexpression(@NotNull TraumaParser.SimpleexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleexpression(@NotNull TraumaParser.SimpleexpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaration(@NotNull TraumaParser.VardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaration(@NotNull TraumaParser.VardeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull TraumaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull TraumaParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull TraumaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull TraumaParser.ParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull TraumaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull TraumaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#unaryrelexpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryrelexpression(@NotNull TraumaParser.UnaryrelexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#unaryrelexpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryrelexpression(@NotNull TraumaParser.UnaryrelexpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(@NotNull TraumaParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(@NotNull TraumaParser.PrintstmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#selectionstmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectionstmt(@NotNull TraumaParser.SelectionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#selectionstmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectionstmt(@NotNull TraumaParser.SelectionstmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#declarationlist}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationlist(@NotNull TraumaParser.DeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#declarationlist}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationlist(@NotNull TraumaParser.DeclarationlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull TraumaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull TraumaParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#statementlist}.
	 * @param ctx the parse tree
	 */
	void enterStatementlist(@NotNull TraumaParser.StatementlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#statementlist}.
	 * @param ctx the parse tree
	 */
	void exitStatementlist(@NotNull TraumaParser.StatementlistContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#multexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultexpression(@NotNull TraumaParser.MultexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#multexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultexpression(@NotNull TraumaParser.MultexpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TraumaParser#mutable}.
	 * @param ctx the parse tree
	 */
	void enterMutable(@NotNull TraumaParser.MutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraumaParser#mutable}.
	 * @param ctx the parse tree
	 */
	void exitMutable(@NotNull TraumaParser.MutableContext ctx);
}