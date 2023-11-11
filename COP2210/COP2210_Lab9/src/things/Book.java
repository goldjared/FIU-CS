package things;

public class Book {
  private String subject;
  private double price;
  public Book(String subject, double price) {

  }

  public String getSubject() {
    return subject;
  }

  public double getPrice() {
    return price;
  }

    public void displayInfo() {
      System.out.printf("Type->Book-> \t\tSubject: %s \t\t\tPrice: %f", getSubject(), getPrice());
    }

}
