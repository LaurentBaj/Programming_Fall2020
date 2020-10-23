using System;

namespace WarGame_Flyweight_Ex
{
    class Program
    {
        static void Main(string[] args)
        {
            SoldierClient[] soldiers = { new SoldierClient(), new SoldierClient(), new SoldierClient() };

            soldiers[0].MoveSoldier(22, 12); 
            soldiers[1].MoveSoldier(12, 32);
            soldiers[2].MoveSoldier(132, 322);

            Console.ReadLine(); 
        }
    }
}
