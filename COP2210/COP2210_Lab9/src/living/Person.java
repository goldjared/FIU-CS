package living;

import things.*;

public class Person {
  private String firstName;
  private String lastName;
  private BookBag bookBag;

  public Person (String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
//    this.bookBag.setOwner(this);

  }

 public String getFirstName() {
    return firstName;
 }

 public void setFirstName(String firstName) {
    this.firstName = firstName;
 }
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName= lastName;
  }

  public BookBag getBookBag() {
    return bookBag;
  }

  public void setBookBag(BookBag bookBag) {
    this.bookBag = bookBag;
  }

  public double totalPriceOfPossessions() {
    double totalPrice = 0;
//    System.out.println(getBookBag().getItems().get(0) + "HERE");


    for(Object item: getBookBag().getItems()) {
      if(item instanceof Phone) {
        totalPrice+=((Phone) item).getPrice();
      } else if(item instanceof Book) {
        totalPrice+=((Book) item).getPrice();
      } else if(item instanceof Pen) {
        totalPrice+=((Pen) item).getPrice();
      }
    }

    return totalPrice;
  }




}
