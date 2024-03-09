package exceptions;

// Custom exception class, extends Exception
public class DateException extends Exception {
	public DateException(int day, int month, int year) {
		super("Invalid day entry, Day: '" + day + "', for MM/YEAR: '" + month + "/" + year + "'");
	}
}
