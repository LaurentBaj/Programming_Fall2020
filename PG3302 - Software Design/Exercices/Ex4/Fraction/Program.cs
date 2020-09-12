using System;
using System.Collections.Generic;
using System.Text;

namespace Fraction
{
    class Program
    {
        public static void Main()
        {
            var a = new Fraction(2, 4);
            var b = new Fraction(1, 4);

            // Test arithmetic operators
            Console.WriteLine(a + b);
            Console.WriteLine(a - b);
            Console.WriteLine(a * b);
            Console.WriteLine(a / b);

            // Test if it returns decimal version
            Console.WriteLine(a.ToDecimal());

            // Test relational operators 
            Console.WriteLine(a == b);
            Console.WriteLine(a != b);
            Console.WriteLine(a > b);
            Console.WriteLine(b < a);
            Console.WriteLine(a >= b);
            Console.WriteLine(b <= a);

            Console.ReadLine();
        }
    }
}
