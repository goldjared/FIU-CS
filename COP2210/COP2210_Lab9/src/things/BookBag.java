package things;

import living.Person;

import java.util.ArrayList;

public class BookBag {
  private Person owner;
  private ArrayList<String> items;

  public BookBag(Owner person) {
    this.items = new ArrayList<>();
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