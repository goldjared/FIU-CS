package app;

import static app.Helper.complexArea;
import static app.Helper.displayInfo;

public class Controller {
    public static void main(String[] args) {
        yourInfoHeader();
        displayHeaderForPartA();

        double radius = 8.25;
        double area = calculateAreaOfCircle(radius);
        displaySingleResult(area, "calculateAreaOfCircle");
        int value1 = 5;
        double value2 = 59.5;
        multipleNumbersIntAndDouble(value1, value2);
        calculateAreaOfTriangleWithOutput(36.3, 18.2);

        double base = 17.16332;
        double height = 20.172391;
        double width = 20.51723;
        System.out.printf("\nTriangle info -> \t\tbase: %.3f \t\theight: %.5f \tarea: %.2f", base, height,  calculateAreaOfTriangle(base, height));
        System.out.printf("\nRectangle info -> \t\theight: %.4f \twidth: %.1f \t\tarea: %.5f", height, width,  calculateAreaOfRectangle(height, width));

        displayInfo();
        double result = calculateAreaOfCircle(9.3) + calculateAreaOfRectangle(9.4, 17.2) + calculateAreaOfTriangle(21.5, 10.3);
        System.out.printf("Value of result: \t\t%.6f", result);

        complexArea(4,12,5);

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
    public static void displayHeaderForPartA() {
        System.out.println("============================");
        System.out.println("SECTION Lab3a");
        System.out.println("============================");
    }
    public static double calculateAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    public static void displaySingleResult(double value, String methodName) {

        System.out.println("============================");
        System.out.println(methodName);
        System.out.println("============================");
        System.out.printf("Value: \t\t\t%-10.4f", value);
    }
    public static void multipleNumbersIntAndDouble(int firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        System.out.printf("\nRunning multipleNumbersIntAndDouble -> %d, %.1f\n", firstNumber, secondNumber);
        System.out.println("\tfirstNumber: \t" + firstNumber);
        System.out.println("\tsecondNumber: \t" + secondNumber);
        System.out.printf("\tResult: \t\t" + result);
        System.out.println();
    }
    public static void calculateAreaOfTriangleWithOutput(double base, double height) {
        double areaOfTriangle = (double) 1/2 * base * height;
        displaySingleResult(areaOfTriangle, "calculateAreaOfTriangleWithOutput");


    }

    public static double calculateAreaOfTriangle(double base, double height) {
      return (double) 1/2 * base * height;
    }

    public static double calculateAreaOfRectangle(double height, double width) {
        return height * width;
    }
}
