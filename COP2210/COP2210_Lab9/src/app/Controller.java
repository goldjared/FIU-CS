package app;

import living.Person;
import things.*;

import java.util.ArrayList;
import java.util.Random;

public class Controller {
  public static void main(String[] args) {
    yourInfoHeader();
    Random rndGen = new Random();
    Person person = new Person("Mike", "Johnson");
    BookBag bookbag = new BookBag(person);
    person.setBookBag(bookbag);

    for(int i = 0; i<5; i++) {
      int areaCode = rndGen.nextInt(900) + 100;
      int threeDigit = rndGen.nextInt(900) + 100;
      int fourDigit= rndGen.nextInt(9000) + 1000;

      String phoneNumber = "(" + areaCode + ")-"+ threeDigit +"-" + fourDigit;
      Phone newPhone = new Phone(phoneNumber);
      bookbag.getItems().add(newPhone);
    }

    String[] subjects = {"Math", "Chemistry", "Economics", "CS", "Physics", "History"};
    for(int i = 0; i<4; i++) {
      Book newBook = new Book(subjects[rndGen.nextInt(6)], rndGen.nextDouble(151)+50);
      bookbag.getItems().add(newBook);
    }

    PencilBag pencilBag = new PencilBag();
    bookbag.getItems().add(pencilBag);
    String[] colors = {"Red", "Black", "Green", "Blue"};
    for(int i = 0; i<5; i++) {
      Pen newPen = new Pen(colors[rndGen.nextInt(4)], rndGen.nextDouble(3.01)+1);
      pencilBag.getPens().add(newPen);
    }



    bookbag.displayItems();

    System.out.println();
    System.out.println("--------------------------------");
    System.out.println("Total Price of Possessions");
    System.out.println("--------------------------------");
    System.out.printf("Total: $%.2f\n", person.totalPriceOfPossessions());



  }

  public static void yourInfoHeader() {
    //write
  }
}
