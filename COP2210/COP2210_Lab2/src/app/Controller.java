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
    double year2InvestmentValue = year1InvestmentValue * year2InterestRate + year1InvestmentValue;
    double year3InvestmentValue = year2InvestmentValue * year3InterestRate + year2InvestmentValue;
    double year4InvestmentValue = year3InvestmentValue * year4InterestRate + year3InvestmentValue;

    double totalInterestEarned = year4InvestmentValue - initialInvestment;
    System.out.println("USING PRINTLN");
    System.out.println("initialInvestment: \t\t\t" + initialInvestment);
    System.out.println("year1InvestmentValue: \t\t" + year1InvestmentValue);
    System.out.println("year2InvestmentValue: \t\t" + year2InvestmentValue);
    System.out.println("year3InvestmentValue: \t\t" + year3InvestmentValue);
    System.out.println("year4InvestmentValue: \t\t" + year4InvestmentValue);
    System.out.println("totalInterestEarned: \t\t" + totalInterestEarned);
    System.out.println();

    System.out.println("USING PRINTF with format -> right justified, 10 min places,2 decimal places");
    // is this supposed to be %-10.2, and use tabs to make it match? as well as for below USINGPRINTF
    System.out.printf("initialInvestment: %22.2f \n", initialInvestment);
    System.out.printf("year1Investment: %24.2f \n", year1InvestmentValue);
    System.out.printf("year2Investment: %24.2f \n", year2InvestmentValue);
    System.out.printf("year3Investment: %24.2f \n", year3InvestmentValue);
    System.out.printf("year4Investment: %24.2f \n", year4InvestmentValue);
    System.out.printf("totalInterestEarned: %20.2f", totalInterestEarned);

    double circleDiameter = 17.3543;
    double circleRadius= circleDiameter / 2;
    double circleCircumference = 2 * Math.PI * circleRadius;
    double circleArea = Math.PI * Math.pow(circleRadius, 2);
    printStepHeader(5);
    System.out.println("USING PRINTF with format -> left justified, 10 min places,4 decimal places");
    System.out.printf("circleDiameter: \t\t\t%-10.4f \n", circleDiameter);
    System.out.printf("circleRadius: \t\t\t\t%-10.4f \n", circleRadius);
    System.out.printf("circleCircumference: \t\t%-10.4f \n", circleCircumference);
    System.out.printf("circleArea: \t\t\t\t%-10.4f", circleArea);

    double rectangleHeight = 19.4;
    double rectangleWidth = 34.7;
    double triangleHeight = 16.4;
    double triangleBase = 20.1;
    double rectanglePerimeter = 2 * (rectangleHeight + rectangleWidth);
    double rectangleArea = rectangleHeight * rectangleWidth;
    double triangleHypotenuse = Math.sqrt(Math.pow(triangleBase, 2) + Math.pow(triangleHeight, 2));
    double trianglePerimeter = triangleBase + triangleHeight + triangleHypotenuse;
    double triangleArea = 0.5 * (triangleBase * triangleHeight);
    double totalPerimeter = trianglePerimeter + rectanglePerimeter;
    double totalArea = triangleArea + rectangleArea;

    printStepHeader(6);
//    System.out.println("USING PRINTF with format -> right justified, 8 min places,1 decimal places");
//    System.out.printf("rectangleHeight: \t\t\t%8.1f \n", rectangleHeight);
//    System.out.printf("rectangleWidth: \t\t\t%8.1f \n", rectangleWidth);
//    System.out.printf("triangleHeight: \t\t\t%8.1f \n", triangleHeight);
//    System.out.printf("rectanglePerimeter: \t\t%8.1f \n", rectanglePerimeter);
//    System.out.printf("rectangleArea: \t\t\t\t%8.1f \n", rectangleArea);
//    System.out.printf("triangleHypotenuse: \t\t%8.1f \n", triangleHypotenuse);
//    System.out.printf("trianglePerimeter: \t\t\t%8.1f \n", trianglePerimeter);
//    System.out.printf("triangleArea: \t\t\t\t%8.1f \n", triangleArea);
//    System.out.printf("totalPerimeter: \t\t\t%8.1f \n", totalPerimeter);
//    System.out.printf("totalArea: \t\t\t\t\t%8.1f \n", totalArea);

    double airflow = 1.253;
    double x = 1.392;
    double y = 0.72;
    double z = 4.2932;

    double temp1 = Math.cos(Math.pow(airflow, 3));
    double temp2 = Math.pow(Math.E, 6 * x * Math.pow(y, 4));
//    double temp3 = ;
//    double temp4 = ;
//    double temp5 = ;
//    double temp6 = ;



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
    System.out.println("===================================");
    System.out.println("Step: " + stepNumber);
    System.out.println("===================================");
  }
}
