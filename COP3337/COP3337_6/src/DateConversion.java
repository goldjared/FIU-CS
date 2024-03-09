import exceptions.*;

public class DateConversion {
	
	// Switch statement on month int val and corresponding month string
	public String getMonth(int month) {
		return switch (month) {
			case 1 -> "January";
			case 2 -> "February";
			case 3 -> "March";
			case 4 -> "April";
			case 5 -> "May";
			case 6 -> "June";
			case 7 -> "July";
			case 8 -> "August";
			case 9 -> "September";
			case 10 -> "October";
			case 11 -> "November";
			case 12 -> "December";
			default -> "MONTH INVALID";
		};
	}
	
	public boolean isLeapYear(int year) {
		// Leap year can be divided by 400 OR leap year can be divided by 4 AND not divided by 100
		return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
	}
	
	public boolean isDayValidForMonthYear(int month, int day, int year) {
		// Month value out of bounds
		if (month < 1 || month > 12) {
			return false;
		}
		
		// Day value out of bounds
		if (day < 1 || day > 31) {
			return false;
		}
		
		// 31 day months: January, March, May, July, August, October, and December
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return true;
		}
		
		// 30 day months: April, June, September, and November
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return day <= 30;
		}
		
		// Only month value left is Feb
		// February will be 28 or 29 days depending on if leap year (29 if leap year)
		if (isLeapYear(year)) {
			return day <= 29;
		} else {
			return day <= 28;
		}
		
	}
	
	
	public String dateConvert(String date) throws YearException, DateException, MonthException {
		// Create string array by splitting on symbol
		String[] dateArr = date.split("/");
		// Throw outOfBounds exception if arrLength is not 3
		if (dateArr.length != 3) throw new ArrayIndexOutOfBoundsException();
		// Loop through each arr input, check if value is valid int
		for (String input : dateArr) {
			try {
				int num = Integer.parseInt(input);
				// Catch and throw NumFormatException
			} catch (NumberFormatException e) {
				throw new NumberFormatException();
			}
		}
		// Parse inputs to int
		int monthInt = Integer.parseInt(dateArr[0]);
		int day = Integer.parseInt(dateArr[1]);
		int year = Integer.parseInt(dateArr[2]);
		
		// Conditionals for custom exceptions being thrown
		if (monthInt < 1 || monthInt > 12) throw new MonthException(monthInt);
		if (year < 1000 || year > 3000) throw new YearException(year);
		if (!isDayValidForMonthYear(monthInt, day, year)) throw new DateException(day, monthInt, year);
		
		String month = getMonth(monthInt);
		return month + " " + day + ", " + year;
	}
}
	
