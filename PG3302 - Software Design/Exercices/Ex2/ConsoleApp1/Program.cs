using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int b = 3;
            String name = "Laurent";
            char male = 'm';
            double dec = 4.5;
            bool isCool = true; 


            Console.WriteLine("   /|");
            Console.WriteLine("  / |");
            Console.WriteLine(" /  |");
            Console.WriteLine("/___|");

            Console.WriteLine(b); 
            Console.WriteLine(name); 
            Console.WriteLine(male); 
            Console.WriteLine(dec); 
            Console.WriteLine(isCool);

            //Readline keeps the program running though it has executed the entire program
            Console.ReadLine(); 
        }
    }
}
