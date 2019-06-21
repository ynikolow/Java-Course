package Task1;

import java.time.LocalDate;
import java.time.Period;

public class Test {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2014, 12, 25);
		LocalDate date2 = LocalDate.of(2017, 10, 2);
		Period period = Period.between(date1, date2);
		System.out.println(period.getDays());
	}

}
