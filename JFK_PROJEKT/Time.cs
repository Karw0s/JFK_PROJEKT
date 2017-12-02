using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JFK_PROJEKT
{
    public class  Time
    {
        private DateTime _datetime;
        private TimeSpan _timespan;
        private bool _isTimeSpan;
      
        public override string ToString()
        {
            if (_isTimeSpan)
                return _timespan.ToString();
            else
                return _datetime.ToString();
        }

        //dodać gettery i settery
    }
}
