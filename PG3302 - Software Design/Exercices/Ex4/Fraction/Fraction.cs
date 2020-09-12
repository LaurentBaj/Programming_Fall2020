using System;

namespace Fraction
{
    class Fraction
    {
        // Properties 
        private int numerator;
        private int denominator;

        // Constructor 
        public Fraction(int numerator = 0, int denominator = 1)
        {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        // Operator Overloading 
        public static Fraction operator +(Fraction f1, Fraction f2)
        {
            // Given that the denominators for each fraction have the same value 
            return new Fraction(f1.numerator + f2.numerator, f1.denominator);
        }

        public static Fraction operator -(Fraction f1, Fraction f2)
        {
            return new Fraction(f1.numerator - f2.numerator, f1.denominator);
        }

        public static Fraction operator *(Fraction f1, Fraction f2)
        {
            return new Fraction(f1.numerator * f2.numerator, f1.denominator * f2.denominator);
        }

        public static Fraction operator /(Fraction f1, Fraction f2)
        {
            return new Fraction(f1.numerator * f2.denominator, f1.denominator * f2.numerator);
        }

        public static void Main()
        {
            var a = new Fraction(5, 4);
            var b = new Fraction(1, 4);
            Console.WriteLine(a + b);    
        }
    }
}
