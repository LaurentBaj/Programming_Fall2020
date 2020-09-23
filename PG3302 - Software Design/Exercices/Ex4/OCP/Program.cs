using System;
using System.Collections.Generic;

namespace OCP
{
    class Program
    {
        static void Main(string[] args)
        {
            List<PersonModel> applications = new List<PersonModel>
            {
                new PersonModel { FirstName = "Tim", LastName = "Corey"},
                new PersonModel { FirstName = "Sue", LastName = "Storm"},
                new PersonModel { FirstName = "Nancy", LastName = "Roman"},
            };

            List<EmployeeModel> employees = new List<EmployeeModel>();
            Accounts accountProccessor = new Accounts(); 

            foreach (var person in applications)
            {
                employees.Add(accountProccessor.Create(person)); 
            }
            
            foreach (var emp in employees)
            {
                Console.WriteLine($"{ emp.FirstName } { emp.LastName }: {emp.EmailAddress }");
            }

            Console.ReadLine();
        }
    }
}
