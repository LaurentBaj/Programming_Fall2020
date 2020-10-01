///////////////////////////////////////////////////////////////////////////////////////////////////
//
// Decorator pattern example, heavily inspired by blog article by Ruchit Surati.
// Original article/code found here: http://www.dofactory.com/Patterns/PatternSingleton.aspx#_self1
//
// Modified in 2016 by Philip Christensen, Westerdals Oslo ACT.
// Modified in 2016 by Tomas Sandnes, Westerdals Oslo ACT.
//
///////////////////////////////////////////////////////////////////////////////////////////////////

namespace Decorator
{
    //All your pizzas will inherit from this PlainPizza class to identify themselves as pizzas.
    public class PlainPizza : IPizza
    {
        private readonly double _price;
        private readonly string _description;

        public PlainPizza(double price, string description = "Plain pizza") {
            _price = price;
            _description = description;
        }

        // This method returns the price of the pizza object with all toppings.
        public virtual double GetPrice() {
            return _price;
        }

        // This method returns the description of the pizza object with all toppings.
        public virtual string GetDescription() {
            return _description;
        }
    }
}
