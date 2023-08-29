package app;

public class Controller {
  public static void main(String[] args) {
    yourInfoHeader();
    int minutes = 33;
    int hours = 15;
    int days = 4;

    int secondsInMinute = minutes * 60;
    printStepHeader(1);
    int secondsInHour = hours * 60 * 60;
    printStepHeader( 2);
    int secondsInDay = days * 24 * 60 * 60;
    printStepHeader( 3);
    int totalSeconds = secondsInMinute + secondsInHour + secondsInDay;
    System.out.printf("Number of seconds in %d days, %d hours, and %d minutes is %d", days, hours, minutes, totalSeconds);

    printStepHeader( 4);
    double initialInvestment = 125000;
    double year1InterestRate = 0.05;
    double year2InterestRate = 0.09;
    double year3InterestRate = -0.035;
    double year4InterestRate = 0.07;

    double year1InvestmentValue = initialInvestment * year1InterestRate + initialInvestment;
    double year2InvestmentValue = initialInvestment * year2InterestRate + year1InvestmentValue;
    double year3InvestmentValue = initialInvestment * year3InterestRate + initialInvestment;
    double year4InvestmentValue = initialInvestment * year4InterestRate + initialInvestment;

    double totalInterestEarned = (year1InvestmentValue + year2InvestmentValue + year3InvestmentValue
            + year4InvestmentValue) - (initialInvestment * 4);
    System.out.println("initialInvestment: " + initialInvestment);
    System.out.println("year1InvestmentValue: " + year1InvestmentValue);
    System.out.println("year2InvestmentValue: " + year2InvestmentValue);
    System.out.println("year3InvestmentValue: " + year3InvestmentValue);
    System.out.println("year4InvestmentValue: " + year4InvestmentValue);
    System.out.println("totalInterestEarned: " + totalInterestEarned);
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

  public static void printStepHeader(int stepNumber) {
    System.out.println();
    System.out.println();
    System.out.println("================================");
    System.out.println("Step: " + stepNumber);
    System.out.println("================================");
  }
}
