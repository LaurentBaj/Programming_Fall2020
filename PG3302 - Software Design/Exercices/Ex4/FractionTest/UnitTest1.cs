using NUnit.Framework;


namespace FractionTest
{
    public class FractionTest
    {
        [SetUp]
        public void AffirmFractionValue()
        {
            var a = new Fraction(2, 5);
            
        }

        [Test]
        public void AffirmAdditionFunctionality()
        {
            Assert.Pass();
        }
    }
}