package app;

import static app.Controller.*;

public class Helper {
  public static void displayInfo() {
    System.out.println("\n=====================================");
    System.out.println("DISPLAYINFO FROM HELPER CLASS");
    System.out.println("=====================================");
  }

  public static void complexArea(int circleMultiplier, int rectangleMultiplier, int triangleMultiplier) {
    double results = circleMultiplier * calculateAreaOfCircle(10.7) + rectangleMultiplier * calculateAreaOfRectangle(14.2, 20.7)+ triangleMultiplier * calculateAreaOfTriangle(33.2, 16.2);
    System.out.println("\n======================================");
    System.out.println("COMPLEXAREA FROM HELPER CLASS");
    System.out.println("======================================");
    System.out.printf("Result: \t\t\t\t%.3f", results);
    System.out.printf("\ncircleMultiplier: \t\t%d", circleMultiplier);
    System.out.printf("\nrectangleMultiplier: \t%d", rectangleMultiplier);
    System.out.printf("\ntriangleMultiplier: \t%d", triangleMultiplier);
  }
}
