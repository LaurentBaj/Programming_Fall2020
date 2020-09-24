namespace Shapes2
{
    enum ShapeType { Circle, Rectangle, Triangle };

    class ShapeFactory
    {
        // Private constructor to not instantiate this class.
        private ShapeFactory() {}

        public static Shape Create(ShapeType type, float[] parameters) {
            Shape shape = null;
            switch (type) {
                case ShapeType.Circle:
                    shape = new Circle(parameters[0]);
                    break;
                case ShapeType.Rectangle:
                    shape = new Rectangle(parameters[0], parameters[1]);
                    break;
                case ShapeType.Triangle:
                    shape = new Triangle(parameters[0], parameters[1], parameters[2]);
                    break;
            }
            return shape;
        }
    }
}