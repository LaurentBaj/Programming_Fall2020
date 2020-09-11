using System;
using System.Collections.Generic;
using System.Text;

namespace Program
{
    public class StandardMessages
    {
        public static void WelcomeMessage()
        {
            Console.WriteLine("Welcome to my application!");
        }

        public static void EndApplication()
        {
            Console.Write("Press enter to close..."); 
            Console.ReadLine();
        }

        public static void DisplayErrorValidationError(string fieldName)
        {
            Console.WriteLine($"You did not give us a valid { fieldName }!");
        }
    }
}
