package things;
public class Pen {
  private String color;
  private double price;

  public Pen(String color, double price) {

  }

  public String getColor() {
    return color;
  }

  public double getPrice() {
    return price;
  }

  public void displayInfo() {
    System.out.printf("Type->Pen-> \t\tColor: %s \t\t\tPrice: %f", getColor(), getPrice());
  }
}