public class Human {
  private int age;
  private Car car;
  public Human(String age) {
    this.age=Integer.parseInt(age);
  }
  public Human(Car car, String age) {
    this.age=Integer.parseInt(age);
    this.car=car;
  }


  public Car getCar(){return car;}
  public void setCar(Car car) {
  this.car=car;
  }
  public int getAge() { return age;}
  public void setAge(int age) {this.age= age;}
  public void displayInfo() {
    System.out.printf("Type->Human-> Age: %d\n", age);
  }

}
