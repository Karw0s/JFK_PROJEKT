using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;


namespace JFK_PROJEKT
{

    class TreeEvaluationVisitor : DateCalculatorBaseVisitor<Time>
    {
        public override Time VisitOperation([NotNull] DateCalculatorParser.OperationContext context)
        {
            if (null == context.op)
                return Visit(context.operation());

            Func<Time, Time, Time> operand;
            switch (context.op.Type)
            {
                case DateCalculatorParser.Add:
                    operand = (a, b) => a + b;
                    break;
                case DateCalculatorParser.Subtract:
                    operand = (a, b) => a - b;
                    break;
                default:
                    throw new ArgumentOutOfRangeException();
            }

            return operand(Visit(context.GetChild(1)), Visit(context.GetChild(2)));
           // return base.VisitOperation(context);
        }
    }
}
