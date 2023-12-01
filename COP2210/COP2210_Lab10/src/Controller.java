import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {
  public static void main(String[] args) {
    //Step 0
    yourInfoHeader();
//--------------------------
// Step 1
//--------------------------
    System.out.println();
    System.out.println();
    System.out.println("=========================================");
    System.out.println("Data.txt output");
    System.out.println("=========================================");
    try {
// use this if you are on a mac
      String fileLocation = "./Data/data.txt";

      BufferedReader br = new BufferedReader(new FileReader("./Data/data.txt"));
      String line;
      String strCurrentLine;
      while ((strCurrentLine = br.readLine()) != null) {
        System.out.println(strCurrentLine);
      }//end while
    } catch (IOException e) {
      e.printStackTrace();
    }


    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<Human> humans = new ArrayList<>();
    ArrayList<Fruit> fruits = new ArrayList<>();
    ArrayList<Bowl> bowls;


    try {
// use this if you are on a mac
      String fileLocation = "./Data/data.txt";

      BufferedReader br = new BufferedReader(new FileReader("./Data/data.txt"));
      String line;
      String strCurrentLine;
      while ((strCurrentLine = br.readLine()) != null) {
        String[] tokens = strCurrentLine.split(",");
        if(tokens[0].equals("Car")) {
          Car createdCar = new Car(tokens[1], tokens[2], tokens[3]);
          cars.add(createdCar);
        } else if(tokens[0].equals("Human")) {
          if(tokens.length > 2) {
            Car createdCarForHuman = new Car(tokens[4], tokens[5], tokens[6]);
            cars.add(createdCarForHuman);
            Human createdHumanWithCar = new Human(createdCarForHuman, tokens[1]);
            humans.add(createdHumanWithCar);
          } else {
            Human createdHuman = new Human(tokens[1]);
            humans.add(createdHuman);
          }
        } else if(tokens[0].equals("Fruit")) {
          Fruit createdFruit = new Fruit(tokens[1], tokens[2]);
          fruits.add(createdFruit);
        }
      }//end while
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println();
    System.out.println("=========================================");
    System.out.println("Car List");
    System.out.println("=========================================");
    for(Car car:cars) {
      car.displayInfo();
    }
    System.out.println();
    System.out.println("=========================================");
    System.out.println("Human List");
    System.out.println("=========================================");

    for(Human human:humans) {
      human.displayInfo();
      // if human has a Car, call display on said Car
      if(human.getCar() != null) {
        System.out.print("\t\t");
        human.getCar().displayInfo();
      }
      System.out.println();
      System.out.println("=========================================");
      System.out.println("Fruit List");
      System.out.println("=========================================");

      for(Fruit fruit:fruits) {
        fruit.displayInfo();
      }
    }

  }
  public static void yourInfoHeader() {
    //
  }
}
