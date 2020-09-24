using System;

namespace Shapes
{
    public class Circle : Shape
    {
        private double _r;  
        public Circle(double r = 0)
        {
            _r = r; 
        }
        
        public override void PrintInformation()
        {
            Console.WriteLine("Circle { Radius: " + _r +", Diameter: " + _r * 2 + ", Area: " + this.GetArea() + " }");
        }

        public override double GetArea()
        {
            return Math.PI * _r * _r; 
        }
    }
}