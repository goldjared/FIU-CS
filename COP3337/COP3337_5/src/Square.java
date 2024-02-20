public class Square extends Shape implements Resizeable {
	private double side;
	
	public Square(String color, String name, double side) {
		setColor(color);
		setName(name);
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public void resize(int percent) {
		double percentDeci = (double) percent / 100;
		side = percentDeci * side;
	}
	
	@Override
	double calculateArea() {
		return Math.pow(side, 2);
	}
	
	@Override
	double calculatePerimeter() {
		return 4*side;
	}
}
