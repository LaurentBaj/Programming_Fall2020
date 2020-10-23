using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Text;

namespace WarGame_Flyweight_Ex
{
    class SoldierFactory
    {
        private static ISoldier _soldier; 

        public static ISoldier getSoldier()
        {
            return _soldier ?? ( _soldier = new SoldierImp() );  // Teacher's note: "This is a singleton. Return soldier if it exists, create and then return it if it doesn't"
        }
    }
}
