package app;

import toolkit.ArrayProcessor;

import java.util.Random;

import static toolkit.ArrayProcessor.createArrayWithInts;

public class Controller {
  public static void main(String[] args) {
    yourInfoHeader();

int[] arr2 = createArrayWithInts(10,-100,1000);
int[] arr3 = createArrayWithInts(10,-100,1000);
int[] arr4 = createArrayWithInts(10,-100,1000);
int[] arr5 = createArrayWithInts(10,-100,1000);
for(int i = 0; i<5;i++) {

  int[] arr1 = ArrayProcessor.createArrayWithInts(10,-100,1000);
  ArrayProcessor.displayElementsOfIntArray(arr1);
  System.out.println("Array Average: " + ArrayProcessor.averageOfIntArray(arr1));
  System.out.println();
    }

  }

  public static void yourInfoHeader() {
    // fill in
  }
}
