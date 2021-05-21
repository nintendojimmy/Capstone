import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Random;

public class employeeFactory {
    int numberEmployees; //number of employees to generate
    String pathname;
    String dataSig;

    public employeeFactory( int numberEmployees, String pathname, String dataSig){
        this.numberEmployees = numberEmployees;
        this.pathname = pathname;
        this.dataSig = dataSig;

        try {
            writeTestData(numberEmployees,pathname,dataSig);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeTestData(int numberEmployees,String pathname, String dataSig) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(pathname));

        pw.write(dataSig+ "\n");//appends comma separated values of column headers

        for(int i = 0; i < numberEmployees; i += 3){
            pw.write(createHourlyEmployee() + "\n");
            pw.write(createBasePlusCommissionEmployee() + "\n");
            pw.write(creatCommissionEmployee() + "\n");
        }
        pw.close();
    }

    static String createHourlyEmployee(){
        String EmployeeID = generateEmployeeID();
        String FirstName = generateFirstName();
        String LastName = generateLastName();
        String numOfHoursWorked = generatenumOfHoursWorked();
        String HourlyRate = generateHourlyRate();
        String BaseSalary = "        ";
        String TotalSalesAmount = "        ";

        return EmployeeID + "," + FirstName + "," + LastName + "," + numOfHoursWorked + "," + HourlyRate + ","
                + BaseSalary + "," + TotalSalesAmount;
    }

    static String createBasePlusCommissionEmployee(){
        String EmployeeID = generateEmployeeID();
        String FirstName = generateFirstName();
        String LastName = generateLastName();
        String numOfHoursWorked = "        ";
        String HourlyRate = "        ";
        String BaseSalary = generateBaseSalary();
        String TotalSalesAmount = generateTotalSalesAmount();


        return EmployeeID + "," + FirstName + "," + LastName + "," + numOfHoursWorked + "," + HourlyRate + ","
                + BaseSalary + "," + TotalSalesAmount;
    }

    static String creatCommissionEmployee(){
        String EmployeeID = generateEmployeeID();
        String FirstName = generateFirstName();
        String LastName = generateLastName();
        String numOfHoursWorked = "        ";
        String HourlyRate = "        ";
        String BaseSalary = "        ";
        String TotalSalesAmount = generateTotalSalesAmount();

        return EmployeeID + "," + FirstName + "," + LastName + "," + numOfHoursWorked + "," + HourlyRate + ","
                + BaseSalary + "," + TotalSalesAmount;
    }

    static String generateEmployeeID(){
        String EmployeeID = "";
        Random rand = new Random();
        for (int i = 0; i < 10;i++){EmployeeID += String.valueOf(rand.nextInt(9));
        }
        return EmployeeID;
    }

    static String generateFirstName(){
        Random rand = new Random();
        String[] firstnameArray = {"James","Richard","Nancy","Leon","Azra","Khalid"};
        String FirstName = firstnameArray[rand.nextInt(firstnameArray.length)];
        return FirstName;
    }

    static String generateLastName(){
        Random rand = new Random();
        String[] lastnameArray = {"Nogler","Woodworth","Jennings","Johnson","Robinson"};
        String LastName = lastnameArray[rand.nextInt(lastnameArray.length)];
        return LastName;
    }

    static String generatenumOfHoursWorked(){
        Random rand = new Random();
        String numbOfHoursWorked = String.valueOf(rand.nextInt(9)) + String.valueOf(rand.nextInt(9)) + "." +
                                    String.valueOf(rand.nextInt(9));
        return numbOfHoursWorked;
    }

    static String generateHourlyRate(){
        Random rand = new Random();
        String HourlyRate = "";
        HourlyRate += String.valueOf(rand.nextInt(100));
        return HourlyRate;
    }

    static String generateBaseSalary(){
        Random rand = new Random();
        String BaseSalary = "";
        BaseSalary += String.valueOf(rand.nextInt(1000));
        return BaseSalary;
    }

    static String generateTotalSalesAmount(){
        Random rand = new Random();
        String TotalSalesAmount = "";
        TotalSalesAmount += String.valueOf(rand.nextInt(10000));
        return TotalSalesAmount;
    }+

    static String makeLong(String short int length){
        String long =
        return
    }
}
