using System.Diagnostics;

namespace Shapes
{
    public class ShapeFactory
    {
        private Shape _result = null;
        private double[] parameters; 

        public ShapeFactory(Shape s, double[] parameters)
        {
            this.parameters = parameters;
            if (s is Rectangle) _result = new Rectangle(parameters[0], parameters[1]);
            else if (s is Circle) _result = new Circle(parameters[0]);
            else if (s is Triangle) _result = new Triangle(parameters[0], parameters[1]);
        }
        

        public void getResult()
        {
            _result.PrintInformation(); 
        }
        
    }
}