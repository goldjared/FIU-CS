package app;

import train.PassengerTrain;

import java.util.Scanner;

public class Controller {

	public static int getAsciiValue(char colLetter) {
		// return ASCII value of letter, subtract A ASCII val from letter val to convert to 0 based scale of 26 numbers
		return (int) colLetter - 'A';
	}
	
	public static boolean isValid(int row, int col) {
		// check if the seat selection is valid, throw error if not
		return row <= 4 && row >= 0 && col >= 0 && col <= 3;
	}
	
	public static void main (String[] args) throws Exception {
		// create train instance
		PassengerTrain train1 = new PassengerTrain();
		// print base seat pattern, empty train
		train1.displaySeatPattern();
		
		
		Scanner sc = new Scanner(System.in);
	// loop runs so long as the train instance is not full, or 'Q' is pressed in input.
		while(!train1.isTrainFull()) {
			boolean validInput = false;
			int row;
			int col;
//			System.out.print("Enter seat row (1-5) and column (A-D) or 'Q' to quit (e.g. '3A'): ");
//			String scInput = sc.nextLine();
			String[] scInput;
			while(!validInput) {
				System.out.print("Enter seat row (1-5) and column (A-D) or 'Q' to quit (e.g. '3A'): ");
				scInput = sc.nextLine().split("");
				if(scInput[0].equals("Q")) {
					System.out.println("Exiting program.");
				}
				
				row = Integer.parseInt(scInput[0]) - 1;
				col = getAsciiValue(scInput[1].charAt(0));
				if(isValid(row, col)) {
					validInput = true;
				} else {
					
					System.out.println("Invalid seat input.");
				}
			}
//			String[] scInput = sc.nextLine().split("");
//			if(scInput[0].equals("Q")) {
//				System.out.println("Exiting program.");
//			}
			// if the array length is greater than 2, throw error. invalid.
			
			// scanner input, parse and zero base (-1) the row, pass letter value through getAsciiValue method
			// which also zero bases and returns an integer.

				// the row and col are now integers, and zero based, they are ready to pass into the assignSeat method

				train1.assignSeat(row, col);
			System.out.println("assigned seat: " + scInput[0] + scInput[1] );
				
				train1.displaySeatPattern();
		}
		
		
		
	}
}
