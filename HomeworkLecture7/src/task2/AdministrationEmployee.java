package task2;

import java.util.ArrayList;
import java.util.List;

public class AdministrationEmployee extends Employee {
	private List<String> _adminSubjects = new ArrayList<String>();

	protected AdministrationEmployee(String name, String phoneNumber, ArrayList<String> adminSubjects) {
		super(name, phoneNumber, 19);
		_adminSubjects = adminSubjects;
	}

	@Override
	protected double work(List<Person> list) {
		for (Person p1 : list) {
			if (p1 instanceof Student) {
				p1.increaceTolerance(3);
			} else if (p1 instanceof Teacher) {
				p1.increaceTolerance(3);
			} else if (p1 instanceof AdministrationEmployee) {
				p1.increaceTolerance(1);
			}
		}
		return -_salary;
	}



}
