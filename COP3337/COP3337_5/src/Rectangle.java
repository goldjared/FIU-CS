public class Rectangle extends Shape implements Resizeable {
	private double length;
	private double width;
	
	public Rectangle(String color, String name, double length, double width) {
		setColor(color);
		setName(name);
		this.length = length;
		this.width = width;
	}
	
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
	
	@Override
	double calculateArea() {
		return width*length;
	}
	
	@Override
	double calculatePerimeter() {
		return 2 * (length + width);
	}
	
	@Override
	public void resize(int percent) {
		double percentDeci = (double) percent / 100;
		length += percentDeci * length;
		width += percentDeci * width;
	}
}
