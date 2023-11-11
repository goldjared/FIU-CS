package things;
public class Pen {
  private String color;
  private double price;

  public Pen(String color, double price) {
  this.color = color;
  this.price = price;
  }

  public String getColor() {
    return color;
  }

  public double getPrice() {
    return price;
  }

  public void displayInfo() {
    System.out.printf("Type->Pen-> \t\tColor: %-23s Price: %7.2f\n", getColor(), getPrice());
  }
}