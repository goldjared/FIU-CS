package app;

import static app.PrintHeader.printStepHeader;

public class Controller {
  public static void main(String[] args) {
    yourInfoHeader();

    printStepHeader(1);
    for (int i = -10; i<=10; i++) {
      System.out.println("The value of i is: " + i);
    }

    printStepHeader(2);
    for(int k = 0; k<=8; k+=2) {
      System.out.println("The value of k is: " + k);
    }

    printStepHeader(3);
    for(int l = 10; l>0; l--) {
      System.out.println("The value of l is: " + l);
    }

    printStepHeader(4);
    
    for(int i = 0; i<=20; i++) {

      String evenOrOdd = i%2 == 0
                    ? "even"
                    : "odd";

      System.out.printf("The value of i is: " + i);
      System.out.printf("\t\t%s\n", evenOrOdd);
    }

    printStepHeader(5);
    for(int i = 0; i<=20; i++) {

      String evenOrOdd = i%2 == 0
              ? "even"
              : "odd";

      System.out.printf("The value of i is: " + i);
      if(i<10) {

        System.out.printf("\t\t%s\n", evenOrOdd);
      } else {
        System.out.printf("\t%s\n", evenOrOdd);

      }

    }

    printStepHeader(6);
    for (int row = 0; row<10; row++) {
      for(int col=0; col<15; col++) {
        System.out.print("X\t");
      }
      System.out.println();
    }

    printStepHeader(7);
    for (int row = 0; row<10; row++) {
      for(int col=0; col<10; col++) {
        if(row%2 == 0) {
          String xOrO = col%2 == 0
                  ? "X"
                  : "O";
          System.out.print(xOrO + " \t");
        } else {
          System.out.print("o \t");
        }

      }
      System.out.println();
    }

    printStepHeader(8);
    for (int row = 0; row<10; row++) {
      for(int col=0; col<10; col++) {
          String xOrO = row == col
                  ? "X"
                  : "O";
          System.out.print(xOrO + " \t");
      }
      System.out.println();
    }

    printStepHeader(9);
    for (int row = 0; row<10; row++) {
      for(int col=0; col<10; col++) {
        String xOrO = row == col || col == 9 - row
                ? "X"
                : "O";
        System.out.print(xOrO + " \t");
      }
      System.out.println();
    }

    printStepHeader(10);
    for (int row = 0; row<10; row++) {
      for(int col=0; col<10; col++) {
        String xOrO = col>=5 && 2<=row && row<=7
                ? "X"
                : "O";
        System.out.print(xOrO + " \t");
      }
      System.out.println();
    }

    printStepHeader(11);
    for (int row = 0; row<10; row++) {
      for(int col=0; col<10; col++) {
       if(row%2 == 0) {
         System.out.print("X \t");
       } else {
         if(col == 2 || col == 5 || col == 8) {
           System.out.print("X \t");
         } else {
           System.out.print("O \t");
         }
       }
      }
      System.out.println();
    }

  }
  public static void yourInfoHeader() {
  //insert here
  }
}
