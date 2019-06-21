package Task1;

public class PrintingForDate {
	public static void main(String[] args) {
		SwiftDate date1 = new SwiftDate(2007, 2, 15);
		SwiftDate date2 = new SwiftDate(2015, 6, 1);
		System.out.println(date1.isLeapYear());
		System.out.println(date1.getCentury());
		System.out.println(date2.getCentury());
		System.out.println(date1.getDayDiffernece(date2));
	}

}
