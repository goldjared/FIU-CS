public class ShapeTest {
	public static void main(String[] args) {
		System.out.println("ShapeTest:");
		System.out.println("---------------------------------------------");
		// Creating and manipulating Circle and Rectangle objects
		Circle circle = new Circle("Circle", "Red", 5);
		Rectangle rectangle = new Rectangle("Rectangle", "Blue", 4, 6);
		
		System.out.println("Circle:");
		System.out.println("Name: " + circle.getName());
		System.out.println("Color: " + circle.getColor());
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Area: " + circle.calculateArea());
		System.out.println("Perimeter: " + circle.calculatePerimeter());
		circle.resize(50);
		System.out.println("Resized Circle - Radius: " + circle.getRadius());
		
		System.out.println("---------------------------------------------");
		System.out.println("Rectangle:");
		System.out.println("Name: " + rectangle.getName());
		System.out.println("Color: " + rectangle.getColor());
		System.out.println("Length: " + rectangle.getLength());
		System.out.println("Width: " + rectangle.getWidth());
		System.out.println("Area: " + rectangle.calculateArea());
		System.out.println("Perimeter: " + rectangle.calculatePerimeter());
		rectangle.resize(50);
		System.out.println("Resized Rectangle - Length: " + rectangle.getLength() + ", Width: " + rectangle.getWidth());
		System.out.println("---------------------------------------------");
		
		System.out.println("***BONUS SHAPES***");
		System.out.println("---------------------------------------------");
		// Creating and manipulating Square and Triangle objects
		Square square = new Square("Pink", "Square", 5);
		Triangle triangle = new Triangle("Triangle", "Black", 3, 6, 10);
		
		System.out.println("Square:");
		System.out.println("Name: " + square.getName());
		System.out.println("Color: " + square.getColor());
		System.out.println("Side: " + square.getSide());
		System.out.println("Area: " + square.calculateArea());
		System.out.println("Perimeter: " + square.calculatePerimeter());
		square.resize(50);
		System.out.println("Resized square - Side: " + square.getSide());
		
		System.out.println("---------------------------------------------");
		System.out.println("Triangle:");
		System.out.println("Name: " + triangle.getName());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Side1: " + triangle.getSide1() + ", Side2: " + triangle.getSide2());
		System.out.println("Base: " + triangle.getBase());
		System.out.println("Area: " + triangle.calculateArea());
		System.out.println("Perimeter: " + triangle.calculatePerimeter());
		triangle.resize(50);
		System.out.println("Resized triangle - Side1: " + triangle.getSide1() + ", Side2: " + triangle.getSide2() + ", Base: " + triangle.getBase());
	}
}
