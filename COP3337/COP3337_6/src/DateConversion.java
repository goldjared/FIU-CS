import exceptions.*;

import java.time.YearMonth;

public class DateConversion {
	
	public static String getMonth(int month) {
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
			default -> "Invalid month";
		};
	}
	
	public boolean isDayValidForMonthYear(int month, int day, int year) {
		YearMonth yearMonthObj = YearMonth.of(year, month);
		int daysInMonth = yearMonthObj.lengthOfMonth();
		
		return day <= daysInMonth;
	}
	
	
	public String dateConvert(String date) throws YearException, DateException, MonthException {
		try {
			String[] dateArr = date.split("/");
			if (dateArr.length != 3) throw new ArrayIndexOutOfBoundsException();
			for (String input : dateArr) {
				try {
					int num = Integer.parseInt(input);
				} catch (NumberFormatException e) {
					return "Invalid input. Please enter valid numbers for month, day, and year";
				}
			}
			
			
			int monthInt = Integer.parseInt(dateArr[0]);
			int day = Integer.parseInt(dateArr[1]);
			int year = Integer.parseInt(dateArr[2]);
			
			if (monthInt < 1 || monthInt > 12) throw new MonthException(monthInt);
			if (year < 1000 || year > 3000) throw new YearException(year);
			if (!isDayValidForMonthYear(monthInt, day, year)) throw new DateException(day, monthInt, year);
			
			
			String month = getMonth(monthInt);
			return day + " " + month + "," + year;
		} catch (MonthException | DateException | YearException e) {
			throw e;
		}
	}
}
	
