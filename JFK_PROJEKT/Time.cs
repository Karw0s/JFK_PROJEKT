using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JFK_PROJEKT
{
    public class  Time
    {
        private DateTime datetime;
        private TimeSpan timespan;
        private bool isTimeSpan;
      
        public override string ToString()
        {
            if (isTimeSpan)
                return timespan.ToString();
            else
                return datetime.ToString();
        }

        //dodać gettery i settery
        public TimeSpan Timespan { get; set; }


    }
}
