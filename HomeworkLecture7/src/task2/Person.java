package task2;

import java.util.List;

public abstract class Person {
	private String _name;
	private String _phoneNumber;
	protected int _tolerance;

	public Person(String name, String phoneNumber) {
		this._name = name;
		this._phoneNumber = phoneNumber;
		this._tolerance = 20;
	}

	/*
	 * I need this method to be used by all other child classes with
	 * different implementation
	 */
	protected abstract double work(List<Person> list);
	
	protected String getName() {
		return _name;
	}
	
	protected void increaceTolerance(int value) {
		_tolerance += value;
	}
	
	protected void decreaseTolerance(int value) {
		_tolerance -= value;
	}
}
