using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JFK_PROJEKT
{
    public class TimeSpan
    {
        public int hour { get; set; }
        public int minute { get; set; }
        public int second { get; set; }

       static public TimeSpan dodaj(TimeSpan a, TimeSpan b)
        {
            Console.WriteLine(a.hour + " " + a.minute + " " + a.second + " ");
            TimeSpan wynik = new TimeSpan();

            wynik.second = a.second + b.second;
            wynik.minute = a.minute + b.minute;
            wynik.hour = a.hour + b.hour;

            return wynik;
        }

        static public TimeSpan odejmij(TimeSpan a, TimeSpan b)
        {
            Console.WriteLine(a.hour + " " + a.minute + " " + a.second + " ");
            TimeSpan wynik = new TimeSpan();

            wynik.second = a.second - b.second;
            wynik.minute = a.minute - b.minute;
            wynik.hour = a.hour - b.hour;

            return wynik;
        }
    }
}
