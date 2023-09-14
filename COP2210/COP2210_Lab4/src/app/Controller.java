package app;

import vehicle.Car;

import java.util.Random;

public class Controller {
  public static void main(String[] args) {
    yourInfoHeader();

    Car c1 = new Car();
    c1.displayInfo();

    Car c2 = new Car();
    c2.displayInfo();

    Car c3 = new Car();
    c3.displayInfo();
  }

  public static void yourInfoHeader() {
    //insert here
  }
}
