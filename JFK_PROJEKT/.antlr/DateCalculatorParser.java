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
		NewLine=9, Zero_dwaczt=10, DZIEN=11, MIESIAC=12, ROK=13, MINUTY=14, LICZBA_DNI=15;
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
		"NewLine", "Zero_dwaczt", "DZIEN", "MIESIAC", "ROK", "MINUTY", "LICZBA_DNI"
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
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimespanAddTimespanContext extends OperationContext {
		public Token op;
		public List<TimespanContext> timespan() {
			return getRuleContexts(TimespanContext.class);
		}
		public TimespanContext timespan(int i) {
			return getRuleContext(TimespanContext.class,i);
		}
		public TerminalNode Add() { return getToken(DateCalculatorParser.Add, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TimespanAddTimespanContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class TimespanAddDateContext extends OperationContext {
		public Token op;
		public TimespanContext timespan() {
			return getRuleContext(TimespanContext.class,0);
		}
		public TerminalNode Add() { return getToken(DateCalculatorParser.Add, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public DatetimeContext datetime() {
			return getRuleContext(DatetimeContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TimespanAddDateContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class DateSubDateContext extends OperationContext {
		public Token op;
		public TerminalNode Subtract() { return getToken(DateCalculatorParser.Subtract, 0); }
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
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public DateSubDateContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class DateSubTimespanContext extends OperationContext {
		public Token op;
		public TerminalNode Subtract() { return getToken(DateCalculatorParser.Subtract, 0); }
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
		public DateSubTimespanContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class OperContext extends OperationContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class DateAddTiemspanContext extends OperationContext {
		public Token op;
		public TerminalNode Add() { return getToken(DateCalculatorParser.Add, 0); }
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
		public DateAddTiemspanContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class TimespanSubTimespanContext extends OperationContext {
		public Token op;
		public List<TimespanContext> timespan() {
			return getRuleContexts(TimespanContext.class);
		}
		public TimespanContext timespan(int i) {
			return getRuleContext(TimespanContext.class,i);
		}
		public TerminalNode Subtract() { return getToken(DateCalculatorParser.Subtract, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TimespanSubTimespanContext(OperationContext ctx) { copyFrom(ctx); }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DateAddTiemspanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
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
				}
				setState(32);
				((DateAddTiemspanContext)_localctx).op = match(Add);
				setState(35);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(33);
					timespan();
					}
					break;
				case 2:
					{
					setState(34);
					operation();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new TimespanAddTimespanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				timespan();
				setState(38);
				((TimespanAddTimespanContext)_localctx).op = match(Add);
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(39);
					timespan();
					}
					break;
				case 2:
					{
					setState(40);
					operation();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new TimespanAddDateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				timespan();
				setState(44);
				((TimespanAddDateContext)_localctx).op = match(Add);
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
					operation();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new DateSubTimespanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(50);
					date();
					}
					break;
				case 2:
					{
					setState(51);
					datetime();
					}
					break;
				}
				setState(54);
				((DateSubTimespanContext)_localctx).op = match(Subtract);
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(55);
					timespan();
					}
					break;
				case 2:
					{
					setState(56);
					operation();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new TimespanSubTimespanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				timespan();
				setState(60);
				((TimespanSubTimespanContext)_localctx).op = match(Subtract);
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(61);
					timespan();
					}
					break;
				case 2:
					{
					setState(62);
					operation();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new DateSubDateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(65);
					date();
					}
					break;
				case 2:
					{
					setState(66);
					datetime();
					}
					break;
				}
				setState(69);
				((DateSubDateContext)_localctx).op = match(Subtract);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(70);
					date();
					}
					break;
				case 2:
					{
					setState(71);
					datetime();
					}
					break;
				case 3:
					{
					setState(72);
					operation();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new OperContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				match(T__0);
				setState(76);
				operation();
				setState(77);
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
			setState(81);
			date();
			setState(82);
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
			setState(84);
			dzien();
			setState(85);
			match(DOT);
			setState(86);
			miesiac();
			setState(87);
			match(DOT);
			setState(88);
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
			setState(90);
			godziny();
			setState(91);
			match(Separator);
			setState(92);
			minuty();
			setState(93);
			match(Separator);
			setState(94);
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
			setState(96);
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
			setState(98);
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
			setState(100);
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
			setState(102);
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
			setState(104);
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
			setState(106);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\5\3!\n\3\3\3\3\3\3\3\5\3&\n"+
		"\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3\3\3\3\5\3"+
		"\67\n\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\3\3\3\5\3F\n\3"+
		"\3\3\3\3\3\3\3\3\5\3L\n\3\3\3\3\3\3\3\3\3\5\3R\n\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\f\r"+
		"\4\2\f\f\20\20\2w\2\34\3\2\2\2\4Q\3\2\2\2\6S\3\2\2\2\bV\3\2\2\2\n\\\3"+
		"\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20f\3\2\2\2\22h\3\2\2\2\24j\3\2\2\2\26l"+
		"\3\2\2\2\30\35\5\b\5\2\31\35\5\6\4\2\32\35\5\n\6\2\33\35\5\4\3\2\34\30"+
		"\3\2\2\2\34\31\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35\3\3\2\2\2\36!\5"+
		"\b\5\2\37!\5\6\4\2 \36\3\2\2\2 \37\3\2\2\2!\"\3\2\2\2\"%\7\6\2\2#&\5\n"+
		"\6\2$&\5\4\3\2%#\3\2\2\2%$\3\2\2\2&R\3\2\2\2\'(\5\n\6\2(+\7\6\2\2),\5"+
		"\n\6\2*,\5\4\3\2+)\3\2\2\2+*\3\2\2\2,R\3\2\2\2-.\5\n\6\2.\62\7\6\2\2/"+
		"\63\5\b\5\2\60\63\5\6\4\2\61\63\5\4\3\2\62/\3\2\2\2\62\60\3\2\2\2\62\61"+
		"\3\2\2\2\63R\3\2\2\2\64\67\5\b\5\2\65\67\5\6\4\2\66\64\3\2\2\2\66\65\3"+
		"\2\2\2\678\3\2\2\28;\7\7\2\29<\5\n\6\2:<\5\4\3\2;9\3\2\2\2;:\3\2\2\2<"+
		"R\3\2\2\2=>\5\n\6\2>A\7\7\2\2?B\5\n\6\2@B\5\4\3\2A?\3\2\2\2A@\3\2\2\2"+
		"BR\3\2\2\2CF\5\b\5\2DF\5\6\4\2EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GK\7\7\2\2"+
		"HL\5\b\5\2IL\5\6\4\2JL\5\4\3\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LR\3\2\2\2"+
		"MN\7\3\2\2NO\5\4\3\2OP\7\4\2\2PR\3\2\2\2Q \3\2\2\2Q\'\3\2\2\2Q-\3\2\2"+
		"\2Q\66\3\2\2\2Q=\3\2\2\2QE\3\2\2\2QM\3\2\2\2R\5\3\2\2\2ST\5\b\5\2TU\5"+
		"\n\6\2U\7\3\2\2\2VW\5\f\7\2WX\7\5\2\2XY\5\16\b\2YZ\7\5\2\2Z[\5\20\t\2"+
		"[\t\3\2\2\2\\]\5\22\n\2]^\7\t\2\2^_\5\24\13\2_`\7\t\2\2`a\5\26\f\2a\13"+
		"\3\2\2\2bc\t\2\2\2c\r\3\2\2\2de\7\16\2\2e\17\3\2\2\2fg\7\17\2\2g\21\3"+
		"\2\2\2hi\7\f\2\2i\23\3\2\2\2jk\t\3\2\2k\25\3\2\2\2lm\t\3\2\2m\27\3\2\2"+
		"\2\r\34 %+\62\66;AEKQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}