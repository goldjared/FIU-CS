package app;

import lib.*;

import java.util.Scanner;

public class Controller {
	// Scanner static member variable, utilized throughout class for user input
	private static final Scanner sc = new Scanner(System.in);
	
	// method to display library codes available
	public static void displayCodes() {
		System.out.println("Library Input Codes: ");
		System.out.println("1. Add item");
		System.out.println("2. Add member");
		System.out.println("3. Borrow item");
		System.out.println("4. Return item");
		System.out.println("5. Display library");
		System.out.println("6. Exit");
		
	}
	
	// loop runs until the scanner has string input, and that input cannot be blank. returns string input
	public static String getNonEmptyStringInput(String prompt) {
		String string = "";
		while (string.isEmpty()) {
			System.out.print(prompt);
			string = sc.nextLine();
		}
		return string;
	}
	
	public static LibraryItem choice1() {
		// utilize method for get input values, preventing blank value
		String title = getNonEmptyStringInput("Enter title: ");
		String creator = getNonEmptyStringInput("Enter creator: ");
		
		// loop runs while the scanner does not have integer input, when it has integer input loop exits, and
		// itemId is declared as scanner input.
		System.out.print("Enter numerical item ID: ");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid input.");
			System.out.print("Enter numerical item ID: ");
			sc.next();
		}
		int itemId = sc.nextInt();
		// clearing the scanner buffer
		sc.nextLine();
		
		String bOrD = null;
		boolean isBOrD = false;
		// while bOrD does not equal either letter B or D, this loop will run.
		while (!isBOrD) {
			System.out.print("Is it a book or a DVD ('B' or 'D'): ");
			bOrD = sc.nextLine();
			if (!(bOrD.equalsIgnoreCase("B") || bOrD.equalsIgnoreCase("D"))) {
				System.out.println("Invalid input.");
				continue;
			} else {
				// bOrD equals the desired values, set boolean to true to exit loop.
				isBOrD = true;
			}
		} // end isNot bOrD loop
		
		// conditional prints text based on letter input
		if (bOrD.equalsIgnoreCase("B")) {
			System.out.print("Enter genre: ");
		} else {
			System.out.print("Enter director: ");
		}
		// string value for above conditional text
		String varyingStringVal = sc.nextLine();
		
		// conditional to get prompt value depending on text input
		String bOrDPrompt = bOrD.equalsIgnoreCase("B") ? "Enter number of pages: " : "Enter DVD duration (minutes): ";
		System.out.print(bOrDPrompt);
		// loop runs so long as the input is not an integer
		while (!sc.hasNextInt()) {
			System.out.println("Invalid input.");
			System.out.print(bOrDPrompt);
			sc.next();
		}
		int varyingIntVal = sc.nextInt();
		// clearing the scanner buffer
		sc.nextLine();
		
