package task1;

public class Person {
	private String _fName;
	private String _lastName;

	protected Person(String fistName, String lastName) {
		this._fName = fistName;
		this._lastName = lastName;
	}
	
	protected String printPerson() {
		return String.format("First name: %s%nLast name: %s", _fName, _lastName);
	}
}
