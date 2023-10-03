package app;


import building.House;
import buildingunit.Room;
import cooling.AC;

public class Controller {
  public static void main(String[] args) {
    yourInfoHeader();
    AC.acStats();

    Room kitchen = new Room("Kitchen", "White", 15.5, 10.0, 78);
    kitchen.roomStats("");

    Room livingRoom = new Room("Living Room", "Tan", 25.00, 20.70, 76.50);
    livingRoom.roomStats("");

    Room bathroom = new Room("Bathroom", "White", 15.00, 10.00, 74.30);
    bathroom.roomStats("");

    Room bedroom = new Room("Bedroom", "Blue", 8.00, 8.00, 78.00);
    bedroom.roomStats("");

    House myHouse = new House(kitchen, livingRoom, bedroom, bathroom);
    myHouse.displayInfo();

    System.out.println("--------------------------------------------------");
    System.out.println("What is the house's total square feet: " +myHouse.getHouseSquareFeet());
    System.out.println("--------------------------------------------------");
    System.out.println();

    AC.acStats();

    System.out.println("--------------------------------------------------");
    System.out.println("Call by Value ");
    System.out.println("--------------------------------------------------");
    System.out.println();

    AC.changeTemperatureDown(livingRoom.getTemperature(), 5);
    livingRoom.roomStats("");

    AC.changeTemperatureDown(myHouse.getKitchen().getTemperature(), 3);
    myHouse.getKitchen().roomStats("");
    AC.acStats();

    System.out.println("--------------------------------------------------");
    System.out.println("Call by reference ");
    System.out.println("--------------------------------------------------");
    System.out.println();

    AC.changeTemperatureDown(livingRoom, 5);
    livingRoom.roomStats("");

    AC.changeTemperatureDown(myHouse.getKitchen(), 3);
    myHouse.getKitchen().roomStats("");
    AC.acStats();
  }

  public static void yourInfoHeader() {
    //insert here
  }
}
