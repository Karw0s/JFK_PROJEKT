//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.6.5-SNAPSHOT
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from C:\Users\User\Source\Repos\JFK_PROJEKTost\JFK_PROJEKT\DateCalculator.g4 by ANTLR 4.6.5-SNAPSHOT

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace JFK_PROJEKT {
using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="DateCalculatorParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.6.5-SNAPSHOT")]
[System.CLSCompliant(false)]
public interface IDateCalculatorListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by the <c>timespanOpTimespan</c>
	/// labeled alternative in <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTimespanOpTimespan([NotNull] DateCalculatorParser.TimespanOpTimespanContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>timespanOpTimespan</c>
	/// labeled alternative in <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTimespanOpTimespan([NotNull] DateCalculatorParser.TimespanOpTimespanContext context);

	/// <summary>
	/// Enter a parse tree produced by the <c>timespanAddDate</c>
	/// labeled alternative in <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTimespanAddDate([NotNull] DateCalculatorParser.TimespanAddDateContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>timespanAddDate</c>
	/// labeled alternative in <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTimespanAddDate([NotNull] DateCalculatorParser.TimespanAddDateContext context);

	/// <summary>
	/// Enter a parse tree produced by the <c>dateSubDate</c>
	/// labeled alternative in <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDateSubDate([NotNull] DateCalculatorParser.DateSubDateContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>dateSubDate</c>
	/// labeled alternative in <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDateSubDate([NotNull] DateCalculatorParser.DateSubDateContext context);

	/// <summary>
	/// Enter a parse tree produced by the <c>dateSubTimespan</c>
	/// labeled alternative in <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDateSubTimespan([NotNull] DateCalculatorParser.DateSubTimespanContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>dateSubTimespan</c>
	/// labeled alternative in <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDateSubTimespan([NotNull] DateCalculatorParser.DateSubTimespanContext context);

	/// <summary>
	/// Enter a parse tree produced by the <c>dateAddTimespan</c>
	/// labeled alternative in <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDateAddTimespan([NotNull] DateCalculatorParser.DateAddTimespanContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>dateAddTimespan</c>
	/// labeled alternative in <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDateAddTimespan([NotNull] DateCalculatorParser.DateAddTimespanContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpression([NotNull] DateCalculatorParser.ExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpression([NotNull] DateCalculatorParser.ExpressionContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOperation([NotNull] DateCalculatorParser.OperationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.operation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOperation([NotNull] DateCalculatorParser.OperationContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.datetime"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDatetime([NotNull] DateCalculatorParser.DatetimeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.datetime"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDatetime([NotNull] DateCalculatorParser.DatetimeContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.date"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDate([NotNull] DateCalculatorParser.DateContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.date"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDate([NotNull] DateCalculatorParser.DateContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.timespan"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTimespan([NotNull] DateCalculatorParser.TimespanContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.timespan"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTimespan([NotNull] DateCalculatorParser.TimespanContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.dzien"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDzien([NotNull] DateCalculatorParser.DzienContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.dzien"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDzien([NotNull] DateCalculatorParser.DzienContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.liczba_dni"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLiczba_dni([NotNull] DateCalculatorParser.Liczba_dniContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.liczba_dni"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLiczba_dni([NotNull] DateCalculatorParser.Liczba_dniContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.miesiac"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMiesiac([NotNull] DateCalculatorParser.MiesiacContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.miesiac"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMiesiac([NotNull] DateCalculatorParser.MiesiacContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.rok"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRok([NotNull] DateCalculatorParser.RokContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.rok"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRok([NotNull] DateCalculatorParser.RokContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.godziny"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterGodziny([NotNull] DateCalculatorParser.GodzinyContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.godziny"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitGodziny([NotNull] DateCalculatorParser.GodzinyContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.minuty"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMinuty([NotNull] DateCalculatorParser.MinutyContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.minuty"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMinuty([NotNull] DateCalculatorParser.MinutyContext context);

	/// <summary>
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.sekundy"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSekundy([NotNull] DateCalculatorParser.SekundyContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.sekundy"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSekundy([NotNull] DateCalculatorParser.SekundyContext context);
}
} // namespace JFK_PROJEKT
