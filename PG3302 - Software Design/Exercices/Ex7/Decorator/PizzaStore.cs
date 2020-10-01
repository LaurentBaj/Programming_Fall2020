using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;

namespace Decorator {
    class PizzaStore : ThreadProxy {

        List<IPizza> _pizzas;
        Random rn;

        private readonly object _lock = new object();

        public bool HasPizzas { get => _pizzas.Count > 0; }

        public PizzaStore () {
            _pizzas = new List<IPizza>();
            rn = new Random();
        }

        protected override void Task () {
            Thread.Sleep(rn.Next(50, 400));
            MakePizza();
        }

        public IPizza BuyPizza () {
            lock (_lock) {
                if (_pizzas.Count > 0) {
                    IPizza pizzaToSell = _pizzas[0];
                    _pizzas.RemoveAt(0);
                    return pizzaToSell;
                } else {
                    return null;
                }
            }
        }

        void MakePizza () {
            lock (_lock) {
                _pizzas.Add(PizzaFactory.CreateRandomPizza());
            }
        }

    }

}
