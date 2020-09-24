using System;
using System.Text;

namespace Shapes2
{
    public class Rectangle : Shape
    {
        public double Length { get; private set; }
        public double Width { get; private set; }

        public Rectangle(double length, double width) {
            Length = length;
            Width = width;
        }

        public override double GetArea() {
            return Length * Width;
        }

        public override void PrintInformation() {
            StringBuilder builder = new StringBuilder();
            builder.Append("Rectangle\n");
            builder.AppendFormat(" - {0}: {1}\n", "Length", Length);
            builder.AppendFormat(" - {0}: {1}\n", "Width", Width);
            builder.AppendFormat(" - {0}: {1}\n", "Area", GetArea());
            Console.WriteLine(builder.ToString());
        }
    }
}