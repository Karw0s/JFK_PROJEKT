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
                //Console.WriteLine(tree.ToStringTree()); // Token IDs
                Console.WriteLine(tree.ToStringTree(parser));

                if (0 < errors)
                    return;

                var visitor = new TreeVisitor();
                //visitor.Visit(tree);
                Console.WriteLine($"Result = {visitor.Visit(tree).ToString()}");
                Console.WriteLine("Koniec!");
                //foreach (var line in visitor.dateList)
                //{
                //    Console.WriteLine("{0}-{1}-{2}", line.day, line.month,line.year);
                //}

                //foreach (var line in visitor.timespanList)
                //{
                //    Console.WriteLine("{0}:{1}:{2}", line.hour, line.minute, line.second);
                //}

                //DateCalculatorParser.ExpressionContext chatContext = parser.expression();



                //SpeakVisitor visitor = new SpeakVisitor();
                //visitor.Visit(chatContext);

                //foreach (var line in visitor.Lines)
                //{
                //    Console.WriteLine("{0} has said \"{1}\"", line.Person, line.Text);
                //}
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex);
            }
        }
    }
}
