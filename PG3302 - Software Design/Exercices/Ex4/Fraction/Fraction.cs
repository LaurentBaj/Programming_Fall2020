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
            if(numerator == 0 || denominator == 0)
            {
                Console.ReadLine(); 
            }
            this.numerator = numerator;
            this.denominator = denominator;
        }

        // Operator Overloads -- Arithmetic 
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


        // Operator Overloads -- Relational 
        public static bool operator ==(Fraction f1, Fraction f2)
        {
            if(f1 == f2)
            {
                return true; 
            }
            return false; 
        }
        public static bool operator !=(Fraction f1, Fraction f2)
        {
            if (f1 != f2)
            {
                return true;
            }
            return false;
        }
        public static bool operator <(Fraction f1, Fraction f2)
        {
            if (f1 < f2)
            {
                return true;
            }
            return false;
        }
        public static bool operator >(Fraction f1, Fraction f2)
        {
            if (f1 > f2)
            {
                return true;
            }
            return false;
        }
        public static bool operator <=(Fraction f1, Fraction f2)
        {
            if (f1 <= f2)
            {
                return true;
            }
            return false;
        }
        public static bool operator >=(Fraction f1, Fraction f2)
        {
            if (f1 >= f2)
            {
                return true;
            }
            return false; 
        }

        // Methods
        public override string ToString()
        {
            return numerator + "/" + denominator;
        }

        public double ToDecimal()
        {
            return numerator / (double)denominator; 
        }
    }
}
