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
            DateCalculatorParser.MinutyContext minuta = context.minuty();
            DateCalculatorParser.SekundyContext sekunda = context.sekundy();

            Time nowy = new Time();

            if (liczba_dni==null)
            {
                nowy.timespan = new System.TimeSpan(
                Convert.ToInt32(godzina.GetText()),
                Convert.ToInt32(minuta.GetText()),
                Convert.ToInt32(sekunda.GetText())
                );
            }
            else
            {
                nowy.timespan = new System.TimeSpan(
                Convert.ToInt32(liczba_dni.GetText()),  //dodane
                Convert.ToInt32(godzina.GetText()),
                Convert.ToInt32(minuta.GetText()),
                Convert.ToInt32(sekunda.GetText())
                );
            }
            
            nowy.isTimeSpan = true;
            //return datetim.Add(time);
            return nowy;
        }

        public override Time VisitDate([NotNull]DateCalculatorParser.DateContext context)
        {

            DateCalculatorParser.DzienContext dzien = context.dzien();
            DateCalculatorParser.MiesiacContext miesiac = context.miesiac();
            DateCalculatorParser.RokContext rok = context.rok();

            int miesiac_int = 0;
            switch (miesiac.GetText())
            {
                case "STY":
                    miesiac_int = 1;
                    break;
                case "LUT":
                    miesiac_int = 2;
                    break;
                case "MAR":
                    miesiac_int = 3;
                    break;
                case "KWI":
                    miesiac_int = 4;
                    break;
                case "MAJ":
                    miesiac_int = 5;
                    break;
                case "CZE":
                    miesiac_int = 6;
                    break;
                case "LIP":
                    miesiac_int = 7;
                    break;
                case "SIE":
                    miesiac_int = 8;
                    break;
                case "WRZ":
                    miesiac_int = 9;
                    break;
                case "PAZ":
                    miesiac_int = 10;
                    break;
                case "LIS":
                    miesiac_int = 11;
                    break;
                case "GRU":
                    miesiac_int = 12;
                    break;
                default:
                    break;
            }

            DateTime Data = new System.DateTime(Convert.ToInt32(rok.GetText()), miesiac_int, Convert.ToInt32(dzien.GetText()));
            Time wynik = new Time();
            wynik.datetime = Data;
            wynik.isTimeSpan = false;

            return wynik;
        }

        public override Time VisitDateAddTimespan([NotNull] DateCalculatorParser.DateAddTimespanContext context)
        {
            Time date1 = Visit(context.GetChild(0));
            Time date2 = Visit(context.GetChild(2));

            DateTime tmp = date1.datetime.Add(date2.timespan);
            date1.datetime = tmp;
            date1.isTimeSpan = false;

            return date1;
        }

        public override Time VisitTimespanAddTimespan([NotNull] DateCalculatorParser.TimespanAddTimespanContext context)
        {
            Time date1 = Visit(context.GetChild(0));
            Time date2 = Visit(context.GetChild(2));

            System.TimeSpan tmp = date1.timespan.Add(date2.timespan);
            date1.timespan = tmp;
            date1.isTimeSpan = true;

            return date1;
        }

        public override Time VisitTimespanAddDate([NotNull] DateCalculatorParser.TimespanAddDateContext context)
        {
            Time date1 = Visit(context.GetChild(0));
            Time date2 = Visit(context.GetChild(2));

            DateTime tmp = date2.datetime.Add(date1.timespan);
            date2.datetime = tmp;
            date2.isTimeSpan = false;

            return date2;
        }

        public override Time VisitDateSubTimespan([NotNull] DateCalculatorParser.DateSubTimespanContext context)
        {
            Time date1 = Visit(context.GetChild(0));
            Time date2 = Visit(context.GetChild(2));

            DateTime tmp = date1.datetime.Subtract(date2.timespan);
            date1.datetime = tmp;
            date1.isTimeSpan = false;

            return date1;
        }

        public override Time VisitTimespanSubTimespan([NotNull] DateCalculatorParser.TimespanSubTimespanContext context)
        {
            Time date1 = Visit(context.GetChild(0));
            Time date2 = Visit(context.GetChild(2));

            TimeSpan tmp = date1.timespan.Subtract(date2.timespan);
            date1.timespan = tmp;
            date1.isTimeSpan = true;

            return date1;
        }


        public override Time VisitDateSubDate([NotNull] DateCalculatorParser.DateSubDateContext context)
        {
            //TODO naprawic
            Time date1 = Visit(context.GetChild(0));
            Time date2 = Visit(context.GetChild(2));

            Time wynik = new Time();
            wynik.timespan = date1.datetime.Subtract(date2.datetime);
            wynik.isTimeSpan = true;

            return wynik;
        }

        public override Time VisitDatetime([NotNull]DateCalculatorParser.DatetimeContext context)
        {
            //TODO 
            DateCalculatorParser.DateContext date = context.date();

            DateCalculatorParser.DzienContext dzien = date.dzien();
            DateCalculatorParser.MiesiacContext miesiac = date.miesiac();
            DateCalculatorParser.RokContext rok = date.rok();
            DateCalculatorParser.GodzinyContext godzina = context.godziny();
            DateCalculatorParser.MinutyContext minuta = context.minuty();
            DateCalculatorParser.SekundyContext sekunda = context.sekundy();

            int miesiac_int = 0;
            switch (miesiac.GetText())
            {
                case "STY":
                    miesiac_int = 1;
                    break;
                case "LUT":
                    miesiac_int = 2;
                    break;
                case "MAR":
                    miesiac_int = 3;
                    break;
                case "KWI":
                    miesiac_int = 4;
                    break;
                case "MAJ":
                    miesiac_int = 5;
                    break;
                case "CZE":
                    miesiac_int = 6;
                    break;
                case "LIP":
                    miesiac_int = 7;
                    break;
                case "SIE":
                    miesiac_int = 8;
                    break;
                case "WRZ":
                    miesiac_int = 9;
                    break;
                case "PAZ":
                    miesiac_int = 10;
                    break;
                case "LIS":
                    miesiac_int = 11;
                    break;
                case "GRU":
                    miesiac_int = 12;
                    break;
                default:
                    break;
            }

            DateTime Data = new System.DateTime(
                Convert.ToInt32(rok.GetText()),
                miesiac_int,
                Convert.ToInt32(dzien.GetText()),
                Convert.ToInt32(godzina.GetText()),
                Convert.ToInt32(minuta.GetText()),
                Convert.ToInt32(sekunda.GetText())
                );

            Time wynik = new Time();
            wynik.datetime = Data;
            wynik.isTimeSpan = false;

            return wynik;
        }

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
