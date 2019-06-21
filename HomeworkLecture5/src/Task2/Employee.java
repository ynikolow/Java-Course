package Task2;

public class Employee {
	String name;
	double salary;
	String position;
	String department;
	int age;
	String email;
	
	public Employee(String name, double salary, String position, String department) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
	}
	
	public Employee(String name, double salary, String position, String department,
			int age, String email) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.age = age;
		this.email = email;
	}
	public Employee(String name, double salary, String position, String department,
			String email) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.email = email;
	}
	public Employee(String name, double salary, String position, String department,
			int age) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.age = age;
	}

}
