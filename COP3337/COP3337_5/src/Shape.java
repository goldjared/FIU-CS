public abstract class Shape {
	private String name;
	private	String color;
	
	abstract double calculateArea();
	abstract double calculatePerimeter();
	
	String getName() { return name; }
	void setName(String name) { this.name = name;}
	String getColor() { return color; }
	void setColor(String color) { this.color= color;}
}


