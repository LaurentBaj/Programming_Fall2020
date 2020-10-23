using System;
using System.Collections.Generic;
using System.Text;

namespace WarGame_Flyweight_Ex
{
    class SoldierImp : ISoldier
    {
        public void MoveSoldier(int previousLocationX, int previousLocationY, int newLocationX, int newLocationY)
        {
            Console.WriteLine("Soldier moves from :location |{0}, {1}| TO location |{2},{3}|", previousLocationX, previousLocationY, newLocationX, newLocationY);
        }
    }
}
