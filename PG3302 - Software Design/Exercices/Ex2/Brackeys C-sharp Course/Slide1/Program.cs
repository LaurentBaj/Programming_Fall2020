using System;

namespace Slide1
{
    class Program
    {
        static void Main(string[] args)
        {
            int num1, num2;
            
            // Readline is the value of user input
            // The content saved from a readline() is a string and needs to be converted to int 
            // Convert.toInt32() converts a string int to integer int 

            Console.Write("Add number to be multiplicated: ");
            num1 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Add a second number which * the initial number: ");
            num2 = Convert.ToInt32(Console.ReadLine());

            int res = num1 * num2;
            Console.WriteLine("\n" + res); 
        }
    }
}
