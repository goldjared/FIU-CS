package app;

import toolkit.ArrayProcessor;
import vehicle.Car;

import java.util.Random;

import static toolkit.ArrayProcessor.createArrayWithInts;

public class Controller {
  public static void main(String[] args) {
    yourInfoHeader();


for(int i = 0; i<5;i++) {

  int[] arr1 = ArrayProcessor.createArrayWithInts(10,-100,1000);
  ArrayProcessor.displayElementsOfIntArray(arr1);
  System.out.println("Array Average: " + ArrayProcessor.averageOfIntArray(arr1));
  System.out.println();
    }

  Car[] cars = new Car[15];
  for(int i = 0; i < cars.length; i++) {
    cars[i] = new Car();
    cars[i].displayInfo();
  }

  }

  public static void yourInfoHeader() {
    // fill in
  }
}
