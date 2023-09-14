package vehicle;


import java.util.Random;

public class Car {

  // UML underline mean static
  private static int vehicleCounter = 2000;
  private static final String CAR_FACTORY_ID = "Norwood";

  private String carID;
  private String color;
  private String factory;
  private int numberOfDoors;
  private double price;
  private int mileage;
  public String doYouLikeIt;

  public Car() {
    carID = "VIN-" + CAR_FACTORY_ID + "-" + vehicleCounter;
    vehicleCounter = vehicleCounter + 1;
    factory = CAR_FACTORY_ID;
    numberOfDoors = 2;
    color = "Red";
    mileage = 0;

    Random rn = new Random();
    int min = 35000;
    int max = 45000;

    price = min + rn.nextInt(max - min ) + rn.nextDouble();

    doYouLikeIt = "yes";
  }

  public Car(String color, int numberOfDoors) {

  }

  public Car(String color, int numberOfDoors, double price, int mileage) {

  }

  public static int getVehicleCounter() {
    return vehicleCounter;
  }

  public static void setVehicleCounter(int vehicleCounter) {

  }

  public String getCarID() {
    return carID;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getFactory() {
    return factory;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  public double getPrice() {
    return price;
  }

  public static void classDisplayInfo() {
    System.out.println("-------------------");
    System.out.println("Car Class Info");
    System.out.println("-------------------");
    System.out.println("vehicleCounter: \t\t\t" + vehicleCounter);
    System.out.println("CAR_FACTORY_ID: \t\t\t" + CAR_FACTORY_ID);
  }

  public void displayInfo() {
    System.out.println("-------------------");
    System.out.println("Car Info");
    System.out.println("-------------------");
    System.out.println("carID: \t\t\t " + carID);
    System.out.println("Factory: \t\t\t " + factory);
    System.out.println("NumberOfDoors: \t\t\t " + numberOfDoors);
    System.out.println("Color: \t\t\t " + color);
    System.out.println("Mileage: \t\t\t " + mileage);
    System.out.printf("Price: \t\t\t %.2f \n", price);
    System.out.println("doYouLikeIt: \t\t\t " + doYouLikeIt);

  }

}
