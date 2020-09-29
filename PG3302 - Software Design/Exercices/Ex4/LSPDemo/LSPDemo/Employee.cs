namespace LSPDemo
{
    public class Employee
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public Employee Manager { get; set; } = null;
        public decimal Salary { get; set; }
        
        public virtual void AssignManager(Employee manager)
        {
            Manager = Manager;
        }

        public virtual void CalculatePerHourRate(int rank)
        {
            decimal baseAmount = 12.50m;
            Salary = baseAmount + (rank* 2);
        }
    }
}