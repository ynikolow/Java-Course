package task2;

public abstract class Employee extends Person {
	protected double _salary;

	protected Employee(String name, String phoneNumber, int salary) {
		super(name, phoneNumber);
		_salary = salary;
	}

}
