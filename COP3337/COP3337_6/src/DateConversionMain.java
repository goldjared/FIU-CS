import java.util.Scanner;
// Import custom exceptions
import exceptions.*;

public class DateConversionMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateConversion converter = new DateConversion();
		// Boolean for loop to run
		boolean validInput = false;
		while (!validInput) {
			// Prompt for input
			System.out.print("Enter date in format MM/DD/YYYY: ");
			String input = sc.nextLine();
			// Try catch on dateConvert method, will catch exceptions thrown by dateConvert
			try {
				String formattedDate = converter.dateConvert(input);
				System.out.println("Formatted date: " + formattedDate);
				// Set loop boolean true for exit
				validInput = true;
				// Catch for custom exceptions
			} catch (MonthException | DateException | YearException e) {
				System.out.println(e.getMessage());
				// Catches for OutOfBounds and NumberFormat exceptions
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid date format. Please use MM/DD/YYYY.");
			} catch (NumberFormatException e) {
				System.out.println("Invalid input value. Please use numerical values.");
			}
		}
		// Close scanner
		sc.close();
	}
}
