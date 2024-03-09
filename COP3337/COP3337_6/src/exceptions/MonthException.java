package exceptions;

// Custom exception class, extends Exception
public class MonthException extends Exception {
	public MonthException(int monthInput) {
		super("Invalid month entry: '" + monthInput + "', Please enter month value between 1 and 12");
	}
}
