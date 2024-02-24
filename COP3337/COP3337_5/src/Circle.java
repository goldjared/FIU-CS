// class extends abstract class 'Shape' and implements the interface 'Resizeable'
public class Circle extends Shape implements Resizeable {
	private double radius;
	
	public Circle(String name, String color, double radius) {
		setColor(color);
		setName(name);
		this.radius = radius;
	}
	
	// getters and setters
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// using polymorphism to override the abstract method
	@Override
	double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	// using polymorphism to override the abstract method
	@Override
	double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	
	// following the implemented interface, create the resize method
	public void resize(int percent) {
		double percentDeci = (double) percent / 100;
		radius += percentDeci * radius;
	}
}
