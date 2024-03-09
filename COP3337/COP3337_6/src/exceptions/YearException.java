package exceptions;

public class YearException extends Exception {
	public YearException(int year) {
		super("Invalid year entry, year: " + year);
	}
}

