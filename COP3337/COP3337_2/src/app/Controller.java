package app;

// import PassengerTrain class from train package
import train.PassengerTrain;
// import Scanner from java util
import java.util.Scanner;

public class Controller {

public static int getAsciiValue(char colLetter) {
	// return ASCII value of letter, subtract A ASCII val from letter val to convert to 0 based scale of
	// alphabet, e.g. A = 0, B = 1, ..., Z = 25
	return (int) colLetter - 'A';
}

public static boolean isValid(int row, int col) {
	// check if the seat selection is valid, returns boolean
	return row <= 4 && row >= 0 && col >= 0 && col <= 3;
}

public static void main(String[] args) throws Exception {
	// 1. Create train instance
	PassengerTrain train1 = new PassengerTrain();
	// 2. Print base seat pattern of instance
	System.out.println("------------------------------------------------");
	train1.displaySeatPattern();
	System.out.println("------------------------------------------------");
	
	//	Test case:
	//	Loop fills every seat in the instance except for the last seat(5D).
	//	Uncomment between the '***' to activate
	//	***UNCOMMENT LINES BELOW
//
//	for (int i = 0; i < 5; i++) {
//		for (int j = 0; j < 4; j++) {
//			if (i == 4 && j == 3) break;
//			train1.assignSeat(i, j);
//			System.out.println("Assigned Seat: " + (i + 1) + String.valueOf((char) (j + 65)));
//		}
//	}
//	System.out.println("------------------------------------------------");
//	train1.displaySeatPattern();
//	System.out.println("------------------------------------------------");
//
	//	***UNCOMMENT LINES ABOVE
	
	Scanner sc = new Scanner(System.in);
	// 3. Loop runs so long as the train instance is not full, or 'Q' is pressed in input.
	while (!train1.isTrainFull()) {
		System.out.print("Enter seat row (1-5) and column (A-D) or 'Q' to quit (e.g. '3A'): ");
		// Put scanner input into an array, splitting between each value in the input.
		String[] scInput = sc.nextLine().split("");
		
		// Check for 'Q' input, exits program via break if so. Break ends the loop.
		if (scInput[0].equals("Q")) {
			System.out.println("'Q' Exiting program.");
			break;
			// Check input validity via length is greater than 2,
			// or via regex checking if the 1st input is not a digit
			// if so, continue which exits while loop at this point, and loops again.
		} else if (scInput.length > 2 || !scInput[0].matches("^\\d+$")) {
			System.out.println("Invalid input.");
			System.out.println("------------------------------------------------");
			continue;
		}
		
		// Scanner input, parse and zero base (-1) the row, pass letter value through getAsciiValue method
		// which also zero bases and returns an integer.
		int row = Integer.parseInt(scInput[0]) - 1;
		int col = getAsciiValue(scInput[1].charAt(0));
		// Check if scanner input is valid, if not ends loop at this point and restarts
		if (!isValid(row, col)) {
			System.out.println("Invalid seat input.");
			System.out.println("------------------------------------------------");
			continue;
		// Check if the seat available on train instance, if not ends loop at this point and restarts
		} else if (!train1.isSeatAvailable(row, col)) {
			System.out.println("Seat not available.");
			System.out.println("------------------------------------------------");
			continue;
		}
		
		// The row and col are now ints, sanitized and available. They are ready to pass into the assignSeat method
		
		train1.assignSeat(row, col);
		System.out.println("SUCCESS Assigned Seat: " + scInput[0] + scInput[1]);
		System.out.println("------------------------------------------------");
		// display seat pattern after assigning a seat
		train1.displaySeatPattern();
		System.out.println("------------------------------------------------");
	}
}
}
