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
        public List<Date> Daty = new List<Date>();

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

            Daty.Add(tmp);

            return tmp;
        }
    }
}
