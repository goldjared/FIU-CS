package app;

import train.PassengerTrain;

import java.util.Scanner;

public class Controller {

	public int getAsciiValue(char colLetter) {
		// return ASCII value of letter, subtract A ASCII val from letter val to convert to 0 based scale of 26 numbers
		return (int) colLetter - 'A';
	}
	
	public static void main (String[] args) {
		// create train instance
		PassengerTrain train1 = new PassengerTrain();
		// print base seat pattern, empty train
		train1.displaySeatPattern();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter seat row (1-5) and column (A-D) or 'Q' to quit: ");
		String scInput = sc.nextLine();
		if(scInput.equals("Q")) {
			System.out.println("Exiting program.");
		} else if()
		String[] seatPos = sc.nextLine().split("");
		// if the array length is greater than 2, throw error. invalid.
		
		
	}
}
