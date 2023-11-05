package toolkit;

import vehicle.Car;

import java.util.Random;

public class ArrayProcessor {
  private static int eventsProcessed = 0;

  public static int getEventsProcessed() {
    return eventsProcessed;
  }

  public static int[] createArrayWithInts(int sizeOfArray, int min, int max) {
    eventsProcessed++;
    Random rndGen = new Random();

    int[] array = new int[sizeOfArray];

    for(int i = 0; i < sizeOfArray; i++) {
//      System.out.println(rndGen);
      array[i] = rndGen.nextInt(max-min) + min;
    }
    return array;
  }

  public static void displayElementsOfIntArray(int[] array) {
    eventsProcessed++;

    System.out.println("=====================================");
    System.out.println("displayElementsOfIntArray");
    System.out.println("=====================================");
    for(int i = 0; i<array.length; i++) {
      if(i>= array.length-1) {
        System.out.print(array[i] + "\n");

      } else {
        System.out.print(array[i] + ", ");
      }
    }
  }

  public static double averageOfIntArray(int[] array) {
  eventsProcessed++;
  double sum = 0;
  for(int i = array.length-1; i>=0; i--) {
    sum += array[i];
  }

  return sum / array.length;
  }

  public static void findCarWithBestMPG(Car[] cars) {
    Car maxValueCarObj = cars[0];
  for(int i = 1; i < cars.length; i++) {
    if(maxValueCarObj.getMPG() < cars[i].getMPG()) {
      maxValueCarObj = cars[i];
    }
  }

    System.out.println("=====================================");
    System.out.println("findCarWithBestMPG");
    System.out.println("=====================================");
    maxValueCarObj.displayInfo();
    System.out.println();
  }

  public static void findCarWithWorstMPG(Car[] cars) {

    Car minValueCarObj = cars[0];
    for(int i = 1; i < cars.length; i++) {
      if(minValueCarObj.getMPG() > cars[i].getMPG()) {
        minValueCarObj = cars[i];
      }
    }

    System.out.println("=====================================");
    System.out.println("findCarWithWorstMPG");
    System.out.println("=====================================");
    minValueCarObj.displayInfo();
    System.out.println();
  }

  public static double averageOfCarPrices(Car[] cars) {
    double priceHolder = cars[0].getPrice();
    for(int i = 1; i < cars.length; i++) {
      priceHolder += cars[i].getPrice();
      }
    return priceHolder / cars.length;

  }


}
