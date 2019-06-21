package Task0_Classes;

import java.util.Scanner;

public class Person {
	private int age;
	private String name;

	public Person() {
		this.age = -1;
		this.name = "No Name";
	}

	public Person(String name) {
		this.name = name;
		this.age = -1;
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String output() {
		if (name.equals("") && age == 0) {
			System.out.println("I am John Doe");
		} else if (age == 0) {
			System.out.println("Hello, I am " + name + ".");
		} else {
			System.out.println("Hello, I am " + name + ". I am " + age + " years old");
		}
		return "";

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
