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
		Dot=1, Add=2, Subtract=3, Slash=4, Separator=5, WhiteSpace=6, NewLine=7, 
		Zero_dwaczt=8, DZIEN=9, MIESIAC=10, ROK=11, MINUTY=12, LICZBA_DNI=13;
	public static final int
		RULE_expression = 0, RULE_operation = 1, RULE_datetime = 2, RULE_date = 3, 
		RULE_timespan = 4, RULE_dzien = 5, RULE_liczba_dni = 6, RULE_miesiac = 7, 
		RULE_rok = 8, RULE_godziny = 9, RULE_minuty = 10, RULE_sekundy = 11;
	public static final String[] ruleNames = {
		"expression", "operation", "datetime", "date", "timespan", "dzien", "liczba_dni", 
		"miesiac", "rok", "godziny", "minuty", "sekundy"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'+'", "'-'", "'/'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Dot", "Add", "Subtract", "Slash", "Separator", "WhiteSpace", "NewLine", 
		"Zero_dwaczt", "DZIEN", "MIESIAC", "ROK", "MINUTY", "LICZBA_DNI"
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
				operation(0);
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
	public static class AaaContext extends OperationContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public AaaContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class AddDateContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode Add() { return getToken(DateCalculatorParser.Add, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public DatetimeContext datetime() {
			return getRuleContext(DatetimeContext.class,0);
		}
		public AddDateContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class SubTimeSpanContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode Subtract() { return getToken(DateCalculatorParser.Subtract, 0); }
		public TimespanContext timespan() {
			return getRuleContext(TimespanContext.class,0);
		}
		public SubTimeSpanContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class AddTimeSpanContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode Add() { return getToken(DateCalculatorParser.Add, 0); }
		public TimespanContext timespan() {
			return getRuleContext(TimespanContext.class,0);
		}
		public AddTimeSpanContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class DdddContext extends OperationContext {
		public DatetimeContext datetime() {
			return getRuleContext(DatetimeContext.class,0);
		}
		public DdddContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class CcccccccContext extends OperationContext {
		public TimespanContext timespan() {
			return getRuleContext(TimespanContext.class,0);
		}
		public CcccccccContext(OperationContext ctx) { copyFrom(ctx); }
	}
	public static class SubDateContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode Subtract() { return getToken(DateCalculatorParser.Subtract, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public DatetimeContext datetime() {
			return getRuleContext(DatetimeContext.class,0);
		}
		public SubDateContext(OperationContext ctx) { copyFrom(ctx); }
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new AaaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(31);
				date();
				}
				break;
			case 2:
				{
				_localctx = new DdddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				datetime();
				}
				break;
			case 3:
				{
				_localctx = new CcccccccContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				timespan();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AddDateContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(36);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(37);
						match(Add);
						setState(41);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(38);
							date();
							}
							break;
						case 2:
							{
							setState(39);
							datetime();
							}
							break;
						case 3:
							{
							setState(40);
							operation(0);
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AddTimeSpanContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(43);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(44);
						match(Add);
						setState(47);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(45);
							timespan();
							}
							break;
						case 2:
							{
							setState(46);
							operation(0);
							}
							break;
						}
						}
						break;
					case 3:
						{
						_localctx = new SubDateContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(49);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(50);
						match(Subtract);
						setState(54);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(51);
							date();
							}
							break;
						case 2:
							{
							setState(52);
							datetime();
							}
							break;
						case 3:
							{
							setState(53);
							operation(0);
							}
							break;
						}
						}
						break;
					case 4:
						{
						_localctx = new SubTimeSpanContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(56);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(57);
						match(Subtract);
						setState(60);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(58);
							timespan();
							}
							break;
						case 2:
							{
							setState(59);
							operation(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		public MinutyContext minuty() {
			return getRuleContext(MinutyContext.class,0);
		}
		public SekundyContext sekundy() {
			return getRuleContext(SekundyContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(DateCalculatorParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(DateCalculatorParser.Separator, i);
		}
		public List<TerminalNode> Dot() { return getTokens(DateCalculatorParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(DateCalculatorParser.Dot, i);
		}
		public DatetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime; }
	}

	public final DatetimeContext datetime() throws RecognitionException {
		DatetimeContext _localctx = new DatetimeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_datetime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			date();
			setState(68);
			godziny();
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==Dot || _la==Separator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			minuty();
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==Dot || _la==Separator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
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
		public MiesiacContext miesiac() {
			return getRuleContext(MiesiacContext.class,0);
		}
		public RokContext rok() {
			return getRuleContext(RokContext.class,0);
		}
		public List<TerminalNode> Dot() { return getTokens(DateCalculatorParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(DateCalculatorParser.Dot, i);
		}
		public List<TerminalNode> Slash() { return getTokens(DateCalculatorParser.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(DateCalculatorParser.Slash, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			dzien();
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==Dot || _la==Slash) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			miesiac();
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==Dot || _la==Slash) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		public MinutyContext minuty() {
			return getRuleContext(MinutyContext.class,0);
		}
		public SekundyContext sekundy() {
			return getRuleContext(SekundyContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(DateCalculatorParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(DateCalculatorParser.Separator, i);
		}
		public List<TerminalNode> Dot() { return getTokens(DateCalculatorParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(DateCalculatorParser.Dot, i);
		}
		public Liczba_dniContext liczba_dni() {
			return getRuleContext(Liczba_dniContext.class,0);
		}
		public TimespanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timespan; }
	}

	public final TimespanContext timespan() throws RecognitionException {
		TimespanContext _localctx = new TimespanContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_timespan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(80);
				liczba_dni();
				setState(81);
				match(Dot);
				}
				break;
			}
			setState(85);
			godziny();
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==Dot || _la==Separator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(87);
			minuty();
			setState(88);
			_la = _input.LA(1);
			if ( !(_la==Dot || _la==Separator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(89);
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
			setState(91);
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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LICZBA_DNI:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(LICZBA_DNI);
				}
				break;
			case Zero_dwaczt:
			case DZIEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				dzien();
				}
				break;
			case MINUTY:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(MINUTY);
				}
				break;
			case ROK:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
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
			setState(99);
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
			setState(101);
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
			setState(103);
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
			setState(105);
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
			setState(107);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\3\3\3\3\3\3\5\3%\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\39\n\3\3\3\3\3\3\3\3\3\5\3?\n\3\7\3A\n\3\f\3\16\3D\13\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6V\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\bd\n\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\2\3\4\16\2\4\6\b\n\f\16\20\22\24\26\30\2"+
		"\6\4\2\3\3\7\7\4\2\3\3\6\6\3\2\n\13\4\2\n\13\16\16\2v\2\36\3\2\2\2\4$"+
		"\3\2\2\2\6E\3\2\2\2\bL\3\2\2\2\nU\3\2\2\2\f]\3\2\2\2\16c\3\2\2\2\20e\3"+
		"\2\2\2\22g\3\2\2\2\24i\3\2\2\2\26k\3\2\2\2\30m\3\2\2\2\32\37\5\b\5\2\33"+
		"\37\5\6\4\2\34\37\5\n\6\2\35\37\5\4\3\2\36\32\3\2\2\2\36\33\3\2\2\2\36"+
		"\34\3\2\2\2\36\35\3\2\2\2\37\3\3\2\2\2 !\b\3\1\2!%\5\b\5\2\"%\5\6\4\2"+
		"#%\5\n\6\2$ \3\2\2\2$\"\3\2\2\2$#\3\2\2\2%B\3\2\2\2&\'\f\t\2\2\'+\7\4"+
		"\2\2(,\5\b\5\2),\5\6\4\2*,\5\4\3\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,A\3\2"+
		"\2\2-.\f\b\2\2.\61\7\4\2\2/\62\5\n\6\2\60\62\5\4\3\2\61/\3\2\2\2\61\60"+
		"\3\2\2\2\62A\3\2\2\2\63\64\f\7\2\2\648\7\5\2\2\659\5\b\5\2\669\5\6\4\2"+
		"\679\5\4\3\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29A\3\2\2\2:;\f\6\2\2;"+
		">\7\5\2\2<?\5\n\6\2=?\5\4\3\2><\3\2\2\2>=\3\2\2\2?A\3\2\2\2@&\3\2\2\2"+
		"@-\3\2\2\2@\63\3\2\2\2@:\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\5\3\2"+
		"\2\2DB\3\2\2\2EF\5\b\5\2FG\5\24\13\2GH\t\2\2\2HI\5\26\f\2IJ\t\2\2\2JK"+
		"\5\30\r\2K\7\3\2\2\2LM\5\f\7\2MN\t\3\2\2NO\5\20\t\2OP\t\3\2\2PQ\5\22\n"+
		"\2Q\t\3\2\2\2RS\5\16\b\2ST\7\3\2\2TV\3\2\2\2UR\3\2\2\2UV\3\2\2\2VW\3\2"+
		"\2\2WX\5\24\13\2XY\t\2\2\2YZ\5\26\f\2Z[\t\2\2\2[\\\5\30\r\2\\\13\3\2\2"+
		"\2]^\t\4\2\2^\r\3\2\2\2_d\7\17\2\2`d\5\f\7\2ad\7\16\2\2bd\7\r\2\2c_\3"+
		"\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\17\3\2\2\2ef\7\f\2\2f\21\3\2\2\2"+
		"gh\7\r\2\2h\23\3\2\2\2ij\7\n\2\2j\25\3\2\2\2kl\t\5\2\2l\27\3\2\2\2mn\t"+
		"\5\2\2n\31\3\2\2\2\f\36$+\618>@BUc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}