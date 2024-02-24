// class extends abstract class 'Shape' and implements the interface 'Resizeable'
public class Rectangle extends Shape implements Resizeable {
	private double length;
	private double width;
	
	public Rectangle(String color, String name, double length, double width) {
		setColor(color);
		setName(name);
		this.length = length;
		this.width = width;
	}
	
	// getters and setters
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	// using polymorphism to override the abstract method
	@Override
	double calculateArea() {
		return width * length;
	}
	
	// using polymorphism to override the abstract method
	@Override
	double calculatePerimeter() {
		return 2 * (length + width);
	}
	
	// following the implemented interface, create the resize method
	@Override
	public void resize(int percent) {
		double percentDeci = (double) percent / 100;
		length += percentDeci * length;
		width += percentDeci * width;
	}
}
