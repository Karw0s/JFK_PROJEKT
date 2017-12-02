using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JFK_PROJEKT
{
    public class  Time
    {
        public System.DateTime datetim;
        public System.TimeSpan timespan;

        public override string ToString()
        {
            return timespan.ToString();
        }

        
    }
}
