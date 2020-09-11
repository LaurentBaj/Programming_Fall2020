using System;
using System.Collections.Generic;
using System.Text;

namespace Program
{
    class PersonDataCapture
    {
        public static Person Capture()
        {
            // Ask for user information
            Person output = new Person();

            Console.Write("What is your name first name:  ");
            output.FirstName = Console.ReadLine();

            Console.Write("What is your name last name:  ");
            output.LastName = Console.ReadLine();

            return output; 
        }

    }
}
