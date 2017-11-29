//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.6.5-SNAPSHOT
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from C:\Users\Karwos\Documents\Visual Studio 2015\Projects\JFK_PROJEKT\JFK_PROJEKT\DateCalculator.g4 by ANTLR 4.6.5-SNAPSHOT

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace JFK_PROJEKT {
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System.Collections.Generic;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.6.5-SNAPSHOT")]
[System.CLSCompliant(false)]
public partial class DateCalculatorParser : Parser {
	public const int
		T__0=1, T__1=2, Add=3, Subtract=4, WhiteSpace=5, NewLine=6, Date=7, Timespan=8;
	public const int
		RULE_datetime = 0, RULE_timespan = 1, RULE_date = 2, RULE_dates = 3, RULE_operation = 4, 
		RULE_expression = 5;
	public static readonly string[] ruleNames = {
		"datetime", "timespan", "date", "dates", "operation", "expression"
	};

	private static readonly string[] _LiteralNames = {
		null, "'('", "')'", "'+'", "'-'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, "Add", "Subtract", "WhiteSpace", "NewLine", "Date", 
		"Timespan"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[System.Obsolete("Use Vocabulary instead.")]
	public static readonly string[] tokenNames = GenerateTokenNames(DefaultVocabulary, _SymbolicNames.Length);

	private static string[] GenerateTokenNames(IVocabulary vocabulary, int length) {
		string[] tokenNames = new string[length];
		for (int i = 0; i < tokenNames.Length; i++) {
			tokenNames[i] = vocabulary.GetLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = vocabulary.GetSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}

		return tokenNames;
	}

	[System.Obsolete("Use IRecognizer.Vocabulary instead.")]
	public override string[] TokenNames
	{
		get
		{
			return tokenNames;
		}
	}

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "DateCalculator.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string SerializedAtn { get { return _serializedATN; } }

	public DateCalculatorParser(ITokenStream input)
		: base(input)
	{
		_interp = new ParserATNSimulator(this,_ATN);
	}
	public partial class DatetimeContext : ParserRuleContext {
		public ITerminalNode Date() { return GetToken(DateCalculatorParser.Date, 0); }
		public ITerminalNode Timespan() { return GetToken(DateCalculatorParser.Timespan, 0); }
		public DatetimeContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_datetime; } }
		public override void EnterRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.EnterDatetime(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.ExitDatetime(this);
		}
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			IDateCalculatorVisitor<TResult> typedVisitor = visitor as IDateCalculatorVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitDatetime(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public DatetimeContext datetime() {
		DatetimeContext _localctx = new DatetimeContext(_ctx, State);
		EnterRule(_localctx, 0, RULE_datetime);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 12; Match(Date);
			State = 13; Match(Timespan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.ReportError(this, re);
			_errHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class TimespanContext : ParserRuleContext {
		public ITerminalNode Timespan() { return GetToken(DateCalculatorParser.Timespan, 0); }
		public TimespanContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_timespan; } }
		public override void EnterRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.EnterTimespan(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.ExitTimespan(this);
		}
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			IDateCalculatorVisitor<TResult> typedVisitor = visitor as IDateCalculatorVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitTimespan(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public TimespanContext timespan() {
		TimespanContext _localctx = new TimespanContext(_ctx, State);
		EnterRule(_localctx, 2, RULE_timespan);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 15; Match(Timespan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.ReportError(this, re);
			_errHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class DateContext : ParserRuleContext {
		public ITerminalNode Date() { return GetToken(DateCalculatorParser.Date, 0); }
		public DateContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_date; } }
		public override void EnterRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.EnterDate(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.ExitDate(this);
		}
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			IDateCalculatorVisitor<TResult> typedVisitor = visitor as IDateCalculatorVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitDate(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public DateContext date() {
		DateContext _localctx = new DateContext(_ctx, State);
		EnterRule(_localctx, 4, RULE_date);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 17; Match(Date);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.ReportError(this, re);
			_errHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class DatesContext : ParserRuleContext {
		public DateContext date() {
			return GetRuleContext<DateContext>(0);
		}
		public DatetimeContext datetime() {
			return GetRuleContext<DatetimeContext>(0);
		}
		public DatesContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_dates; } }
		public override void EnterRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.EnterDates(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.ExitDates(this);
		}
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			IDateCalculatorVisitor<TResult> typedVisitor = visitor as IDateCalculatorVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitDates(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public DatesContext dates() {
		DatesContext _localctx = new DatesContext(_ctx, State);
		EnterRule(_localctx, 6, RULE_dates);
		try {
			State = 21;
			_errHandler.Sync(this);
			switch ( Interpreter.AdaptivePredict(_input,0,_ctx) ) {
			case 1:
				EnterOuterAlt(_localctx, 1);
				{
				State = 19; date();
				}
				break;

			case 2:
				EnterOuterAlt(_localctx, 2);
				{
				State = 20; datetime();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.ReportError(this, re);
			_errHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class OperationContext : ParserRuleContext {
		public IToken op;
		public OperationContext operation() {
			return GetRuleContext<OperationContext>(0);
		}
		public ITerminalNode Subtract() { return GetToken(DateCalculatorParser.Subtract, 0); }
		public DateContext[] date() {
			return GetRuleContexts<DateContext>();
		}
		public DateContext date(int i) {
			return GetRuleContext<DateContext>(i);
		}
		public DatetimeContext[] datetime() {
			return GetRuleContexts<DatetimeContext>();
		}
		public DatetimeContext datetime(int i) {
			return GetRuleContext<DatetimeContext>(i);
		}
		public TimespanContext[] timespan() {
			return GetRuleContexts<TimespanContext>();
		}
		public TimespanContext timespan(int i) {
			return GetRuleContext<TimespanContext>(i);
		}
		public ITerminalNode Add() { return GetToken(DateCalculatorParser.Add, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_operation; } }
		public override void EnterRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.EnterOperation(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.ExitOperation(this);
		}
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			IDateCalculatorVisitor<TResult> typedVisitor = visitor as IDateCalculatorVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitOperation(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public OperationContext operation() {
		OperationContext _localctx = new OperationContext(_ctx, State);
		EnterRule(_localctx, 8, RULE_operation);
		int _la;
		try {
			State = 54;
			_errHandler.Sync(this);
			switch ( Interpreter.AdaptivePredict(_input,6,_ctx) ) {
			case 1:
				EnterOuterAlt(_localctx, 1);
				{
				State = 23; Match(T__0);
				State = 24; operation();
				State = 25; Match(T__1);
				}
				break;

			case 2:
				EnterOuterAlt(_localctx, 2);
				{
				State = 29;
				_errHandler.Sync(this);
				switch ( Interpreter.AdaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					State = 27; date();
					}
					break;

				case 2:
					{
					State = 28; datetime();
					}
					break;
				}
				State = 31; Match(Subtract);
				State = 35;
				_errHandler.Sync(this);
				switch ( Interpreter.AdaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					State = 32; date();
					}
					break;

				case 2:
					{
					State = 33; datetime();
					}
					break;

				case 3:
					{
					State = 34; operation();
					}
					break;
				}
				}
				break;

			case 3:
				EnterOuterAlt(_localctx, 3);
				{
				State = 40;
				_errHandler.Sync(this);
				switch ( Interpreter.AdaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					State = 37; date();
					}
					break;

				case 2:
					{
					State = 38; datetime();
					}
					break;

				case 3:
					{
					State = 39; timespan();
					}
					break;
				}
				State = 42;
				_localctx.op = _input.Lt(1);
				_la = _input.La(1);
				if ( !(_la==Add || _la==Subtract) ) {
					_localctx.op = _errHandler.RecoverInline(this);
				} else {
					if (_input.La(1) == TokenConstants.Eof) {
						matchedEOF = true;
					}

					_errHandler.ReportMatch(this);
					Consume();
				}
				State = 45;
				_errHandler.Sync(this);
				switch ( Interpreter.AdaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					State = 43; timespan();
					}
					break;

				case 2:
					{
					State = 44; operation();
					}
					break;
				}
				}
				break;

			case 4:
				EnterOuterAlt(_localctx, 4);
				{
				State = 47; timespan();
				State = 48; Match(Add);
				State = 52;
				_errHandler.Sync(this);
				switch ( Interpreter.AdaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					State = 49; date();
					}
					break;

				case 2:
					{
					State = 50; datetime();
					}
					break;

				case 3:
					{
					State = 51; operation();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.ReportError(this, re);
			_errHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class ExpressionContext : ParserRuleContext {
		public DateContext date() {
			return GetRuleContext<DateContext>(0);
		}
		public DatetimeContext datetime() {
			return GetRuleContext<DatetimeContext>(0);
		}
		public TimespanContext timespan() {
			return GetRuleContext<TimespanContext>(0);
		}
		public OperationContext operation() {
			return GetRuleContext<OperationContext>(0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_expression; } }
		public override void EnterRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.EnterExpression(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IDateCalculatorListener typedListener = listener as IDateCalculatorListener;
			if (typedListener != null) typedListener.ExitExpression(this);
		}
		public override TResult Accept<TResult>(IParseTreeVisitor<TResult> visitor) {
			IDateCalculatorVisitor<TResult> typedVisitor = visitor as IDateCalculatorVisitor<TResult>;
			if (typedVisitor != null) return typedVisitor.VisitExpression(this);
			else return visitor.VisitChildren(this);
		}
	}

	[RuleVersion(0)]
	public ExpressionContext expression() {
		ExpressionContext _localctx = new ExpressionContext(_ctx, State);
		EnterRule(_localctx, 10, RULE_expression);
		try {
			State = 61;
			_errHandler.Sync(this);
			switch ( Interpreter.AdaptivePredict(_input,7,_ctx) ) {
			case 1:
				EnterOuterAlt(_localctx, 1);
				{
				}
				break;

			case 2:
				EnterOuterAlt(_localctx, 2);
				{
				State = 57; date();
				}
				break;

			case 3:
				EnterOuterAlt(_localctx, 3);
				{
				State = 58; datetime();
				}
				break;

			case 4:
				EnterOuterAlt(_localctx, 4);
				{
				State = 59; timespan();
				}
				break;

			case 5:
				EnterOuterAlt(_localctx, 5);
				{
				State = 60; operation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.ReportError(this, re);
			_errHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public static readonly string _serializedATN =
		"\x3\xAF6F\x8320\x479D\xB75C\x4880\x1605\x191C\xAB37\x3\n\x42\x4\x2\t\x2"+
		"\x4\x3\t\x3\x4\x4\t\x4\x4\x5\t\x5\x4\x6\t\x6\x4\a\t\a\x3\x2\x3\x2\x3\x2"+
		"\x3\x3\x3\x3\x3\x4\x3\x4\x3\x5\x3\x5\x5\x5\x18\n\x5\x3\x6\x3\x6\x3\x6"+
		"\x3\x6\x3\x6\x3\x6\x5\x6 \n\x6\x3\x6\x3\x6\x3\x6\x3\x6\x5\x6&\n\x6\x3"+
		"\x6\x3\x6\x3\x6\x5\x6+\n\x6\x3\x6\x3\x6\x3\x6\x5\x6\x30\n\x6\x3\x6\x3"+
		"\x6\x3\x6\x3\x6\x3\x6\x5\x6\x37\n\x6\x5\x6\x39\n\x6\x3\a\x3\a\x3\a\x3"+
		"\a\x3\a\x5\a@\n\a\x3\a\x2\x2\x2\b\x2\x2\x4\x2\x6\x2\b\x2\n\x2\f\x2\x2"+
		"\x3\x3\x2\x5\x6K\x2\xE\x3\x2\x2\x2\x4\x11\x3\x2\x2\x2\x6\x13\x3\x2\x2"+
		"\x2\b\x17\x3\x2\x2\x2\n\x38\x3\x2\x2\x2\f?\x3\x2\x2\x2\xE\xF\a\t\x2\x2"+
		"\xF\x10\a\n\x2\x2\x10\x3\x3\x2\x2\x2\x11\x12\a\n\x2\x2\x12\x5\x3\x2\x2"+
		"\x2\x13\x14\a\t\x2\x2\x14\a\x3\x2\x2\x2\x15\x18\x5\x6\x4\x2\x16\x18\x5"+
		"\x2\x2\x2\x17\x15\x3\x2\x2\x2\x17\x16\x3\x2\x2\x2\x18\t\x3\x2\x2\x2\x19"+
		"\x1A\a\x3\x2\x2\x1A\x1B\x5\n\x6\x2\x1B\x1C\a\x4\x2\x2\x1C\x39\x3\x2\x2"+
		"\x2\x1D \x5\x6\x4\x2\x1E \x5\x2\x2\x2\x1F\x1D\x3\x2\x2\x2\x1F\x1E\x3\x2"+
		"\x2\x2 !\x3\x2\x2\x2!%\a\x6\x2\x2\"&\x5\x6\x4\x2#&\x5\x2\x2\x2$&\x5\n"+
		"\x6\x2%\"\x3\x2\x2\x2%#\x3\x2\x2\x2%$\x3\x2\x2\x2&\x39\x3\x2\x2\x2\'+"+
		"\x5\x6\x4\x2(+\x5\x2\x2\x2)+\x5\x4\x3\x2*\'\x3\x2\x2\x2*(\x3\x2\x2\x2"+
		"*)\x3\x2\x2\x2+,\x3\x2\x2\x2,/\t\x2\x2\x2-\x30\x5\x4\x3\x2.\x30\x5\n\x6"+
		"\x2/-\x3\x2\x2\x2/.\x3\x2\x2\x2\x30\x39\x3\x2\x2\x2\x31\x32\x5\x4\x3\x2"+
		"\x32\x36\a\x5\x2\x2\x33\x37\x5\x6\x4\x2\x34\x37\x5\x2\x2\x2\x35\x37\x5"+
		"\n\x6\x2\x36\x33\x3\x2\x2\x2\x36\x34\x3\x2\x2\x2\x36\x35\x3\x2\x2\x2\x37"+
		"\x39\x3\x2\x2\x2\x38\x19\x3\x2\x2\x2\x38\x1F\x3\x2\x2\x2\x38*\x3\x2\x2"+
		"\x2\x38\x31\x3\x2\x2\x2\x39\v\x3\x2\x2\x2:@\x3\x2\x2\x2;@\x5\x6\x4\x2"+
		"<@\x5\x2\x2\x2=@\x5\x4\x3\x2>@\x5\n\x6\x2?:\x3\x2\x2\x2?;\x3\x2\x2\x2"+
		"?<\x3\x2\x2\x2?=\x3\x2\x2\x2?>\x3\x2\x2\x2@\r\x3\x2\x2\x2\n\x17\x1F%*"+
		"/\x36\x38?";
	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN.ToCharArray());
}
} // namespace JFK_PROJEKT
