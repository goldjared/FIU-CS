package exceptions;

public class MonthException extends Exception {
	public MonthException(int monthInput) {
		super("Invalid month entry: " + monthInput);
	}
}
