using NUnit.Framework;
using CarFactory; 

namespace CarFactoryTest
{
    public class Tests
    {
        [TestCase("Volkswagen")]
        public void AffirmCarName(string name)
        {
            var a = new Car();

            a.Name = name;

            Assert.IsTrue(a.name == name);
        }
    }
}