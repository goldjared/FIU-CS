package things;

import java.util.Random;

public class Phone {

  private String number;
  private double price;

  public Phone(String number) {
  Random rndGen = new Random();
  this.price = rndGen.nextDouble(1451-150) + 150;
  this.number = number;
  }

  public String getNumber() {
    return number;
  }

  public double getPrice() {
    return price;
  }

  public void displayInfo() {
    System.out.printf("Type->Phone-> \t\t%-30s Price: %7.2f\n", getNumber(), getPrice());
  }
}
