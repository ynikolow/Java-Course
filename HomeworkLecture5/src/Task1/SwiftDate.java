package Task1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class SwiftDate {
	int year;
	int month;
	int day;
	int century;
	int period2;

	public SwiftDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public boolean isLeapYear() {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getCentury() {
		if (year % 100 == 0) {
			century = year / 100;
		} else {
			century = year / 100 + 1;
		}
		return century;
	}

	public int getDayDiffernece(SwiftDate other) {
		LocalDate date1 = LocalDate.of(year, month, day);
		LocalDate date2 = LocalDate.of(other.year, other.month, other.day);
		Period period = Period.between(date1, date2);

		for (int i = date1.getYear(); i <= date2.getYear(); i++) {
			if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) {
				period2 += 1;
			} else {

			}
		}

		period2 += period.getYears() * 365;
		period2 += period.getMonths() * 30.41666;
		period2 += period.getDays();

		return period2;

	}
}
