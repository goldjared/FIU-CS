package app;

import train.PassengerTrain;

import java.util.Scanner;

public class Controller {

public static int getAsciiValue(char colLetter) {
	// return ASCII value of letter, subtract A ASCII val from letter val to convert to 0 based scale of 26 numbers
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
	// Loop runs so long as the train instance is not full, or 'Q' is pressed in input.
	while (!train1.isTrainFull()) {
		System.out.print("Enter seat row (1-5) and column (A-D) or 'Q' to quit (e.g. '3A'): ");
		String[] scInput = sc.nextLine().split("");
		
		if (scInput[0].equals("Q")) {
			System.out.println("'Q' Exiting program.");
			break;
		} else if (scInput.length > 2) {
			System.out.println("Invalid input.");
			System.out.println("------------------------------------------------");
			continue;
		}
		
		
		// scanner input, parse and zero base (-1) the row, pass letter value through getAsciiValue method
		// which also zero bases and returns an integer.
		int row = Integer.parseInt(scInput[0]) - 1;
		int col = getAsciiValue(scInput[1].charAt(0));
		// check if scanner input is valid, if not ends loop at this point and restarts
		if (!isValid(row, col)) {
			System.out.println("Invalid seat input.");
			System.out.println("------------------------------------------------");
			continue;
		} else if (!train1.isSeatAvailable(row, col)) {
			System.out.println("Seat not available.");
			System.out.println("------------------------------------------------");
			continue;
		}
		
		// the row and col are now integers, and zero based, they are ready to pass into the assignSeat method
		
		train1.assignSeat(row, col);
		System.out.println("SUCCESS Assigned Seat: " + scInput[0] + scInput[1]);
		System.out.println("------------------------------------------------");
		
		train1.displaySeatPattern();
		System.out.println("------------------------------------------------");
	}
}
}
