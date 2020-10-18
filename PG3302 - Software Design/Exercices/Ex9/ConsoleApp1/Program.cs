using System;
using CarFactory; 

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            Car a = new Car();
            Car b = new Car("Volkswagen", "Blue", 2011);

            Console.WriteLine(a);  
            Console.WriteLine(b);

            Console.ReadLine(); 
        }
    }
}
