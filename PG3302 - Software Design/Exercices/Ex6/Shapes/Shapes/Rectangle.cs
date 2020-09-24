using System;

namespace Shapes
{
    public class Rectangle : Shape
    {
        private double _l, _w;

        public Rectangle(double w = 0, double l = 0)
        {
            _l = l;
            _w = w; 
        }


        public override void PrintInformation()
        {
            Console.WriteLine("Rectangle { " + "Length: " + _l + ", Width: " + _w + ", Area: " + this.GetArea() + " }");
        }

        public override double GetArea()
        {
            return _l * _w; 
        }
    }
}