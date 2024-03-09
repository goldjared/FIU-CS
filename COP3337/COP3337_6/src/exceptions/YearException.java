package exceptions;

// Custom exception class, extends Exception
public class YearException extends Exception {
	public YearException(int year) {
		super("Invalid year entry: '" + year + "', Please enter year value between 1000 and 3000");
	}
}

