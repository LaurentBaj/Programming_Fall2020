using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Text;

namespace WarGame_Flyweight_Ex
{
    class SoldierClient
    {
        private readonly ISoldier _soldier = SoldierFactory.getSoldier(); 

        int _currentLocationX; 
        int _currentLocationY;

        public void MoveSoldier(int newLocationX, int newLocationY)
        {
            _soldier.MoveSoldier(_currentLocationX, _currentLocationY, newLocationX, newLocationY);

            _currentLocationX = newLocationX; 
            _currentLocationY = newLocationY;
        }
    }
}
