import java.io.*;
import java.util.Scanner;

public class main {

    static int numberOfEntries(String pathname){
        int lineNumber = 0;

        //Read each line and increment lineNumber for each line
        try {

            File employeeData = new File(pathname);
            Scanner myReader = new Scanner(employeeData);

            //Read each line of the file and increment lineNumber
            while (myReader.hasNextLine()) {myReader.nextLine();lineNumber++;};
            //close resources
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return lineNumber;
    }

    public static void main(String args[]){
        String dataSig = "EmployeeId, FirstName, LastName, numOfHoursWorked, HourlyRate, BaseSalary, TotalSalesAmount";
        String pathname = "src/employeeData";

        boolean TEST = false; //set to true to use test functionality
        if(TEST) {
            pathname = "src/TESTemployeeDataTemp";
            employeeFactory employeeFactory = new employeeFactory(1,pathname,dataSig);
        }

        System.out.println("Lines: " + (numberOfEntries(pathname) - 1) );

        //Read employeeData.txt line by line and create a new object for  each line
        try {

            File myObj = new File(pathname);
            Scanner myReader = new Scanner(myObj);


            //Read each line of the file
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                //Create an employee object for each line
                //Determine which type employee to create
                //if numbers of hour worked is not blank create an hourly employee
                //if base salary is not blank create a basepluscommision employee
                //else create a commission employee

                System.out.println(data);

            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}