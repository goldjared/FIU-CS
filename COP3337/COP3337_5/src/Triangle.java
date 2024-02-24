// class extends abstract class 'Shape' and implements the interface 'Resizeable'
public class Triangle extends Shape implements Resizeable {
	private double length;
	private double base;
	private double side1;
	private double side2;
	
	public Triangle(String name, String color, double side1, double side2, double base) {
		setColor(color);
		setName(name);
		this.length = Math.max(side1, side2);
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	// getters and setters
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	// following the implemented interface, create the resize method
	public void resize(int percent) {
		double percentDeci = (double) percent / 100;
		base += percentDeci * base;
		side1 += percentDeci * side1;
		side2 += percentDeci * side2;
		length = Math.max(side1, side2);
	}
	
	// using polymorphism to override the abstract method
	@Override
	double calculateArea() {
		return 0.5 * base * length;
	}
	
	// using polymorphism to override the abstract method
	@Override
	double calculatePerimeter() {
		return base + side1 + side2;
	}
}
