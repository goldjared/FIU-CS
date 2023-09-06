package app;

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
}
