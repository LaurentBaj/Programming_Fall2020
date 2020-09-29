using System;
using LSPDemo;

namespace DemoLibrary
{
    class Program
    {
        static void Main(string[] args)
        {
            Manager accountingVP = new Manager();

            accountingVP.FirstName = "Emma";
            accountingVP.LastName = "Stone"; 
            accountingVP.CalculatePerHourRate(4);
            
            Employee emp = new Employee();

            emp.FirstName = "Laurent";
            emp.LastName = "Bajrami"; 
            emp.AssignManager(accountingVP);
            emp.CalculatePerHourRate(2);
            
            Console.WriteLine($"{ emp.FirstName}'s salary is ${ emp.Salary }/hour");

            Console.ReadLine(); 
        }
    }
}