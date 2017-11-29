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

        public override object VisitTimespan(DateCalculatorParser.TimespanContext context)
        {
            DateCalculatorParser.GodzinyContext godzina = context.godziny();
            DateCalculatorParser.MinutyContext minta = context.minuty();
            DateCalculatorParser.SekundyContext sekunda = context.sekundy();

            TimeSpan tmp = new TimeSpan() {
                hour = Convert.ToInt32(godzina.GetText()),
                minute = Convert.ToInt32(minta.GetText()),
                second = Convert.ToInt32(sekunda.GetText())
            };

            timespanList.Add(tmp);

            return tmp;
        }

        public override object VisitDate(DateCalculatorParser.DateContext context)
        {
            DateCalculatorParser.DzienContext dzien = context.dzien();
            DateCalculatorParser.MiesiacContext miesiac = context.miesiac();
            DateCalculatorParser.RokContext rok = context.rok();

            Date tmp = new Date() {
                day = Convert.ToInt32(dzien.GetText()),
                month = miesiac.GetText(),
                yer = Convert.ToInt32(rok.GetText())
            };

            dateList.Add(tmp);

            return tmp;
        }

        public override object VisitDatetime(DateCalculatorParser.DatetimeContext context)
        {
            //TODO 
            return base.VisitDatetime(context);
        }

        public override object VisitOperation([NotNull] DateCalculatorParser.OperationContext context)
        {
            return base.VisitOperation(context);
        }

    }
}
