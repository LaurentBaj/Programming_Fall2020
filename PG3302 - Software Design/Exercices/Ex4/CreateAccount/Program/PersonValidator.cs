using System;
using System.Collections.Generic;
using System.Text;

namespace Program
{
    class PersonValidator
    {
        public static bool Validate(Person person)
        {
            // Checks to be sure the first and last names are valid 
            if (string.IsNullOrWhiteSpace(person.FirstName))
            {
                StandardMessages.DisplayErrorValidationError("first name"); 
                return false;
            }

            if (string.IsNullOrWhiteSpace(person.LastName))
            {
                StandardMessages.DisplayErrorValidationError("last name");
                return false;
            }

            return true; 
        }
    }
}
