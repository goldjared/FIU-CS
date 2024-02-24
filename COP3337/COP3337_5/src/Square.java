// class extends abstract class 'Shape' and implements the interface 'Resizeable'
public class Square extends Shape implements Resizeable {
	private double side;
	
	public Square(String name, String color, double side) {
		setColor(color);
		setName(name);
		this.side = side;
	}
	
	// getters and setters
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	// following the implemented interface, create the resize method
	@Override
	public void resize(int percent) {
		double percentDeci = (double) percent / 100;
		side = percentDeci * side;
	}
	
	// using polymorphism to override the abstract method
	@Override
	double calculateArea() {
		return Math.pow(side, 2);
	}
	
	// using polymorphism to override the abstract method
	@Override
	double calculatePerimeter() {
		return 4*side;
	}
}
