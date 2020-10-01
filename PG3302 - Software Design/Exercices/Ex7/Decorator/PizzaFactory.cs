using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Decorator {
    static class PizzaFactory {

        public static IPizza CreateRandomPizza() {

            Random rn = new Random();
            IPizza pizza = new PlainPizza(rn.Next(20,100));

            if (rn.Next(2) == 1) {
                pizza = new ExtraCheeseTopping(pizza);
            } else if (rn.Next(2) == 1) {
                pizza = new JalapenoTopping(pizza);
            } else if (rn.Next(2) == 1) {
                pizza = new MushroomTopping(pizza);
            }

            return pizza;
            
        }

    }
}
