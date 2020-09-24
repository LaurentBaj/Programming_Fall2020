using System;
using System.Text;

namespace Shapes2
{
    public class Circle : Shape
    {
        public double Radius { get; private set; }
        public double Diameter { get { return 2 * Radius; } }

        public Circle(double radius) {
            Radius = radius;
        }

        public override double GetArea() {
            return Math.PI * Radius * Radius;
        }

        public override void PrintInformation() {
            StringBuilder builder = new StringBuilder();
            builder.Append("Circle\n");
            builder.AppendFormat(" - {0}: {1}\n", "Radius", Radius);
            builder.AppendFormat(" - {0}: {1}\n", "Diameter", Diameter);
            builder.AppendFormat(" - {0}: {1}\n", "Area", GetArea());
            Console.WriteLine(builder.ToString());
        }
    }
}