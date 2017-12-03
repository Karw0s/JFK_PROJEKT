using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;

namespace JFK_PROJEKT
{
    /// <summary>
    /// Klasa przechodząca drzewo i zwracająca wartość węzła do klasy Time
    /// </summary>
    public class TreeVisitor : DateCalculatorBaseVisitor<Time>
    {
        /// <summary>
        /// Odpowiada za odwiedzenia węzła z typem Timespan i zwrócenie jego wartości
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
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
                Convert.ToInt32(liczba_dni.GetText()), 
                Convert.ToInt32(godzina.GetText()),
                Convert.ToInt32(minuta.GetText()),
                Convert.ToInt32(sekunda.GetText())
                );
            }
            
            nowy.isTimeSpan = true;
            return nowy;
        }
        /// <summary>
        /// Odpowiada za odwiedzenia węzła z typem Date i zwrócenie jego wartości
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
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
        /// <summary>
        /// Odpowiada za odwiedzenia węzła z typem Datetime i zwrócenie jego wartości
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override Time VisitDatetime([NotNull]DateCalculatorParser.DatetimeContext context)
        {
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
        /// <summary>
        /// Zwraca zsumowana wartosc podrzednych wezlow typu Date i Timespan
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override Time VisitDateAddTimespan([NotNull] DateCalculatorParser.DateAddTimespanContext context)
        {
            Time date1 = Visit(context.GetChild(0));
            Time time = Visit(context.GetChild(2));

            Time wynik = new Time();

            DateTime tmp = date1.datetime.Add(time.timespan);
            wynik.datetime = tmp;
            wynik.isTimeSpan = false;

            return wynik;
        }
        /// <summary>
        /// Zwraca zsumowana lub odjeta wartosc podrzednych wezlow typu Timespan i Timespan
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override Time VisitTimespanOpTimespan([NotNull] DateCalculatorParser.TimespanOpTimespanContext context)
        {
            Time time1 = Visit(context.GetChild(0));
            Time time2 = Visit(context.GetChild(2));

            Time wynik = new Time();

            switch (context.op.Type)
            {
                case DateCalculatorParser.Add:
                    wynik.timespan = time1.timespan.Add(time2.timespan);
                    break;
                case DateCalculatorParser.Subtract:
                    wynik.timespan = time1.timespan.Subtract(time2.timespan);
                    break;
                default:
                    throw new ArgumentOutOfRangeException();
            }

            wynik.isTimeSpan = true;

            return wynik;
        }
        /// <summary>
        /// Zwraca zsumowana wartosc podrzednych wezlow typu Timespan i Date
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override Time VisitTimespanAddDate([NotNull] DateCalculatorParser.TimespanAddDateContext context)
        {
            Time time = Visit(context.GetChild(0));
            Time date = Visit(context.GetChild(2));

            Time wynik = new Time();

            DateTime tmp = date.datetime.Add(time.timespan);
            wynik.datetime = tmp;
            wynik.isTimeSpan = false;

            return wynik;
        }
        /// <summary>
        /// Zwraca odjeta wartosc podrzednych wezlow typu Date i Timespan
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override Time VisitDateSubTimespan([NotNull] DateCalculatorParser.DateSubTimespanContext context)
        {
            Time date = Visit(context.GetChild(0));
            Time time = Visit(context.GetChild(2));

            Time wynik = new Time();

            DateTime tmp = date.datetime.Subtract(time.timespan);

            wynik.datetime = tmp;
            wynik.isTimeSpan = false;

            return wynik;
        }
        /// <summary>
        /// Zwraca odjeta wartosc podrzednych wezlow typu Date i Date
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override Time VisitDateSubDate([NotNull] DateCalculatorParser.DateSubDateContext context)
        {
            Time date1 = Visit(context.GetChild(0));
            Time date2 = Visit(context.GetChild(2));

            Time wynik = new Time();
            wynik.timespan = date1.datetime.Subtract(date2.datetime);
            wynik.isTimeSpan = true;

            return wynik;
        }

    }
}
