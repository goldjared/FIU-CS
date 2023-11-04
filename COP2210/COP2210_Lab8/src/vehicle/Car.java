package vehicle;

import java.util.Random;

public class Car {
  private static final String VIN = "VIN-";
  private static int carID = 1000;
  private static String[] colors = {"White", "Red", "Blue", "Green", "Black"};
  private static int minMPG = 10;
  private static int maxMPG = 50;
  private static int minPrice = 25000;
  private static int maxPrice = 65000;

  String vin;
  String color;
  double mpg;
  double price;


  public Car() {
    Random rndGen = new Random();
    this.color = colors[rndGen.nextInt(colors.length)];
    this.mpg = rndGen.nextInt(maxMPG-minMPG + 1) + minMPG;
    this.price = rndGen.nextInt(maxPrice-minPrice + 1) + minPrice;
    this.vin = VIN + carID++;
  }

  public static String[] getColors() {
    return colors;
  }

  public static int getMinMPG() {
    return minMPG;
  }
  public static int getMaxMPG() {
    return maxMPG;
  }

  public static int getMinPrice() {
    return minPrice;
  }
  public static int getMaxPrice() {
    return maxPrice;
  }

  public String getVin() {
    return vin;
  }

  public String getColor() {
    return color;
  }

  public double getMPG() {
    return mpg;
  }

  public double getPrice() {
    return price;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setMPG(double mpg) {
    this.mpg = mpg;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void displayInfo() {
    System.out.printf("VIN: %s\tColor: %-8s Price: %.2f\t\tMPG: %.2f\n", getVin(), getColor(), getPrice(), getMPG());
  }

}
