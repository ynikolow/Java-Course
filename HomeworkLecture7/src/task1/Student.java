package task1;

public class Student extends Person {
	private String _facultyNumber;
	private int _lectureCount;
	private int _exerciseCount;

	protected Student(String firstName, String lastName, String facultyNumber, int lectureCount, int exerciseCount) {
		super(firstName, lastName);
		this._facultyNumber = facultyNumber;
		this._lectureCount = lectureCount;
		this._exerciseCount = exerciseCount;
	}

	protected String printStudent() {
		return String.format("%s%n" + "Occupation: Student%n" + "Faculty number: %s%n"
				+ "Hours per day: %.2f", printPerson(), _facultyNumber, (2 * _lectureCount + 1.5 * _exerciseCount) / 5);

	}

}
