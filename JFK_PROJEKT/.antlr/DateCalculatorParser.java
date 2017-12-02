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
		RULE_timespan = 4, RULE_dzien = 5, RULE_liczba_dni = 6, RULE_miesiac = 7, 
		RULE_rok = 8, RULE_godziny = 9, RULE_minuty = 10, RULE_sekundy = 11;
	public static final String[] ruleNames = {
		"expression", "operation", "datetime", "date", "timespan", "dzien", "liczba_dni", 
		"miesiac", "rok", "godziny", "minuty", "sekundy"
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
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				date();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				datetime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				timespan();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
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
	public static class DateAddTimespanContext extends OperationContext {
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
		public DateAddTimespanContext(OperationContext ctx) { copyFrom(ctx); }
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DateAddTimespanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(30);
					date();
					}
					break;
				case 2:
					{
					setState(31);
					datetime();
					}
					break;
				}
				setState(34);
				((DateAddTimespanContext)_localctx).op = match(Add);
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(35);
					timespan();
					}
					break;
				case 2:
					{
					setState(36);
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
				setState(39);
				timespan();
				setState(40);
				((TimespanAddTimespanContext)_localctx).op = match(Add);
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(41);
					timespan();
					}
					break;
				case 2:
					{
					setState(42);
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
				setState(45);
				timespan();
				setState(46);
				((TimespanAddDateContext)_localctx).op = match(Add);
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(47);
					date();
					}
					break;
				case 2:
					{
					setState(48);
					datetime();
					}
					break;
				case 3:
					{
					setState(49);
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
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(52);
					date();
					}
					break;
				case 2:
					{
					setState(53);
					datetime();
					}
					break;
				}
				setState(56);
				((DateSubTimespanContext)_localctx).op = match(Subtract);
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(57);
					timespan();
					}
					break;
				case 2:
					{
					setState(58);
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
				setState(61);
				timespan();
				setState(62);
				((TimespanSubTimespanContext)_localctx).op = match(Subtract);
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(63);
					timespan();
					}
					break;
				case 2:
					{
					setState(64);
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
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(67);
					date();
					}
					break;
				case 2:
					{
					setState(68);
					datetime();
					}
					break;
				}
				setState(71);
				((DateSubDateContext)_localctx).op = match(Subtract);
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(72);
					date();
					}
					break;
				case 2:
					{
					setState(73);
					datetime();
					}
					break;
				case 3:
					{
					setState(74);
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
				setState(77);
				match(T__0);
				setState(78);
				operation();
				setState(79);
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
			setState(83);
			date();
			setState(84);
			godziny();
			setState(85);
			match(Separator);
			setState(86);
			minuty();
			setState(87);
			match(Separator);
			setState(88);
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
			setState(90);
			dzien();
			setState(91);
			match(DOT);
			setState(92);
			miesiac();
			setState(93);
			match(DOT);
			setState(94);
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
		public Liczba_dniContext liczba_dni() {
			return getRuleContext(Liczba_dniContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DateCalculatorParser.DOT, 0); }
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(96);
				liczba_dni();
				setState(97);
				match(DOT);
				}
				break;
			}
			setState(101);
			godziny();
			setState(102);
			match(Separator);
			setState(103);
			minuty();
			setState(104);
			match(Separator);
			setState(105);
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
			setState(107);
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

	public static class Liczba_dniContext extends ParserRuleContext {
		public TerminalNode LICZBA_DNI() { return getToken(DateCalculatorParser.LICZBA_DNI, 0); }
		public DzienContext dzien() {
			return getRuleContext(DzienContext.class,0);
		}
		public TerminalNode MINUTY() { return getToken(DateCalculatorParser.MINUTY, 0); }
		public TerminalNode ROK() { return getToken(DateCalculatorParser.ROK, 0); }
		public Liczba_dniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liczba_dni; }
	}

	public final Liczba_dniContext liczba_dni() throws RecognitionException {
		Liczba_dniContext _localctx = new Liczba_dniContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_liczba_dni);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LICZBA_DNI:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(LICZBA_DNI);
				}
				break;
			case Zero_dwaczt:
			case DZIEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				dzien();
				}
				break;
			case MINUTY:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(MINUTY);
				}
				break;
			case ROK:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(ROK);
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

	public static class MiesiacContext extends ParserRuleContext {
		public TerminalNode MIESIAC() { return getToken(DateCalculatorParser.MIESIAC, 0); }
		public MiesiacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miesiac; }
	}

	public final MiesiacContext miesiac() throws RecognitionException {
		MiesiacContext _localctx = new MiesiacContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_miesiac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 16, RULE_rok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		enterRule(_localctx, 18, RULE_godziny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		public TerminalNode DZIEN() { return getToken(DateCalculatorParser.DZIEN, 0); }
		public TerminalNode MINUTY() { return getToken(DateCalculatorParser.MINUTY, 0); }
		public MinutyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minuty; }
	}

	public final MinutyContext minuty() throws RecognitionException {
		MinutyContext _localctx = new MinutyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_minuty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Zero_dwaczt) | (1L << DZIEN) | (1L << MINUTY))) != 0)) ) {
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
		public TerminalNode DZIEN() { return getToken(DateCalculatorParser.DZIEN, 0); }
		public TerminalNode MINUTY() { return getToken(DateCalculatorParser.MINUTY, 0); }
		public SekundyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sekundy; }
	}

	public final SekundyContext sekundy() throws RecognitionException {
		SekundyContext _localctx = new SekundyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sekundy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Zero_dwaczt) | (1L << DZIEN) | (1L << MINUTY))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\3\3\5\3#\n\3\3\3"+
		"\3\3\3\3\5\3(\n\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\3\3\3\5\3\65"+
		"\n\3\3\3\3\3\5\39\n\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3\5\3D\n\3\3"+
		"\3\3\3\5\3H\n\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\3\3\3\3\3\3\3\5\3T\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6f\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\bt\n\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\2\4\3\2\f\r\4\2\f\r\20\20\2\u008b\2\36\3\2\2\2\4S\3\2\2\2\6U\3\2\2\2"+
		"\b\\\3\2\2\2\ne\3\2\2\2\fm\3\2\2\2\16s\3\2\2\2\20u\3\2\2\2\22w\3\2\2\2"+
		"\24y\3\2\2\2\26{\3\2\2\2\30}\3\2\2\2\32\37\5\b\5\2\33\37\5\6\4\2\34\37"+
		"\5\n\6\2\35\37\5\4\3\2\36\32\3\2\2\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35"+
		"\3\2\2\2\37\3\3\2\2\2 #\5\b\5\2!#\5\6\4\2\" \3\2\2\2\"!\3\2\2\2#$\3\2"+
		"\2\2$\'\7\6\2\2%(\5\n\6\2&(\5\4\3\2\'%\3\2\2\2\'&\3\2\2\2(T\3\2\2\2)*"+
		"\5\n\6\2*-\7\6\2\2+.\5\n\6\2,.\5\4\3\2-+\3\2\2\2-,\3\2\2\2.T\3\2\2\2/"+
		"\60\5\n\6\2\60\64\7\6\2\2\61\65\5\b\5\2\62\65\5\6\4\2\63\65\5\4\3\2\64"+
		"\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65T\3\2\2\2\669\5\b\5\2\679\5"+
		"\6\4\28\66\3\2\2\28\67\3\2\2\29:\3\2\2\2:=\7\7\2\2;>\5\n\6\2<>\5\4\3\2"+
		"=;\3\2\2\2=<\3\2\2\2>T\3\2\2\2?@\5\n\6\2@C\7\7\2\2AD\5\n\6\2BD\5\4\3\2"+
		"CA\3\2\2\2CB\3\2\2\2DT\3\2\2\2EH\5\b\5\2FH\5\6\4\2GE\3\2\2\2GF\3\2\2\2"+
		"HI\3\2\2\2IM\7\7\2\2JN\5\b\5\2KN\5\6\4\2LN\5\4\3\2MJ\3\2\2\2MK\3\2\2\2"+
		"ML\3\2\2\2NT\3\2\2\2OP\7\3\2\2PQ\5\4\3\2QR\7\4\2\2RT\3\2\2\2S\"\3\2\2"+
		"\2S)\3\2\2\2S/\3\2\2\2S8\3\2\2\2S?\3\2\2\2SG\3\2\2\2SO\3\2\2\2T\5\3\2"+
		"\2\2UV\5\b\5\2VW\5\24\13\2WX\7\t\2\2XY\5\26\f\2YZ\7\t\2\2Z[\5\30\r\2["+
		"\7\3\2\2\2\\]\5\f\7\2]^\7\5\2\2^_\5\20\t\2_`\7\5\2\2`a\5\22\n\2a\t\3\2"+
		"\2\2bc\5\16\b\2cd\7\5\2\2df\3\2\2\2eb\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\5"+
		"\24\13\2hi\7\t\2\2ij\5\26\f\2jk\7\t\2\2kl\5\30\r\2l\13\3\2\2\2mn\t\2\2"+
		"\2n\r\3\2\2\2ot\7\21\2\2pt\5\f\7\2qt\7\20\2\2rt\7\17\2\2so\3\2\2\2sp\3"+
		"\2\2\2sq\3\2\2\2sr\3\2\2\2t\17\3\2\2\2uv\7\16\2\2v\21\3\2\2\2wx\7\17\2"+
		"\2x\23\3\2\2\2yz\7\f\2\2z\25\3\2\2\2{|\t\3\2\2|\27\3\2\2\2}~\t\3\2\2~"+
		"\31\3\2\2\2\17\36\"\'-\648=CGMSes";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}