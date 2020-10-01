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
    //All toppings will inherit from this ToppingDecorator class to be able to be added to any pizza in the pizza-shop.
    public abstract class ToppingDecorator : IPizza
    {
        //Each topping will need to know to which pizza it is being added to.
        private readonly IPizza _originalPizza;

        protected ToppingDecorator(IPizza originalPizza) {
            _originalPizza = originalPizza;
        }

        //This method will return cumulative price of both pizza and the topping.
        public virtual double GetPrice() {
            return _originalPizza.GetPrice();
        }

        //This method will concatinate all the strings describing the pizza and its toppings.
        public virtual string GetDescription() {
            return _originalPizza.GetDescription();
        }
    }
}
