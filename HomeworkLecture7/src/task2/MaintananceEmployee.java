package task2;

import java.util.List;

public class MaintananceEmployee extends Employee {

	protected MaintananceEmployee(String name, String phoneNumber) {
		super(name, phoneNumber, 15);
	}

	@Override
	protected double work(List<Person> list) {
		for (Person p1 : list) {
			p1.increaceTolerance(2);
		}
		return -_salary;
	}

}
