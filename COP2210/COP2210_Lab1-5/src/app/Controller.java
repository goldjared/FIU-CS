package app;

public class Controller {
  public static void main(String[] args) {
    yourInfoHeader();
    int x = 10;
    double y = 20.3;
    double z = x + y;

    System.out.println("The value of x = " + x);
    System.out.println("The value of y = " + y);
    System.out.println("The value of z = " + z);
    System.out.println();

    String name = "John Doe";
    double hourlyWage = 35.50;
    double hoursWorked = 38.25;
    System.out.printf("name: \t\t\t %-20s \n", name);
    System.out.printf("hourlyWage: \t %-20s \n", hourlyWage);
    System.out.printf("hoursWorked: \t %-20s \n", hoursWorked);
    System.out.println();
    System.out.printf("name: %s ", name);
    System.out.println();
    System.out.printf("name: %s ", name);
    System.out.printf("hourlyWage: %.4f ", hourlyWage);
    System.out.println();
    System.out.printf("name: %-14s", name);
    System.out.printf("hourlyWage: %-19.4f", hourlyWage);
    System.out.printf("hoursWorked: %.3f \n", hoursWorked);
    System.out.println();

    double weekPay = hoursWorked * hourlyWage;
    System.out.printf("name: %17s\n", name);
    System.out.printf("hourlyWage: %7.1f\n", hourlyWage);
    System.out.printf("hoursWorked: %7.2f\n", hoursWorked);
    System.out.printf("Employee: %s -> Weekly Pay is: $%.2f", name, weekPay);
  }
  public static void yourInfoHeader() {
    System.out.println("================================");
    System.out.println("PROGRAMMER: " + "Replace Text");
    System.out.println("PANTHER ID: " + "Replace Text");
    System.out.println();
    System.out.println("CLASS: \t\t COP2210 ");
    System.out.println("SECTION: \t " + "replace text");
    System.out.println("SEMESTER: \t " + "replace text");
    System.out.println("CLASSTIME: \t " + "replace text");
    System.out.println();
    System.out.println("Assignment: " + "replace text");
    System.out.println();
    System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
    System.out.println("that this work is my own and that none of it is the");
    System.out.println("work of any other person.");
    System.out.println("================================");
    System.out.println();
  }
}

