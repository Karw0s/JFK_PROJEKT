using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;

namespace JFK_PROJEKT
{
    public class TreeVisitor : DateCalculatorBaseVisitor<Time>
    {
        public List<TimeSpan> timespanList = new List<TimeSpan>();
        public List<Date> dateList = new List<Date>();
        public List<DateTime> datetimeList = new List<DateTime>();

        public override Time VisitTimespan([NotNull]DateCalculatorParser.TimespanContext context)
        {
            DateCalculatorParser.Liczba_dniContext liczba_dni = context.liczba_dni();
            DateCalculatorParser.GodzinyContext godzina = context.godziny();
            DateCalculatorParser.MinutyContext minta = context.minuty();
            DateCalculatorParser.SekundyContext sekunda = context.sekundy();

            System.TimeSpan time = new System.TimeSpan(
                Convert.ToInt32(godzina.GetText()),
                Convert.ToInt32(minta.GetText()),
                Convert.ToInt32(sekunda.GetText())
                );

            Time nowy = new Time();

            nowy.timespan = new System.TimeSpan(
                Convert.ToInt32(liczba_dni.GetText()),  //dodane
                Convert.ToInt32(godzina.GetText()),
                Convert.ToInt32(minta.GetText()),
                Convert.ToInt32(sekunda.GetText())
                );
            //return datetim.Add(time);
            return nowy;
        }

        //public override System.DateTime VisitDate([NotNull]DateCalculatorParser.DateContext context)
        //{

        //    DateCalculatorParser.DzienContext dzien = context.dzien();
        //    DateCalculatorParser.MiesiacContext miesiac = context.miesiac();
        //    DateCalculatorParser.RokContext rok = context.rok();

        //    int miesiac_int = 0;
        //    switch (miesiac.GetText())
        //    {
        //        case "STY":
        //            miesiac_int = 1;
        //            break;
        //        case "LUT":
        //            miesiac_int = 2;
        //            break;
        //        case "MAR":
        //            miesiac_int = 3;
        //            break;
        //        case "KWI":
        //            miesiac_int = 4;
        //            break;
        //        case "MAJ":
        //            miesiac_int = 5;
        //            break;
        //        case "CZE":
        //            miesiac_int = 6;
        //            break;
        //        case "LIP":
        //            miesiac_int = 7;
        //            break;
        //        case "SIE":
        //            miesiac_int = 8;
        //            break;
        //        case "WRZ":
        //            miesiac_int = 9;
        //            break;
        //        case "PAZ":
        //            miesiac_int = 10;
        //            break;
        //        case "LIS":
        //            miesiac_int = 11;
        //            break;
        //        case "GRU":
        //            miesiac_int = 12;
        //            break;
        //        default:
        //            break;
        //    }

        //    System.DateTime datetim = new System.DateTime(
        //        Convert.ToInt32(rok.GetText()),
        //        miesiac_int,
        //        Convert.ToInt32(dzien.GetText())
        //        );


        //    Date tmp = new Date()
        //    {
        //        day = Convert.ToInt32(dzien.GetText()),
        //        month = miesiac.GetText(),
        //        year = Convert.ToInt32(rok.GetText())
        //    };

        //    dateList.Add(tmp);

        //    return datetim;
        //}

        //public override System.DateTime VisitDateAddTiemspan([NotNull] DateCalculatorParser.DateAddTiemspanContext context)
        //{
        //    System.DateTime date1 = Visit(context.GetChild(0));
        //    System.DateTime date2 = Visit(context.GetChild(2));

        //    return date1.Add(date2.TimeOfDay);
        //}

        public override Time VisitTimespanAddTimespan([NotNull] DateCalculatorParser.TimespanAddTimespanContext context)
        {
            Time date1 = Visit(context.GetChild(0));
            Time date2 = Visit(context.GetChild(2));

            System.TimeSpan tmp = date1.timespan.Add(date2.timespan);
            date1.timespan = tmp;


            return date1;
        }

        //public override System.DateTime VisitTimespanAddDate([NotNull] DateCalculatorParser.TimespanAddDateContext context)
        //{
        //    System.DateTime date1 = Visit(context.GetChild(0));
        //    System.DateTime date2 = Visit(context.GetChild(2));

        //    return date2.Add(date1.TimeOfDay);
        //}

        //public override System.DateTime VisitDateSubTimespan([NotNull] DateCalculatorParser.DateSubTimespanContext context)
        //{
        //    System.DateTime date1 = Visit(context.GetChild(0));
        //    System.DateTime date2 = Visit(context.GetChild(2));

        //    return date1.Subtract(date2.TimeOfDay);
        //}

        //public override System.DateTime VisitTimespanSubTimespan([NotNull] DateCalculatorParser.TimespanSubTimespanContext context)
        //{
        //    System.DateTime date1 = Visit(context.GetChild(0));
        //    System.DateTime date2 = Visit(context.GetChild(2));

        //    return date1.Subtract(date2.TimeOfDay);
        //}


        //public override System.DateTime VisitDateSubDate([NotNull] DateCalculatorParser.DateSubDateContext context)
        //{
        //    //TODO naprawic
        //    System.DateTime date1 = Visit(context.GetChild(0));
        //    System.DateTime date2 = Visit(context.GetChild(2));

        //    System.DateTime result = new System.DateTime();
        //    result.Add(date1.Subtract(date2));
        //    return result;
        //}

        //public override Time VisitDatetime([NotNull]DateCalculatorParser.DatetimeContext context)
        //{
        //    //TODO 
        //    return base.VisitDatetime(context);
        //}

        //public override System.DateTime VisitOperation([NotNull] DateCalculatorParser.OperationContext context)
        //{
        //    if (null == context.op) // '(' operation ')'
        //        return Visit(context.operation());


        //    //Func<System.DateTime, System.TimeSpan, System.DateTime> operand;
        //    //switch (context.op.Type)
        //    //{
        //    //    case DateCalculatorParser.Add:
        //    //        operand = (a, b) => a + b;
        //    //        break;
        //    //    case DateCalculatorParser.Subtract:
        //    //        operand = (a, b) => a - b;
        //    //        break;
        //    //    default:
        //    //        throw new ArgumentOutOfRangeException();
        //    //}


        //    Func<System.DateTime, System.DateTime, System.TimeSpan> operand;
        //    switch (context.op.Type)
        //    {
        //        case DateCalculatorParser.Subtract:
        //            operand = (a, b) => a - b;
        //            break;
        //        default:
        //            throw new ArgumentOutOfRangeException();
        //    }


        //    //return  operand(Visit(context.GetChild(1)), Visit(context.GetChild(2)));
        //    return base.VisitOperation(context);


        //}

    }
}
