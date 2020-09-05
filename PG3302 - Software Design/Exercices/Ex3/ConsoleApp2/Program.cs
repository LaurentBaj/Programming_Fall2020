using System;

namespace ConsoleApp2
{
    class Program
    {
        static void Main(string[] args)
        {
            Random randomNumber = new Random();
            int answer, userInput; 
            string userInputFail;

            do
            {
                answer = randomNumber.Next(1, 10);

                Console.Write("Guess a number between one and ten:   ");
                userInput = Convert.ToInt32(Console.ReadLine());
                if (userInput == answer)
                {
                    Console.WriteLine("Correct!");
                    break;
                }
                else
                {
                    Console.WriteLine("Wrong! Do you want to try again? (y/n)   ");
                    userInputFail = Console.ReadLine();
                    if (userInputFail == "n") break;
                }

            } while (userInput != answer); 


            Console.ReadLine(); 
        }
    }
}
