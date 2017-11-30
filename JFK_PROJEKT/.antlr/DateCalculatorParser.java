// Generated from c:\Users\Karwos\Documents\Visual Studio 2015\Projects\JFK_PROJEKT\JFK_PROJEKT\DateCalculator.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DOT=3, Add=4, Subtract=5, Slash=6, Separator=7, WhiteSpace=8, 
		NewLine=9, Zero_dwaczt=10, DZIEN=11, MIESIAC=12, ROK=13, MINUTY=14;
	public static final int
		RULE_expression = 0, RULE_operation = 1, RULE_datetime = 2, RULE_date = 3, 
		RULE_timespan = 4, RULE_dzien = 5, RULE_miesiac = 6, RULE_rok = 7, RULE_godziny = 8, 
		RULE_minuty = 9, RULE_sekundy = 10;
	public static final String[] ruleNames = {
		"expression", "operation", "datetime", "date", "timespan", "dzien", "miesiac", 
		"rok", "godziny", "minuty", "sekundy"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'.'", "'+'", "'-'", "'/'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "DOT", "Add", "Subtract", "Slash", "Separator", "WhiteSpace", 
		"NewLine", "Zero_dwaczt", "DZIEN", "MIESIAC", "ROK", "MINUTY"
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
	public String getGrammarFileName() { return "DateCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DateCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public DatetimeContext datetime() {
			return getRuleContext(DatetimeContext.class,0);
		}
		public TimespanContext timespan() {
			return getRuleContext(TimespanContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				date();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				datetime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				timespan();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				operation();
				}
				break;
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

	public static class OperationContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Add() { return getToken(DateCalculatorParser.Add, 0); }
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<DatetimeContext> datetime() {
			return getRuleContexts(DatetimeContext.class);
		}
		public DatetimeContext datetime(int i) {
			return getRuleContext(DatetimeContext.class,i);
		}
		public List<TimespanContext> timespan() {
			return getRuleContexts(TimespanContext.class);
		}
		public TimespanContext timespan(int i) {
			return getRuleContext(TimespanContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode Subtract() { return getToken(DateCalculatorParser.Subtract, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(28);
					date();
					}
					break;
				case 2:
					{
					setState(29);
					datetime();
					}
					break;
				case 3:
					{
					setState(30);
					timespan();
					}
					break;
				}
				setState(33);
				((OperationContext)_localctx).op = match(Add);
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(34);
					timespan();
					}
					break;
				case 2:
					{
					setState(35);
					operation();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				timespan();
				setState(39);
				((OperationContext)_localctx).op = match(Add);
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(40);
					date();
					}
					break;
				case 2:
					{
					setState(41);
					datetime();
					}
					break;
				case 3:
					{
					setState(42);
					operation();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(45);
					date();
					}
					break;
				case 2:
					{
					setState(46);
					datetime();
					}
					break;
				case 3:
					{
					setState(47);
					timespan();
					}
					break;
				}
				setState(50);
				((OperationContext)_localctx).op = match(Subtract);
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(51);
					timespan();
					}
					break;
				case 2:
					{
					setState(52);
					operation();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(55);
					date();
					}
					break;
				case 2:
					{
					setState(56);
					datetime();
					}
					break;
				}
				setState(59);
				((OperationContext)_localctx).op = match(Subtract);
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(60);
					date();
					}
					break;
				case 2:
					{
					setState(61);
					datetime();
					}
					break;
				case 3:
					{
					setState(62);
					operation();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(T__0);
				setState(66);
				operation();
				setState(67);
				match(T__1);
				}
				break;
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

	public static class DatetimeContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimespanContext timespan() {
			return getRuleContext(TimespanContext.class,0);
		}
		public DatetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime; }
	}

	public final DatetimeContext datetime() throws RecognitionException {
		DatetimeContext _localctx = new DatetimeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_datetime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			date();
			setState(72);
			timespan();
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

	public static class DateContext extends ParserRuleContext {
		public DzienContext dzien() {
			return getRuleContext(DzienContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(DateCalculatorParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DateCalculatorParser.DOT, i);
		}
		public MiesiacContext miesiac() {
			return getRuleContext(MiesiacContext.class,0);
		}
		public RokContext rok() {
			return getRuleContext(RokContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			dzien();
			setState(75);
			match(DOT);
			setState(76);
			miesiac();
			setState(77);
			match(DOT);
			setState(78);
			rok();
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

	public static class TimespanContext extends ParserRuleContext {
		public GodzinyContext godziny() {
			return getRuleContext(GodzinyContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(DateCalculatorParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(DateCalculatorParser.Separator, i);
		}
		public MinutyContext minuty() {
			return getRuleContext(MinutyContext.class,0);
		}
		public SekundyContext sekundy() {
			return getRuleContext(SekundyContext.class,0);
		}
		public TimespanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timespan; }
	}

	public final TimespanContext timespan() throws RecognitionException {
		TimespanContext _localctx = new TimespanContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_timespan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			godziny();
			setState(81);
			match(Separator);
			setState(82);
			minuty();
			setState(83);
			match(Separator);
			setState(84);
			sekundy();
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

	public static class DzienContext extends ParserRuleContext {
		public TerminalNode DZIEN() { return getToken(DateCalculatorParser.DZIEN, 0); }
		public TerminalNode Zero_dwaczt() { return getToken(DateCalculatorParser.Zero_dwaczt, 0); }
		public DzienContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dzien; }
	}

	public final DzienContext dzien() throws RecognitionException {
		DzienContext _localctx = new DzienContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dzien);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==Zero_dwaczt || _la==DZIEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class MiesiacContext extends ParserRuleContext {
		public TerminalNode MIESIAC() { return getToken(DateCalculatorParser.MIESIAC, 0); }
		public MiesiacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miesiac; }
	}

	public final MiesiacContext miesiac() throws RecognitionException {
		MiesiacContext _localctx = new MiesiacContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_miesiac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(MIESIAC);
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

	public static class RokContext extends ParserRuleContext {
		public TerminalNode ROK() { return getToken(DateCalculatorParser.ROK, 0); }
		public RokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rok; }
	}

	public final RokContext rok() throws RecognitionException {
		RokContext _localctx = new RokContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ROK);
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

	public static class GodzinyContext extends ParserRuleContext {
		public TerminalNode Zero_dwaczt() { return getToken(DateCalculatorParser.Zero_dwaczt, 0); }
		public GodzinyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_godziny; }
	}

	public final GodzinyContext godziny() throws RecognitionException {
		GodzinyContext _localctx = new GodzinyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_godziny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(Zero_dwaczt);
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

	public static class MinutyContext extends ParserRuleContext {
		public TerminalNode Zero_dwaczt() { return getToken(DateCalculatorParser.Zero_dwaczt, 0); }
		public TerminalNode MINUTY() { return getToken(DateCalculatorParser.MINUTY, 0); }
		public MinutyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minuty; }
	}

	public final MinutyContext minuty() throws RecognitionException {
		MinutyContext _localctx = new MinutyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_minuty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==Zero_dwaczt || _la==MINUTY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class SekundyContext extends ParserRuleContext {
		public TerminalNode Zero_dwaczt() { return getToken(DateCalculatorParser.Zero_dwaczt, 0); }
		public TerminalNode MINUTY() { return getToken(DateCalculatorParser.MINUTY, 0); }
		public SekundyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sekundy; }
	}

	public final SekundyContext sekundy() throws RecognitionException {
		SekundyContext _localctx = new SekundyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sekundy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==Zero_dwaczt || _la==MINUTY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\3\3\5"+
		"\3\'\n\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\5\3\63\n\3\3\3\3\3\3"+
		"\3\5\38\n\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\3\3\3\3\3\3\3"+
		"\5\3H\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n"+
		"\f\16\20\22\24\26\2\4\3\2\f\r\4\2\f\f\20\20\2k\2\34\3\2\2\2\4G\3\2\2\2"+
		"\6I\3\2\2\2\bL\3\2\2\2\nR\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20\\\3\2\2\2"+
		"\22^\3\2\2\2\24`\3\2\2\2\26b\3\2\2\2\30\35\5\b\5\2\31\35\5\6\4\2\32\35"+
		"\5\n\6\2\33\35\5\4\3\2\34\30\3\2\2\2\34\31\3\2\2\2\34\32\3\2\2\2\34\33"+
		"\3\2\2\2\35\3\3\2\2\2\36\"\5\b\5\2\37\"\5\6\4\2 \"\5\n\6\2!\36\3\2\2\2"+
		"!\37\3\2\2\2! \3\2\2\2\"#\3\2\2\2#&\7\6\2\2$\'\5\n\6\2%\'\5\4\3\2&$\3"+
		"\2\2\2&%\3\2\2\2\'H\3\2\2\2()\5\n\6\2)-\7\6\2\2*.\5\b\5\2+.\5\6\4\2,."+
		"\5\4\3\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.H\3\2\2\2/\63\5\b\5\2\60\63\5\6"+
		"\4\2\61\63\5\n\6\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\64\3\2\2"+
		"\2\64\67\7\7\2\2\658\5\n\6\2\668\5\4\3\2\67\65\3\2\2\2\67\66\3\2\2\28"+
		"H\3\2\2\29<\5\b\5\2:<\5\6\4\2;9\3\2\2\2;:\3\2\2\2<=\3\2\2\2=A\7\7\2\2"+
		">B\5\b\5\2?B\5\6\4\2@B\5\4\3\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2BH\3\2\2\2"+
		"CD\7\3\2\2DE\5\4\3\2EF\7\4\2\2FH\3\2\2\2G!\3\2\2\2G(\3\2\2\2G\62\3\2\2"+
		"\2G;\3\2\2\2GC\3\2\2\2H\5\3\2\2\2IJ\5\b\5\2JK\5\n\6\2K\7\3\2\2\2LM\5\f"+
		"\7\2MN\7\5\2\2NO\5\16\b\2OP\7\5\2\2PQ\5\20\t\2Q\t\3\2\2\2RS\5\22\n\2S"+
		"T\7\t\2\2TU\5\24\13\2UV\7\t\2\2VW\5\26\f\2W\13\3\2\2\2XY\t\2\2\2Y\r\3"+
		"\2\2\2Z[\7\16\2\2[\17\3\2\2\2\\]\7\17\2\2]\21\3\2\2\2^_\7\f\2\2_\23\3"+
		"\2\2\2`a\t\3\2\2a\25\3\2\2\2bc\t\3\2\2c\27\3\2\2\2\13\34!&-\62\67;AG";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}