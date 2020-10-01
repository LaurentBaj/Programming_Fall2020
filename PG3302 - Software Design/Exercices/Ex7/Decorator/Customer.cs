using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Decorator {
    class Customer : ThreadProxy {

        PizzaStore _pizzaStore;
        string _name;

        public Customer (string name, PizzaStore pizzaStore) {
            _name = name;
            _pizzaStore = pizzaStore;
        }

        protected override void Task () {
            while (!_pizzaStore.HasPizzas && _running) ;
            IPizza bought = _pizzaStore.BuyPizza();
            if (bought != null) {
                Console.WriteLine("{0} bought a {1}", _name, bought.GetDescription());
            }
        }

    }

}
