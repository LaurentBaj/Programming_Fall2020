using System;
using System.Collections.Generic;
using System.Text;

namespace WarGame_Flyweight_Ex
{
    interface ISoldier
    {
        void MoveSoldier(int previousLocationX, int previousLocationY, int newLocationX, int newLocationY); 
    }
}
