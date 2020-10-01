///////////////////////////////////////////////////////////////////////////////////////////////////
//
// Decorator pattern example, heavily inspired by blog article by Ruchit Surati.
// Original article/code found here: http://www.dofactory.com/Patterns/PatternSingleton.aspx#_self1
//
// Modified in 2016 by Philip Christensen, Westerdals Oslo ACT.
// Modified in 2016 by Tomas Sandnes, Westerdals Oslo ACT.
//
///////////////////////////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Threading;

namespace Decorator
{
    public class Program
    {
        static void Main() {

            PizzaStore store = new PizzaStore();
            List<Customer> customers = new List<Customer>(){ new Customer("Jhon",store), new Customer("Frank", store), new Customer("Will", store) };

            store.Start();
            foreach (var customer in customers) {
                customer.Start();
            }

            Thread.Sleep(3000);

            foreach (var customer in customers) {
                customer.Stop();
            }
            store.Stop();

            Console.WriteLine("\n\nPress any key to exit.");
            Console.ReadKey();

        }
    }
}