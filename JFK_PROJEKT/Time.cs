using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JFK_PROJEKT
{
    public class  Time
    {
        public DateTime datetime { get; set; }
        public TimeSpan timespan { get; set; }
        public bool isTimeSpan { get; set; }

        public override string ToString()
        {
            if (isTimeSpan)
                return timespan.ToString();
            else
                return datetime.ToString();
        }

        //dodać gettery i settery
        


    }
}
