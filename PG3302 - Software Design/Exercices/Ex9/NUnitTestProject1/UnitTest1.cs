using NUnit.Framework;

namespace NUnitTestProject1
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