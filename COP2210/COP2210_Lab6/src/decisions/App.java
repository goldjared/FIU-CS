package decisions;

public class App {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("-----------------------------");
    System.out.println("Step: 2");
    System.out.println("-----------------------------");
    System.out.println("");

    if(4<5) {
      System.out.println("Four is less than 5");
    } else {
      System.out.println("Four is not less than 5");
    }
    System.out.println("");
    System.out.println("-----------------------------");
    System.out.println("Step: 3");
    System.out.println("-----------------------------");
    System.out.println("");

    int cookTime = 8;
    if(cookTime == 10) {
      System.out.println("Cook time is 10 minutes");
    } else if(cookTime == 9){
      System.out.println("Cook time is 9 minutes");
    } else if(cookTime == 8) {
      System.out.println("Cook time is 8 minutes");
    } else if(cookTime == 7){
      System.out.println("Cook time is 7 minutes");
    } else {
      System.out.println("Cook time is under 7 minutes");
    }

  }
    System.out.println("");
    System.out.println("-----------------------------");
    System.out.println("Step: 4");
    System.out.println("-----------------------------");
    System.out.println("");

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the option number for the class you are in");
    System.out.println("-------------------------------------------------");
    System.out.println("1 - COP2210");
    System.out.println("2 - COP3337");
    System.out.println("-----------------------------");
    System.out.println("Please enter a value: ");

    int userInput = sc.nextInt();

    if(userInput == 1) {
    System.out.println("\nYou are in the COP2210");
  } else if (userInput == 2) {
    System.out.println("\nYou are in the COP3337");

  } else {
    System.out.println("\nYou enter a wrong option");
  }
    System.out.println("");
    System.out.println("-----------------------------");
    System.out.println("Step: 5");
    System.out.println("-----------------------------");
    System.out.println("");

    String stateName1 = "Florida";
    String stateName2 = "Colorado";

    if(stateName1.equals("Florida")){
    System.out.println("You are in Florida");
  }
    System.out.println("");

    if(stateName1.equals(stateName2)){
    System.out.println("The two states do not have the same name");
  }

    if(stateName1.equals("Florida") && stateName2.equals("Colorado")) {
    System.out.println("StateName1 is Florida");
    System.out.println("StateName2 is Colorado");
  } else {
    System.out.println("You have the wrong state names");
  }
    System.out.println("");
    System.out.println("-----------------------------");
    System.out.println("Step: 6");
    System.out.println("-----------------------------");
    System.out.println("");

    System.out.print("Enter your name:")
  // STEP 6 LEFT OFF
}
