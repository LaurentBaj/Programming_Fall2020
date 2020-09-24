using System;

namespace Shapes
{
    public class Triangle : Shape
    {
        private double _l, _h;

        public Triangle(double l = 0, double h = 0)
        {
            _l = l;
            _h = h; 
        }


        public override void PrintInformation()
        {
            Console.WriteLine("Rectangle { " + "Length: " + _l + ", Height: " + _h + ", Area: " + this.GetArea() + " }");
        }

        public override double GetArea()
        {
            return (_l * _h) / 2; 
        }
    }
}