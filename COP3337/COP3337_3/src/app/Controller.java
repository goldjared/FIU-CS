package app;

import lib.Book;
import lib.Library;
import lib.LibraryMember;

import java.util.Scanner;

public class Controller {
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void displayCodes() {
		System.out.println("Library Input Codes: ");
		System.out.println("1. Add item");
		System.out.println("2. Add member");
		System.out.println("3. Borrow item");
		System.out.println("4. Return item");
		System.out.println("5. Display library");
		System.out.println("6. Exit");
		
	}
	
	// thinking pass an object to this, then it can call all the methods on said object?
	public static Book choice1() {
		System.out.print("Enter title: ");
		String title = sc.nextLine();
		
		System.out.print("Enter creator: ");
		String creator = sc.nextLine();
		
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
		
		
		if (bOrD.equalsIgnoreCase("B")) {
			System.out.print("Enter genre: ");
		} else {
			System.out.print("Enter director: ");
		}
		String varyingStringVal = sc.nextLine();
		
		String bOrDPrompt = bOrD.equalsIgnoreCase("B") ? "Enter number of pages: " : "Enter DVD duration (minutes): ";
		System.out.print(bOrDPrompt);
		
		while (!sc.hasNextInt()) {
			System.out.println("Invalid input.");
			System.out.print(bOrDPrompt);
			sc.next();
		}
		int varyingIntVal = sc.nextInt();
		// clearing the scanner buffer
		sc.nextLine();
		
		return new Book(title, creator, itemId, varyingStringVal, varyingIntVal);
	}
	
	public static LibraryMember choice2() {
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter address: ");
		String address = sc.nextLine();
		
		System.out.print("Enter contact: ");
		String contact = sc.nextLine();
		
		// loop runs while the scanner does not have integer input, when it has integer input loop exits, and
		// memberId is declared as scanner input.
		System.out.print("Enter numerical member ID: ");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid input.");
			System.out.print("Enter numerical member ID: ");
			sc.next();
		}
		int memberId = sc.nextInt();
		// clearing the scanner buffer
		sc.nextLine();
		
		return new LibraryMember(name, address, contact, memberId);
	}
	
	
	public static void main(String[] args) {
		Library lib1 = new Library();
		
		displayCodes();
		System.out.print("Enter choice ('1'-'6') ('6' to Quit): ");
		
		while (!sc.hasNextInt()) {
			System.out.println("Invalid input.");
			System.out.print("Enter choice ('1'-'6') ('6' to Quit): ");
			sc.next();
		}
		int choice = sc.nextInt();
		sc.nextLine();
		if (choice == 1) {
			Book book = choice1();
			lib1.addItem(book);
		} else if (choice == 2) {
			LibraryMember member = choice2();
		}
		
		
	}
}
