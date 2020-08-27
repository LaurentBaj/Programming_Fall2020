using System;

namespace RandomNames
{
    class Program
    {
        static void Main(string[] args)
        {
            Random r = new Random();
            String[] nameArray = { "Ben", "Stian", "Magnus", "Kai", "Sindre", "Adolf" };

            foreach (String name in nameArray)
            {
                int rand = r.Next(0, nameArray.Length);
                String randomName = nameArray[rand];
                Console.WriteLine(randomName); 
            }

            Console.ReadLine(); 
        }
    }
}
