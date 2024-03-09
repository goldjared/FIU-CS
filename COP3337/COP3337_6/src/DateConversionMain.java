import java.util.Scanner;

import exceptions.*;

public class DateConversionMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateConversion converter = new DateConversion();
		boolean validInput = false;
		while (!validInput) {
			System.out.println("Enter date in format MM/DD/YYYY: ");
			String input = sc.nextLine();
			
			try {
				String formattedDate = converter.dateConvert(input);
				System.out.println("Formatted date: " + formattedDate);
				validInput = true; // Set validInput to true if conversion successful
			} catch (MonthException | DateException | YearException e) {
				System.out.println(e.getMessage());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid date format. Please use MM/DD/YYYY.");
			}
		}
		
		sc.close();
		
	}
}
