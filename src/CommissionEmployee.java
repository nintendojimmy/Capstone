public class CommissionEmployee extends Employee{
    final double commission = 10.0;
    double TotalSalesAmount;

    public CommissionEmployee( double TotalSalesAmount){

        this.TotalSalesAmount = TotalSalesAmount;
    }

    public double calculateEarnings( double commission, double TotalSalesAmount){
        double earnings;
        earnings = commission * TotalSalesAmount;
        return earnings;
    }
}
