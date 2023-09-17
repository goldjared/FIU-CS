package app;

import vehicle.Car;

import java.util.Random;

public class Controller {
  public static void main(String[] args) {
    yourInfoHeader();

    Car c1 = new Car();
    c1.displayInfo();

    Car.classDisplayInfo();

    Car c2 = new Car("White", 4);
    c2.displayInfo();

    Car c3 = new Car("Black", 2);
    c3.displayInfo();

    Car c4 = new Car("Blue", 4, 38500, 10432);
    c4.displayInfo();


    System.out.println();
    System.out.println("-------------------");
    System.out.println("working with instance method");
    System.out.println("-------------------");
    c4.setNumberOfDoors(2);
    c4.setColor("Green");
    c4.displayInfo();

    System.out.println();
    System.out.println("-------------------");
    System.out.println("working with public instance variable");
    System.out.println("-------------------");
    c2.displayInfo();
    c2.doYouLikeIt = "No";
    c2.displayInfo();

    System.out.println();
    System.out.println();
    System.out.println("-------------------");
    System.out.println("working with build-in string method");
    System.out.println("-------------------");
    System.out.println();
    System.out.printf("Color of instance c1: \t\t\t\t\t\t\t%s\n", c1.getColor());
    System.out.printf("Length of Color of instance c1: \t\t\t%d\n", c1.getColor().length());
    System.out.println();

    System.out.println("Car ID of instance c2: \t\t\t\t\t\t\t" + c2.getCarID());
    System.out.printf("Index of 'd' of c2's CarID: \t\t\t\t\t%d\n", c2.getCarID().indexOf("d"));
    System.out.println();

    System.out.println("Car ID of instance c2: \t\t\t\t\t\t\t" + c2.getCarID());
    System.out.printf("Index of '0' of c2's CarID: \t\t\t\t%d\n", c2.getCarID().indexOf("o"));
    System.out.println();

    System.out.println("Car ID of instance c2: \t\t\t\t\t\t\t" + c2.getCarID());
    System.out.printf("Index of the second 'o' of c2's CarID: \t\t%d", c2.getCarID().indexOf("o", 6));
    System.out.println();


  }

  public static void yourInfoHeader() {
    //insert here
  }
}
