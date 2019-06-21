package task2;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	private String _facultyNumber;
	private List<String> _listOfSubjects = new ArrayList<String>();

	public Student(String name, String phoneNumber, String facultyNumber, ArrayList<String> subjects) {
		super(name, phoneNumber);
		this._facultyNumber = facultyNumber;
		this._listOfSubjects = subjects;
	}

	@Override
	protected double work(List<Person> list) {
// increases the tolerance only of the particular student calling the method
		increaceTolerance(2);

		for (Person p : list) {
			if (p instanceof MaintananceEmployee) {
				p.decreaseTolerance(1);
			}
		}

		if (_tolerance >= 50) {
			return 10;
		} else {
			return 0;
		}

	}
}
