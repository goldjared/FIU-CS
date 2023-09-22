package buildingunit;

public class Room {
  private String type;
  private String color;
  private double length;
  private double width;
  private double temperature;

  public Room(String type, String color, double length, double width, double temperature) {
    this.type = type;
    this.color = color;
    this.length = length;
    this.width = width;
    this.temperature = temperature;
  }

  public String getType() {return type;}
  public void setType(String type) {
    this.type = type;
  }

  public String getColor() {return color;}
  public void setColor(String color) {
    this.color = color;
  }

  public double getLength() {return length;}

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {return width;}
  public void setWidth(double width) {
    this.width = width;
  }
  public double getTemperature(){return temperature;}
  public void setTemperature(double temperature) {
    this.temperature = temperature;
  }
  public void roomStats(String tabs) {
    System.out.println("=============================");
    System.out.println(tabs + "Room Stats: " + type);
    System.out.println("=============================");
    System.out.println(tabs + "Type: \t\t\t " + type);
    System.out.println(tabs + "Color: \t\t\t " + color);
    System.out.printf(tabs + "Temperature: %9.2f\n", temperature);
    System.out.printf(tabs + "Length: \t\t%-4.2f\n", length);
    System.out.printf(tabs + "Width: %.2f\n", width);
    System.out.printf(tabs + "Square feet: %9.2f", calculateSquareFeet());
    System.out.println();
  }

  private double calculateSquareFeet() {
  return length * width;
  }
}
