
public class DateUtil {
	// Finals
	private final static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final static int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
	private final static int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
	private final static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private final static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	public static boolean isLeapYear(int year) {
		// returns true if the given year is a leap year. 
		// A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
		if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) {
			return true;
		}
		return false;
	}

	public static boolean isValidDate(int year, int month, int day) {
		// Return true if the given year, month, day is a valid date
		// year: 1-9999
		// month: 1(Jan)-12(Dec)
		// day: 1-28|29|30|31. The last day depends on year and month
		int daysInMonth = 0;
		if (month == 2 && isLeapYear(year)) {
			daysInMonth = 29;
		} else {
			daysInMonth = daysInMonths[month-1];
		}
		if (year < 1 || year > 9999) {
			return false;
		}        
		if (month < 1 || month > 12) {
			return false;
		}        

		if (day < 1 || day > daysInMonth){
			return false;
		}
		return true;
	}

	public static int getDayOfWeek(int year, int month, int day) {
		// Return the day of the week, 0:Sun, 1:Mon, ..., 6:Sat
		// 1. Based on the first two digit of the year, get the number from the "century" table.
		int firstTwoDigitOfTheYear = 6 - 2*((year / 100) % 4);
		// 2. Add to the last two digit of the year.
		int lastTwoDigitsOfYear = year % 100;
		// 3. Add to "the last two digit of the year divide by 4, truncate the fractional part".
		int fractional = lastTwoDigitsOfYear / 4;
		// 4. Add to the number obtained from the month table.
		int monthNumber = isLeapYear(year) ? leapYearMonthNumbers[month-1] : nonLeapYearMonthNumbers[month-1];
		// 5. Add to the day.
		// 6. The sum modulus 7 gives the day of the week, where 0 for SUN, 1 for MON, ..., 6 for SAT.
		return (  firstTwoDigitOfTheYear + lastTwoDigitsOfYear + fractional + monthNumber + day) % 7;
	}

	public static String toString(int year, int month, int day) {
		// prints the given date in the format "xxxday d mmm yyyy", e.g., "Tuesday 14 Feb 2012". Assume that the given date is valid.
		String str = "";
		if (isValidDate(year,month,day)){
			str += strDays[getDayOfWeek(year,month,day)]+" ";
			str += day+" ";
			str += strMonths[month-1]+" ";
			str += year+" ";
		} else {
			str += "Not a valid date!";
		}
		return str;
	}


	public static void main(String[] args) {
		System.out.println(isLeapYear(1900));  // false
		System.out.println(isLeapYear(2000));  // true
		System.out.println(isLeapYear(2011));  // false
		System.out.println(isLeapYear(2012));  // true
		System.out.println();
		System.out.println(isValidDate(2012, 2, 29));  // true
		System.out.println(isValidDate(2011, 2, 29));  // false
		System.out.println(isValidDate(2099, 12, 31)); // true
		System.out.println(isValidDate(2099, 12, 32)); // false
		System.out.println();
		System.out.println(getDayOfWeek(1982, 4, 24));  // 6:Sat
		System.out.println(getDayOfWeek(2000, 1, 1));   // 6:Sat
		System.out.println(getDayOfWeek(2054, 6, 19));  // 5:Fri
		System.out.println(getDayOfWeek(2012, 2, 17));  // 5:Fri
		System.out.println();
		System.out.println(toString(2012, 2, 14)); // Tuesday 14 Feb 2012
		System.out.println(toString(2011, 2, 29)); // Not a valid date!
		System.out.println(toString(2016, 12, 12)); //Monday 12 Dec 2016 (today:P)
	}
}
