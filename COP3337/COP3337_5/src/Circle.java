public class Circle extends Shape implements  Resizeable {
	private double radius;
	
	public Circle(String name, String color, int radius) {
		setColor(color);
		setName(name);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public void resize(int percent) {
		double percentDeci = (double) percent / 100;
		radius += percentDeci * radius;
	}
}
