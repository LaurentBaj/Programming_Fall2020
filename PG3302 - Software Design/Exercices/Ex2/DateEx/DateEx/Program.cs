using System;

namespace DateEx
{
    public class Date
    {
        private int _month = 1;
        public int Month { 
            get { return _month; }
            set 
            {
                if(value <= 0) {
                    _month = 1; 
                }
                else if(value >= 12) {
                    _month = 12; 
                }
                else {
                    _month = value; 
                }
            }
        }
    }

    class Person
    {
        private String _name = "Ukjent";  
        private String _lastName = "Ukjent";  
        public String Name
        {
            get { return _name; }
            set 
            {
                _name = value; 
            }

        }
        public String LastName
        {
            get { return _lastName; }
            set
            {
                _lastName = value;
            }
        }

        public String FullName
        {
            get { return _name + " " + _lastName; }
        }
    }
    class Program
    {
        public static void Main(string[] args)
        {
            Date d1 = new Date();
            d1.Month = 3; 
            Console.WriteLine(d1.Month);

            Person p1 = new Person();
            Console.WriteLine(p1.FullName);
            p1.Name = "Laurent"; 
            p1.LastName = "Bajrami";
            Console.WriteLine(p1.FullName); 

            Console.ReadKey(); 
        }
    }
}
