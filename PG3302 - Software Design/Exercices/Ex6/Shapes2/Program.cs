using System;

namespace Shapes2
{
    class Program
    {
        public static void Main(string[] arguments) {
            Shape[] shapes = {
                ShapeFactory.Create( ShapeType.Circle, new float[] {2.0f} ),
                ShapeFactory.Create( ShapeType.Rectangle, new float[] {2.0f, 4.0f} ),
                ShapeFactory.Create( ShapeType.Triangle, new float[] {2.0f, 4.0f, 5.0f} ),
            };

            foreach (Shape shape in shapes) {
                shape.PrintInformation();
            }

            Pause();
        }

        private static void Pause() {
            Console.WriteLine("\nPress any key to continue ...\n");
            Console.ReadKey(true);
        }
    }
}