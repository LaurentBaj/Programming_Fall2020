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
    public class ExtraCheeseTopping : ToppingDecorator
    {
        public ExtraCheeseTopping(IPizza originalPizza)
            : base(originalPizza) {
        }

        public override double GetPrice() {
            return base.GetPrice() + 0.99;
        }

        public override string GetDescription() {
            return base.GetDescription() + " with extra cheese";
        }
    }
}
