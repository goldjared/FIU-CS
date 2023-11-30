import java.util.ArrayList;

public class Bowl {
  private ArrayList<Fruit> fruits;
  private String color;
  private int size;

  public Bowl(ArrayList<Fruit> fruits, String color, String
              size) {
    this.fruits=fruits;
    this.color=color;
    this.size= Integer.parseInt(size);
  }

  public ArrayList<Fruit> getFruits() { return fruits;}
  public void setFruits(ArrayList<Fruit> fruits) {
    this.fruits=fruits;
  }
  public String getColor(){return color;}
  public void setColor(String color) {
    this.color=color;
  }
  public int getSize() { return size;}
  public void setSize(int size) {this.size = size;}
  public void displayInfo() {
    //
  }
}
