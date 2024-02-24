// create abstract class with 2 member values, and 2 abstract methods. The abstract methods within
// the class will require any class extending 'Shape' to also implement those methods.
public abstract class Shape {
	private String name;
	private String color;
	
	abstract double calculateArea();
	
	abstract double calculatePerimeter();
	
	// Setters and getters
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getColor() {
		return color;
	}
	
	void setColor(String color) {
		this.color = color;
	}
}


