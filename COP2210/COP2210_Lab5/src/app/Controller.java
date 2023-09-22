package app;


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
  }

  public static void yourInfoHeader() {
    //insert here
  }
}
