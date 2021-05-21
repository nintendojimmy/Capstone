public class HourlyEmployee extends Employee{
    double numOfHoursWorked;
    double HourlyRate;

    public HourlyEmployee( double HourlyRate, double numOfHoursWorked){
        this.HourlyRate = HourlyRate;
        this.numOfHoursWorked = numOfHoursWorked;
    }

    public double calculateEarnings( double HourlyRate, double numOfHoursWorked){
        double earnings;
        earnings = HourlyRate * numOfHoursWorked;
        return earnings;
    }
}
