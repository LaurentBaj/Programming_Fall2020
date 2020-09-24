using System;

namespace Shapes
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            Shape s1 = new Circle(7);
            Shape s2 = new Rectangle(5, 7);
            Shape s3 = new Triangle(5, 6); */
            
            ShapeFactory s1 = new ShapeFactory(new Triangle(), new []{5.0, 6});
            ShapeFactory s2 = new ShapeFactory(new Circle(), new []{3.0});
            ShapeFactory s3 = new ShapeFactory(new Rectangle(), new []{5, 3.2});
            
            s1.getResult();
            s2.getResult();
            s3.getResult();
        }
    }
}