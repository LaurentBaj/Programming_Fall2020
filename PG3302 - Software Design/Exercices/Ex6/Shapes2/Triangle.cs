using System;
using System.Text;

namespace Shapes2
{
    public class Triangle : Shape
    {
        public double LengthA { get; private set; }
        public double LengthB { get; private set; }
        public double LengthC { get; private set; }

        public Triangle(double lengthA, double lengthB, double lengthC) {
            LengthA = lengthA;
            LengthB = lengthB;
            LengthC = lengthC;
        }
        
        public override double GetArea()
        {
            // Using Heron's Formula:
            double halfPerimeter = (LengthA + LengthB + LengthC) / 2;
            return Math.Sqrt(halfPerimeter * (halfPerimeter - LengthA) * (halfPerimeter - LengthB) * (halfPerimeter - LengthC));
        }

        public override void PrintInformation() {
            StringBuilder builder = new StringBuilder();
            builder.Append("Triangle\n");
            builder.AppendFormat(" - {0}: {1}\n", "Side A length", LengthA);
            builder.AppendFormat(" - {0}: {1}\n", "Side B length", LengthB);
            builder.AppendFormat(" - {0}: {1}\n", "Side C length", LengthC);
            builder.AppendFormat(" - {0}: {1}\n", "Area", GetArea());
            Console.WriteLine(builder.ToString());
        }
    }
}