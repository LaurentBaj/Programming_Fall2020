using System;
using System.Security.Cryptography.X509Certificates;

namespace Ex4
{
    class Program
    {   
        // Properties
        int _numerator;
        int _denominator;


        // Constructors
        public Program()
        {
            _numerator = 0;
            _denominator = 1; 
        }
        public Program(int numerator, int denominator)
        {
            this._numerator = numerator;
            this._denominator = denominator; 
        }

        // Operator overloading 
        public static Program Add(Program f1, Program f2)
        {
           int newNomenator = (f1._numerator * f2._denominator) + (f2._numerator * f1._denominator);
           int newDenominator = f1._denominator * f2._denominator;
           return new Program(newNomenator, newDenominator);   
        }

        public static Program Negate(Program f2) 
        { 
            return new Program(-f2._numerator, f2._denominator); 
        }

        public static Program Subtract(Program f1, Program f2)
        {
            return Add(f1, -f2);
        }


        public static Program operator +(Program f1, Program f2)
        {
            return Add(f1, f2); 
        }

        public static Program operator -(Program f1, Program f2)
        {
            return Subtract(f1, f2);
        }








        static void Main(string[] args)
        {
            
        }
    }
}
