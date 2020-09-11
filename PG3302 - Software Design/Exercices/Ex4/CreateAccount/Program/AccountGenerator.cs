using System;
using System.Collections.Generic;
using System.Text;

namespace Program
{
    class AccountGenerator
    {
        public static void CreateAccount(Person user)
        {
            // Create a username fir the person 
            Console.WriteLine($"Your username is {user.FirstName.Substring(0, 1) }{ user.LastName} ");
        }
    }
}