		// return a Book or DVD object based on the specified input value
		if (bOrD.equalsIgnoreCase("B")) {
			return new Book(title, creator, itemId, varyingStringVal, varyingIntVal);
		} else {
			return new DVD(title, creator, itemId, varyingStringVal, varyingIntVal);
		}
	}
	
	public static LibraryMember choice2() {
		// utilize method for get input values, preventing blank value
		String name = getNonEmptyStringInput("Enter name: ");
		String address = getNonEmptyStringInput("Enter address: ");
		String contact = getNonEmptyStringInput("Enter contact: ");
		
		// loop runs while the scanner does not have integer input, when it has integer input loop exits, and
		// memberId is declared as scanner input.
		String memberIdPrompt = "Enter numerical member ID: ";
		System.out.print(memberIdPrompt);
		while (!sc.hasNextInt()) {
			System.out.println("Invalid input.");
			System.out.print(memberIdPrompt);
			sc.next();
		}
		int memberId = sc.nextInt();
		// clearing the scanner buffer
		sc.nextLine();
		
		return new LibraryMember(name, address, contact, memberId);
	}
	
	public static int choice3(String promptAOrB) {
		// conditional to get prompt value depending on text input
		String prompt = promptAOrB.equals("member") ? "Enter numerical member ID: " : "Enter numerical item ID to borrow: ";
		// loop runs while the scanner does not have integer input, when it has integer input loop exits, and
		// memberId is declared as scanner input.	System.out.print(prompt);
		while (!sc.hasNextInt()) {
			System.out.println("Invalid input.");
			System.out.print(prompt);
			sc.next();
		}
		int scInputVal = sc.nextInt();
		// clearing the scanner buffer
		sc.nextLine();
		return scInputVal;
	}
	
	public static int choice4(String promptAOrB) {
		// conditional to get prompt value depending on text input
		String prompt = promptAOrB.equals("member") ? "Enter numerical member ID: " : "Enter numerical item ID to return: ";
		System.out.print(prompt);
		// loop runs while the scanner does not have integer input, when it has integer input loop exits, and
		// memberId is declared as scanner input.
		while (!sc.hasNextInt()) {
			System.out.println("Invalid input.");
			System.out.print(prompt);
			sc.next();
		}
		int scInputVal = sc.nextInt();
		// clearing the scanner buffer
		sc.nextLine();
		return scInputVal;
	}
	
	public static void main(String[] args) {
		//  Create library instance
		Library lib1 = new Library();
		// 	boolean value for loop
		boolean exitLoop = false;
		// loop runs while boolean value is false. when user wants to exit, value changes to true
		while (!exitLoop) {
			System.out.println("----------------------------------");
			displayCodes();
			System.out.println("----------------------------------");
			System.out.print("Enter choice ('1'-'6') ('6' to Quit): ");
			// while the scanner input is non integer, loop runs
			while (!sc.hasNextInt()) {
				System.out.println("Invalid input.");
				System.out.print("Enter choice ('1'-'6') ('6' to Quit): ");
				sc.next();
			}
			int choice = sc.nextInt();
			// when int input is out of bounds for the library inputs, the loop resets
			// and displays valid options
			if (choice > 6 || choice < 1) {
				System.out.println("Invalid input.");
				continue;
			}
			// clearing the scanner buffer
			sc.nextLine();
			
			if (choice == 1) {
				// Object type since the choice1 method will return either Book or DVD object.
				LibraryItem bookOrDvd = choice1();
				// add LibraryItem instance to library instance
				lib1.addItem(bookOrDvd);
			} else if (choice == 2) {
				LibraryMember member = choice2();
				// add member instance to library
				lib1.addMember(member);
			} else if (choice == 3) {
				// get scanner input for member id
				int memberId = choice3("member");
				// get LibraryMember object from library instance, if the instance does
				// not contain the ID, it will equal null. For null, the loop will reset
				LibraryMember member = lib1.getMember(memberId);
				if (member == null) {
					System.out.println("----------------------------------");
					System.out.println("Member ID '" + memberId + "' does not exist in this library.");
					continue;
				}
				// this section does the same as the above, except for itemId instead of memberId
				int itemId = choice3("item");
				
				LibraryItem item = lib1.getItem(itemId);
				if (item == null) {
					System.out.println("----------------------------------");
					System.out.println("Item ID '" + itemId + "' does not exist in this library.");
					continue;
				}
				if (item.isAvailable()) {
					member.borrowItem(item);
					System.out.println("----------------------------------");
					item.checkoutItem();
				} else {
					System.out.println("----------------------------------");
					System.out.println("Item is not available to be borrowed.");
				}
				
			} else if (choice == 4) {
				// get scanner input for member id
				int memberId = choice4("member");
				// get LibraryMember object from library instance, if the instance does
				// not contain the ID, it will equal null. For null, the loop will reset
				LibraryMember member = lib1.getMember(memberId);
				if (member == null) {
					System.out.println("----------------------------------");
					System.out.println("Member ID '" + memberId + "' does not exist in this library.");
					continue;
				}
				// this section does the same as the above, except for itemId instead of memberId
				int itemId = choice4("item");
				
				LibraryItem item = lib1.getItem(itemId);
				if (item == null) {
					System.out.println("----------------------------------");
					System.out.println("Item ID '" + itemId + "' has no record in this library.");
					continue;
				}
				// gets the index location of the borrowed item from the member instance borrowed item array
				int membersBorrowedItemIndex = member.getBorrowedItemIndex(item.getItemId());
				// if value is less than 0, it means the item was not found
				if (membersBorrowedItemIndex < 0) {
					System.out.println("----------------------------------");
					System.out.println("Member does not have item ID '" + itemId + "' checked out.");
					continue;
				}
				// if the item is not available in library, it can be returned.
				if (!item.isAvailable()) {
					member.returnItem(membersBorrowedItemIndex);
					System.out.println("----------------------------------");
					item.returnItem();
				} else {
					System.out.println("Item is not checked out of library.");
				}
			} else if (choice == 5) {
				System.out.println("----------------------------------");
				// utilize instance toString method to output numerical contents of lib instance
				System.out.println("Library: " + lib1.toString());
			} else {
				// user wants to exit program, change boolean to true which ends program loop.
				exitLoop = true;
				System.out.println("Exiting program.");
			}
		} // end while loop
		
		
	}
}
