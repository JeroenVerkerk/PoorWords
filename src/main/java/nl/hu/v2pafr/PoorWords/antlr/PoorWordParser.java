package nl.hu.v2pafr.PoorWords.antlr;

// Generated from PoorWord.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PoorWordParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11;
	public static final int
		RULE_eenvoudigezin = 0, RULE_naamwoordelijk_deel = 1, RULE_zelfstandig_naamwoord = 2, 
		RULE_lidwoord = 3, RULE_werkwoordelijk_deel = 4;
	public static final String[] ruleNames = {
		"eenvoudigezin", "naamwoordelijk_deel", "zelfstandig_naamwoord", "lidwoord", 
		"werkwoordelijk_deel"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'brood'", "'man'", "'boer'", "'de'", "'het'", "'een'", "'laat'", 
		"'eet'", "'koopt'", "'snijdt'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PoorWord.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PoorWordParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EenvoudigezinContext extends ParserRuleContext {
		public List<Naamwoordelijk_deelContext> naamwoordelijk_deel() {
			return getRuleContexts(Naamwoordelijk_deelContext.class);
		}
		public Naamwoordelijk_deelContext naamwoordelijk_deel(int i) {
			return getRuleContext(Naamwoordelijk_deelContext.class,i);
		}
		public Werkwoordelijk_deelContext werkwoordelijk_deel() {
			return getRuleContext(Werkwoordelijk_deelContext.class,0);
		}
		public EenvoudigezinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eenvoudigezin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoorWordListener ) ((PoorWordListener)listener).enterEenvoudigezin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoorWordListener ) ((PoorWordListener)listener).exitEenvoudigezin(this);
		}
	}

	public final EenvoudigezinContext eenvoudigezin() throws RecognitionException {
		EenvoudigezinContext _localctx = new EenvoudigezinContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eenvoudigezin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			naamwoordelijk_deel();
			setState(11);
			werkwoordelijk_deel();
			setState(12);
			naamwoordelijk_deel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Naamwoordelijk_deelContext extends ParserRuleContext {
		public LidwoordContext lidwoord() {
			return getRuleContext(LidwoordContext.class,0);
		}
		public Zelfstandig_naamwoordContext zelfstandig_naamwoord() {
			return getRuleContext(Zelfstandig_naamwoordContext.class,0);
		}
		public Naamwoordelijk_deelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naamwoordelijk_deel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoorWordListener ) ((PoorWordListener)listener).enterNaamwoordelijk_deel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoorWordListener ) ((PoorWordListener)listener).exitNaamwoordelijk_deel(this);
		}
	}

	public final Naamwoordelijk_deelContext naamwoordelijk_deel() throws RecognitionException {
		Naamwoordelijk_deelContext _localctx = new Naamwoordelijk_deelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_naamwoordelijk_deel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			lidwoord();
			setState(15);
			zelfstandig_naamwoord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zelfstandig_naamwoordContext extends ParserRuleContext {
		public Zelfstandig_naamwoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zelfstandig_naamwoord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoorWordListener ) ((PoorWordListener)listener).enterZelfstandig_naamwoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoorWordListener ) ((PoorWordListener)listener).exitZelfstandig_naamwoord(this);
		}
	}

	public final Zelfstandig_naamwoordContext zelfstandig_naamwoord() throws RecognitionException {
		Zelfstandig_naamwoordContext _localctx = new Zelfstandig_naamwoordContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_zelfstandig_naamwoord);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(17);
				match(T__0);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(18);
				match(T__1);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(19);
				match(T__2);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LidwoordContext extends ParserRuleContext {
		public LidwoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lidwoord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoorWordListener ) ((PoorWordListener)listener).enterLidwoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoorWordListener ) ((PoorWordListener)listener).exitLidwoord(this);
		}
	}

	public final LidwoordContext lidwoord() throws RecognitionException {
		LidwoordContext _localctx = new LidwoordContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lidwoord);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(22);
				match(T__3);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(23);
				match(T__4);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(24);
				match(T__5);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Werkwoordelijk_deelContext extends ParserRuleContext {
		public Werkwoordelijk_deelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_werkwoordelijk_deel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoorWordListener ) ((PoorWordListener)listener).enterWerkwoordelijk_deel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoorWordListener ) ((PoorWordListener)listener).exitWerkwoordelijk_deel(this);
		}
	}

	public final Werkwoordelijk_deelContext werkwoordelijk_deel() throws RecognitionException {
		Werkwoordelijk_deelContext _localctx = new Werkwoordelijk_deelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_werkwoordelijk_deel);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(27);
				match(T__6);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(28);
				match(T__7);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(29);
				match(T__8);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(30);
				match(T__9);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4"+
		"\27\n\4\3\5\3\5\3\5\5\5\34\n\5\3\6\3\6\3\6\3\6\5\6\"\n\6\3\6\2\2\7\2\4"+
		"\6\b\n\2\2\2%\2\f\3\2\2\2\4\20\3\2\2\2\6\26\3\2\2\2\b\33\3\2\2\2\n!\3"+
		"\2\2\2\f\r\5\4\3\2\r\16\5\n\6\2\16\17\5\4\3\2\17\3\3\2\2\2\20\21\5\b\5"+
		"\2\21\22\5\6\4\2\22\5\3\2\2\2\23\27\7\3\2\2\24\27\7\4\2\2\25\27\7\5\2"+
		"\2\26\23\3\2\2\2\26\24\3\2\2\2\26\25\3\2\2\2\27\7\3\2\2\2\30\34\7\6\2"+
		"\2\31\34\7\7\2\2\32\34\7\b\2\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2"+
		"\2\34\t\3\2\2\2\35\"\7\t\2\2\36\"\7\n\2\2\37\"\7\13\2\2 \"\7\f\2\2!\35"+
		"\3\2\2\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"\13\3\2\2\2\5\26\33!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}