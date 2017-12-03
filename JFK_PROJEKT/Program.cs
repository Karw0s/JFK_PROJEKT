using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JFK_PROJEKT
{
    

    class Program
    {
        public static readonly DateTimeFormatInfo FORMAT = new DateTimeFormatInfo { DateSeparator = "-", TimeSeparator = ":" };
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Key in the input string:");
                var input = Console.ReadLine();

                ICharStream charStream = new AntlrInputStream(input);

                DateCalculatorLexer lexer = new DateCalculatorLexer(charStream);
                ITokenStream tokenStream = new CommonTokenStream(lexer);
                DateCalculatorParser parser = new DateCalculatorParser(tokenStream) { BuildParseTree = true };

                IParseTree tree = parser.expression();
                var errors = parser.NumberOfSyntaxErrors;

                Console.WriteLine($"Number of syntax errors: {errors}");
                Console.WriteLine(tree.ToStringTree(parser));

                if (0 < errors)
                    return;

                var visitor = new TreeVisitor();
                Console.WriteLine($"Result = {visitor.Visit(tree).ToString()}");
                Console.WriteLine("Koniec!");
        
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex);
            }
        }
    }
}
