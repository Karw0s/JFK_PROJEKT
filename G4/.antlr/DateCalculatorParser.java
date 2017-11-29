// Generated from c:\Users\Karwos\Documents\Visual Studio 2015\Projects\JFK_PROJEKT\JFK_PROJEKT\G4\DateCalculator.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, Add=3, Subtract=4, WhiteSpace=5, NewLine=6, Date=7, Timespan=8;
	public static final int
		RULE_datetime = 0, RULE_timespan = 1, RULE_date = 2, RULE_dates = 3, RULE_operation = 4, 
		RULE_expression = 5;
	public static final String[] ruleNames = {
		"datetime", "timespan", "date", "dates", "operation", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Add", "Subtract", "WhiteSpace", "NewLine", "Date", 
		"Timespan"
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
	public static class DatetimeContext extends ParserRuleContext {
		public TerminalNode Date() { return getToken(DateCalculatorParser.Date, 0); }
		public TerminalNode Timespan() { return getToken(DateCalculatorParser.Timespan, 0); }
		public DatetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime; }
	}

	public final DatetimeContext datetime() throws RecognitionException {
		DatetimeContext _localctx = new DatetimeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_datetime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(Date);
			setState(13);
			match(Timespan);
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
		public TerminalNode Timespan() { return getToken(DateCalculatorParser.Timespan, 0); }
		public TimespanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timespan; }
	}

	public final TimespanContext timespan() throws RecognitionException {
		TimespanContext _localctx = new TimespanContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_timespan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(Timespan);
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
		public TerminalNode Date() { return getToken(DateCalculatorParser.Date, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(Date);
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

	public static class DatesContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public DatetimeContext datetime() {
			return getRuleContext(DatetimeContext.class,0);
		}
		public DatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dates; }
	}

	public final DatesContext dates() throws RecognitionException {
		DatesContext _localctx = new DatesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dates);
		try {
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				date();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				datetime();
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
		public TerminalNode Add() { return getToken(DateCalculatorParser.Add, 0); }
		public TerminalNode Subtract() { return getToken(DateCalculatorParser.Subtract, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operation);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(23);
					date();
					}
					break;
				case 2:
					{
					setState(24);
					datetime();
					}
					break;
				case 3:
					{
					setState(25);
					timespan();
					}
					break;
				}
				setState(28);
				((OperationContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Subtract) ) {
					((OperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(29);
					timespan();
					}
					break;
				case 2:
					{
					setState(30);
					operation();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(33);
					date();
					}
					break;
				case 2:
					{
					setState(34);
					datetime();
					}
					break;
				}
				setState(37);
				match(Subtract);
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
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
					operation();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				timespan();
				setState(44);
				match(Add);
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
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
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(T__0);
				setState(51);
				operation();
				setState(52);
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

	public static class ExpressionContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public DatetimeContext datetime() {
			return getRuleContext(DatetimeContext.class,0);
		}
		public TimespanContext timespan() {
			return getRuleContext(TimespanContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				date();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				datetime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				timespan();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\nA\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\5\5\30\n\5\3\6\3\6\3\6\5\6\35\n\6\3\6\3\6\3\6\5\6\"\n\6\3\6\3\6\5\6&"+
		"\n\6\3\6\3\6\3\6\3\6\5\6,\n\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3\6\3\6\3"+
		"\6\3\6\5\69\n\6\3\7\3\7\3\7\3\7\5\7?\n\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2"+
		"\5\6\2I\2\16\3\2\2\2\4\21\3\2\2\2\6\23\3\2\2\2\b\27\3\2\2\2\n8\3\2\2\2"+
		"\f>\3\2\2\2\16\17\7\t\2\2\17\20\7\n\2\2\20\3\3\2\2\2\21\22\7\n\2\2\22"+
		"\5\3\2\2\2\23\24\7\t\2\2\24\7\3\2\2\2\25\30\5\6\4\2\26\30\5\2\2\2\27\25"+
		"\3\2\2\2\27\26\3\2\2\2\30\t\3\2\2\2\31\35\5\6\4\2\32\35\5\2\2\2\33\35"+
		"\5\4\3\2\34\31\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36!\t"+
		"\2\2\2\37\"\5\4\3\2 \"\5\n\6\2!\37\3\2\2\2! \3\2\2\2\"9\3\2\2\2#&\5\6"+
		"\4\2$&\5\2\2\2%#\3\2\2\2%$\3\2\2\2&\'\3\2\2\2\'+\7\6\2\2(,\5\6\4\2),\5"+
		"\2\2\2*,\5\n\6\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,9\3\2\2\2-.\5\4\3\2.\62"+
		"\7\5\2\2/\63\5\6\4\2\60\63\5\2\2\2\61\63\5\n\6\2\62/\3\2\2\2\62\60\3\2"+
		"\2\2\62\61\3\2\2\2\639\3\2\2\2\64\65\7\3\2\2\65\66\5\n\6\2\66\67\7\4\2"+
		"\2\679\3\2\2\28\34\3\2\2\28%\3\2\2\28-\3\2\2\28\64\3\2\2\29\13\3\2\2\2"+
		":?\5\n\6\2;?\5\6\4\2<?\5\2\2\2=?\5\4\3\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2"+
		">=\3\2\2\2?\r\3\2\2\2\n\27\34!%+\628>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}