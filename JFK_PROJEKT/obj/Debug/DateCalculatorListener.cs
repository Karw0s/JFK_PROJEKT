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
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.dates"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDates([NotNull] DateCalculatorParser.DatesContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.dates"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDates([NotNull] DateCalculatorParser.DatesContext context);

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
	/// Enter a parse tree produced by <see cref="DateCalculatorParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpression([NotNull] DateCalculatorParser.ExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="DateCalculatorParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpression([NotNull] DateCalculatorParser.ExpressionContext context);
}
} // namespace JFK_PROJEKT
