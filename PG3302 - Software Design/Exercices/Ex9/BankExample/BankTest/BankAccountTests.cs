using BankExample;
using NUnit.Framework;
using System;

namespace BankTest
{
    public class BankAccountTests
    {
        [SetUp]
        public void TestCorrectWithdrawal()
        {
           
        }

        [TestCase(100, 100, 200)]
        [TestCase(100, 0, 100)]

        public void Credit_NonNegativeAmount_UpdateBalance(double initialBalance, double amount, double expected)
        {
            // Arrange
            var account = new BankAccount("Laurent", initialBalance);

            // Act
            account.Credit(amount);

            // Assert
            Assert.IsTrue(account.Balance == expected); 
        }

        [Test]
        public void Credit_NegativeAmount_ThrowsExepctions()
        {
            // Arrange 
            var account = new BankAccount("Laurent", 1000);

            // Act and Assert
            Assert.Throws<ArgumentOutOfRangeException>(() => account.Debit(-12));  
        }

        public void Debit_AmountGreaterThanBalance_ThrowsException()
        {
            // Arrange 
            var account = new BankAccount("Laurent",100);

            // Act and Assert
            Assert.Throws<ArgumentOutOfRangeException>(() => account.Debit(101));
        }

        public void Debit_CorrectWithdrawal()
        {
            // Arrange 
            var account = new BankAccount("Laurent", 100);

            // Act
            account.Debit(50);

            // Assert
            Assert.IsTrue(account.Balance == 50); 
        }

    }
}