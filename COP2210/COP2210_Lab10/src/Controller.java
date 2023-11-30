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
    ArrayList<Human> humans;
    ArrayList<Fruit> fruits;
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
        }
      }//end while
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println();
    System.out.println("=========================================");
    System.out.println("Car List");
    System.out.println("=========================================");
    for(int i=0; i< cars.size(); i++) {
      cars.get(i).displayInfo();
    }

  }
  public static void yourInfoHeader() {
    //
  }
}
