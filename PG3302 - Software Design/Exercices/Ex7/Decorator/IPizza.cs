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
    //Our pizza interface. All of our base pizzas must use these methods.
    public interface IPizza
    {
        double GetPrice();
        string GetDescription();
    }
}
