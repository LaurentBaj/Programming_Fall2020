using System;
using System.Collections.Generic;
using System.Text;

namespace CarFactory
{
    
    class Car
    {
        public string _color, _name;
        public int _modelYear;

        public Car(String name = "Unknown", String color = "Colorless", int modelYear = 0)
        {
            _name = name;
            _color = color;
            _modelYear = modelYear; 
        }


        public String Color
        {
            get { return _color; }
        }

        public String Name
        {
            get { return _name; }
        }

        public int ModelYear
        {
            get { return _modelYear; }
        }


        public override string ToString()
        {
            return $"Car name: {Name} -  Car color: {Color} -  Car Model: {ModelYear}";
        }

    }

}
