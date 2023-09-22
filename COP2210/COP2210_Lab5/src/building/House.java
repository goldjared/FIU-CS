package building;

public class House {
  private Room kitchen = new Room();
  private Room livingRoom = new Room();
  private Room bedroom = new Room();
  private Room bathroom = new Room();

  House (Room kitchen, Room livingRoom, Room bedroom, Room bathroom) {

  }

  public Room getKitchen() {
    return kitchen;
  }
  public Room getLivingRoom() {
    return livingRoom;
  }
  public Room getBedroom() {
    return bedroom;
  }
  public Room getBathroom() {
    return bathroom;
  }

  public void displayInfo() {

  }

  public double getHouseSquareFeet() {

  }

  private double calculateHouseSquareFeet() {
    
  }

}
