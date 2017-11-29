using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JFK_PROJEKT
{
    public class  Time
    {
        private int day = 0;
        private String month ="" ;
        private int year=0;
        private int hour=0;
        private int minute=0;
        private int seconds=0;

        public Time (int hour,int minute,int seconds)
        {
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
        }

        public int Day { get; set; }
        public String Month { get; set; }
        public int Year { get; set; }
        public int Hour { get; set; }
        public int Minute { get; set; }
        public int Seconds { get; set; }

        public static Time dodaj(Time a, Time b)
        {
            Console.WriteLine(a.hour + " " + a.minute + " " + a.seconds + " ");
            Time wynik = new Time(0,0,0);

            wynik.seconds = a.seconds + b.seconds;
            wynik.minute = a.minute + b.minute;
            wynik.hour = a.hour + b.hour;

            return  wynik;
        }

        public static Time odejmij(Time a, Time b)
        {
            Time wynik = new Time(0,0,0);

            wynik.seconds = a.seconds - b.seconds;
            wynik.minute = a.minute - b.minute;
            wynik.hour = a.hour - b.hour;

            return wynik;
        }

    }
}
