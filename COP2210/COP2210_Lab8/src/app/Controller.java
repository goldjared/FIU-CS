package app;

import toolkit.ArrayProcessor;
import vehicle.Car;

import java.util.Arrays;
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
    System.out.println();

  ArrayProcessor.findCarWithBestMPG(cars);
  ArrayProcessor.findCarWithWorstMPG(cars);
  System.out.printf("Car Average Price: $%.2f\n", ArrayProcessor.averageOfCarPrices(cars));

  System.out.println();
  System.out.println("======================================");
  System.out.println("2d Arrays");
  System.out.println("======================================");

    int[][] arrayWithinArrayOfInts = {{1}, {1,2}, {1,2,3}, {1,2,3,4}};
    for(int i = 0; i < arrayWithinArrayOfInts.length; i++) {
      System.out.print(" { ");
      for(int j = 0; j < arrayWithinArrayOfInts[i].length; j++) {
        System.out.print(arrayWithinArrayOfInts[i][j]);
        if(j + 1 != arrayWithinArrayOfInts[i].length) {
          System.out.print(", ");
        }
      }

      System.out.print(" } ");
      System.out.printf((arrayWithinArrayOfInts[i].length % 2 == 0) ? "\t\t" : "\t");
      System.out.printf("Average of Array Entry: %.1f", ArrayProcessor.averageOfIntArray(arrayWithinArrayOfInts[i]));
      System.out.println();

    }
  }




  public static void yourInfoHeader() {
    // fill in
  }
}
