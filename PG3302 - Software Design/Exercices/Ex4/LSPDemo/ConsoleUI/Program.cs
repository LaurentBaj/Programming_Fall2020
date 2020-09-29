using System;
using DemoLibrary;

namespace ConsoleUI
{
    class Program
    {
        static void Main(string[] args)
        {
            IManager accountingVP = new CEO();

            accountingVP.FirstName = "Emma";
            accountingVP.LastName = "Stone"; 
            accountingVP.CalculatePerHourRate(4);
            
            IManaged emp = new Employee();
            
            emp.FirstName = "Laurent";
            emp.LastName = "Bajrami"; 
            emp.AssignManager(accountingVP);
            emp.CalculatePerHourRate(2);
            
            Console.WriteLine($"{ emp.FirstName}'s salary is ${ emp.Salary }/hour");

            Console.ReadLine(); 
        }
    }
}