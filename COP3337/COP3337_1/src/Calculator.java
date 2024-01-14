import java.util.Scanner;

public class Calculator {

private double value;

// constructor, creates instance with initial value set to 0.0
public Calculator() {
	this.value = 0.0;
}

// take double parameter and set instance value equal to itself added by val
public void add(double val) {
	this.value += val;
}

// take double parameter and set instance value equal to itself subtracted by val
public void subtract(double val) {
	this.value -= val;
}

// take double parameter and set instance value equal to itself multiplied by val
public void multiply(double val) {
	this.value *= val;
}

// take double parameter and set instance value equal to itself divided by val
public void divide(double val) {
	this.value /= val;
}

// sets instance value to 0.0
public void clear() {
	this.value = 0.0;
}

// returns the private field value associated with instance
public double getValue() {
	return value;
}

public static void main(String[] args) {
	Calculator calc = new Calculator();
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter Input 1: ");
	double num1 = keyboard.nextDouble();
	System.out.print("Enter Input 2: ");
	double num2 = keyboard.nextDouble();
// 1. The initial value
	System.out.println(calc.getValue());
// 2. The value after adding num1
	calc.add(num1);
	System.out.println(calc.getValue());
// 3. The value after multiplying by 3
	calc.multiply(3);
	System.out.println(calc.getValue());
// 4. The value after subtracting num2
	calc.subtract(num2);
	System.out.println(calc.getValue());
// 5. The value after dividing by 2
	calc.divide(2);
	System.out.println(calc.getValue());
// 6. The value after calling the clear() method
	calc.clear();
	System.out.println(calc.getValue());
}
}
