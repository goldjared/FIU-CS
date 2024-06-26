package app;

// Import PassengerTrain class from train package

import train.PassengerTrain;
// Import Scanner from java util
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

//		Test case:
//		Loop fills every seat in the instance except for the last seat(5D).
//		Uncomment between the '***' to activate
//		***UNCOMMENT LINES BELOW
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
//		***UNCOMMENT LINES ABOVE
	
	Scanner sc = new Scanner(System.in);
	// 3. Loop runs so long as the train instance is not full, or 'Q' is pressed in input.
	while (!train1.isTrainFull()) {
		System.out.print("Enter seat row (1-5) and column (A-D) or 'Q' to quit (e.g. '3A'): ");
		// 4. Put scanner input into an array, splitting between each value in the input.
		String[] scInput = sc.nextLine().split("");
		
		// 5. Check for 'Q' input, exits program via break if so. Break ends the loop.
		if (scInput[0].equals("Q")) {
			System.out.println("'Q' Exiting program.");
			break;
			// 6. Check input validity via length equals 2,
			// or via regex checking if the 1st input is not a digit
			// if so, continue which exits while loop at this point, and loops again.
		} else if (scInput.length != 2 || !scInput[0].matches("^\\d+$")) {
			System.out.println("Invalid input.");
			System.out.println("------------------------------------------------");
			continue;
		}
		
		// 7. Clean scanner input index [0] by (-1) the row value for a zero base,
		// clean sc input index [1] pass letter value through getAsciiValue method
		// which zero bases the col value and returns an integer.
		int row = Integer.parseInt(scInput[0]) - 1;
		// Passes the character value for the letter, which is [1] index in sc input
		int col = getAsciiValue(scInput[1].charAt(0));
		// 8. Check if scanner input is valid, if not ends loop at this point and restarts
		if (!isValid(row, col)) {
			System.out.println("Invalid seat input.");
			System.out.println("------------------------------------------------");
			continue;
			// 9. Check if the seat is available on train instance, if not ends loop at this point and restarts
		} else if (!train1.isSeatAvailable(row, col)) {
			System.out.println("Seat not available.");
			System.out.println("------------------------------------------------");
			continue;
		}
		
		// 10. The row and col are now ints, sanitized and available. Ready to pass into the assignSeat method
		// for the instance.
		
		train1.assignSeat(row, col);
		System.out.println("SUCCESS Assigned Seat: " + scInput[0] + scInput[1]);
		System.out.println("------------------------------------------------");
		// 11. Display seat pattern after assigning a seat
		train1.displaySeatPattern();
		System.out.println("------------------------------------------------");
	} // End while loop
}
}
