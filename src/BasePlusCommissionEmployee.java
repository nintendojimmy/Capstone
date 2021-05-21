public class BasePlusCommissionEmployee extends Employee{
    double baseSalary;

    public BasePlusCommissionEmployee(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double calculateEarnings( double commission, double TotalSalesAmount, double baseSalary){
        double earnings;
        earnings = commission * TotalSalesAmount + baseSalary;
        return earnings;
    }

}
