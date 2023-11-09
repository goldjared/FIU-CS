package things;

import living.Person;

import java.util.ArrayList;

public class BookBag {
  private Person owner;
  private ArrayList<String> items = new ArrayList<>();

  public BookBag(Owner person) {

  }

  public Person getOwner() {
    return owner;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public ArrayList<String> getItems() {
    return items;
  }

  public void listItems() {

  }

  public void displayItems() {

  }
}