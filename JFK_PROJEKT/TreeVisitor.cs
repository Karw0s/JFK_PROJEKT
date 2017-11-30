using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;

namespace JFK_PROJEKT
{
    public class TreeVisitor : DateCalculatorBaseVisitor<object>
    {
        public List<TimeSpan> timespanList = new List<TimeSpan>();
        public List<Date> dateList = new List<Date>();
        public List<DateTime> datetimeList = new List<DateTime>();

        public override object VisitTimespan([NotNull]DateCalculatorParser.TimespanContext context)
        {
            DateCalculatorParser.GodzinyContext godzina = context.godziny();
            DateCalculatorParser.MinutyContext minta = context.minuty();
            DateCalculatorParser.SekundyContext sekunda = context.sekundy();

            TimeSpan tmp = new TimeSpan()
            {
                hour = Convert.ToInt32(godzina.GetText()),
                minute = Convert.ToInt32(minta.GetText()),
                second = Convert.ToInt32(sekunda.GetText())
            };

            timespanList.Add(tmp);

            return tmp;
        }

        public override object VisitDate([NotNull]DateCalculatorParser.DateContext context)
        {

            DateCalculatorParser.DzienContext dzien = context.dzien();
            DateCalculatorParser.MiesiacContext miesiac = context.miesiac();
            DateCalculatorParser.RokContext rok = context.rok();

            Date tmp = new Date()
            {
                day = Convert.ToInt32(dzien.GetText()),
                month = miesiac.GetText(),
                year = Convert.ToInt32(rok.GetText())
            };

            dateList.Add(tmp);

            return tmp;
        }

        //public override Time VisitDatetime([NotNull]DateCalculatorParser.DatetimeContext context)
        //{
        //    //TODO 
        //    return base.VisitDatetime(context);
        //}

        public override object VisitOperation([NotNull] DateCalculatorParser.OperationContext context)
        {
            if (null == context.op) // '(' operation ')'
                return Visit(context.operation());

            if (context.GetChild(1).GetType() == typeof(TimeSpan) && context.GetChild(2).GetType() == typeof(TimeSpan))
            {
                Func<TimeSpan, TimeSpan, TimeSpan> operand;
                switch (context.op.Type)
                {
                    case DateCalculatorParser.Add:
                        operand = (a, b) => TimeSpan.dodaj(a, b);
                        break;
                    case DateCalculatorParser.Subtract:
                        operand = (a, b) => TimeSpan.odejmij(a, b);
                        break;
                    default:
                        throw new ArgumentOutOfRangeException();
                }
                return operand((TimeSpan)Visit(context.GetChild(1)), (TimeSpan)Visit(context.GetChild(2)));

            }
            return base.VisitOperation(context);
        }

    }
}
