package task1;

public class Worker extends Person {
	private double _weekSalary;
	private double _workHoursPerDay;

	protected Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
		super(firstName, lastName);
		this._weekSalary = weekSalary;
		this._workHoursPerDay = workHoursPerDay;
	}

	protected String printWorker() {
		return String.format(
				"%s%n" + "Occupation: Worker%n" + "Week salary: %.2f%n" + "Hours per day: %f%n"
						+ "Salary per hour: %.2f",
				printPerson(), _weekSalary, _workHoursPerDay, _weekSalary / (_workHoursPerDay * 5));
	}
}
