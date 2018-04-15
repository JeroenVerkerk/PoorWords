package nl.hu.v2pafr.PoorWords.antlr;

// Generated from PoorWord.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PoorWordParser}.
 */
public interface PoorWordListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PoorWordParser#eenvoudigezin}.
	 * @param ctx the parse tree
	 */
	void enterEenvoudigezin(PoorWordParser.EenvoudigezinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoorWordParser#eenvoudigezin}.
	 * @param ctx the parse tree
	 */
	void exitEenvoudigezin(PoorWordParser.EenvoudigezinContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoorWordParser#naamwoordelijk_deel}.
	 * @param ctx the parse tree
	 */
	void enterNaamwoordelijk_deel(PoorWordParser.Naamwoordelijk_deelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoorWordParser#naamwoordelijk_deel}.
	 * @param ctx the parse tree
	 */
	void exitNaamwoordelijk_deel(PoorWordParser.Naamwoordelijk_deelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoorWordParser#zelfstandig_naamwoord}.
	 * @param ctx the parse tree
	 */
	void enterZelfstandig_naamwoord(PoorWordParser.Zelfstandig_naamwoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoorWordParser#zelfstandig_naamwoord}.
	 * @param ctx the parse tree
	 */
	void exitZelfstandig_naamwoord(PoorWordParser.Zelfstandig_naamwoordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoorWordParser#lidwoord}.
	 * @param ctx the parse tree
	 */
	void enterLidwoord(PoorWordParser.LidwoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoorWordParser#lidwoord}.
	 * @param ctx the parse tree
	 */
	void exitLidwoord(PoorWordParser.LidwoordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PoorWordParser#werkwoordelijk_deel}.
	 * @param ctx the parse tree
	 */
	void enterWerkwoordelijk_deel(PoorWordParser.Werkwoordelijk_deelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PoorWordParser#werkwoordelijk_deel}.
	 * @param ctx the parse tree
	 */
	void exitWerkwoordelijk_deel(PoorWordParser.Werkwoordelijk_deelContext ctx);
}