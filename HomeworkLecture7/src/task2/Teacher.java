package task2;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Employee	{
	
	private List<String> _teachesSubjects = new ArrayList<String>();

	protected Teacher(String name, String phoneNumber, ArrayList<String> teachesSubjects) {
		super(name, phoneNumber, 25);
		_teachesSubjects = teachesSubjects;
	}

	@Override
	protected double work(List<Person> list) {
		for (Person p : list) {
			if (p instanceof Student) {
				p.increaceTolerance(3);
			} else if (p instanceof MaintananceEmployee) {
				p.decreaseTolerance(3);
			}else if (p instanceof AdministrationEmployee) {
				p.decreaseTolerance(1);
			}
		}
		return -_salary;
	}
	

}
