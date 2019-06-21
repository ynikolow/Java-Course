package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UniversityManagement {
	public static void main(String[] args) {
		System.out.println("Please, enter commands:");
		Scanner sc = new Scanner(System.in);
		String input;
		int universityBallance = 500;
		Map<String, Person> mapOfEveryone = new HashMap<String, Person>();
		List<Person> listOfEveryone = new ArrayList<Person>();

		while (!(input = sc.nextLine()).equalsIgnoreCase("END")) {
			String[] information = input.split(" ");

			switch (information[0].toUpperCase()) {

			case "NEW":
				Person person = null;

				switch (information[1].toUpperCase()) {

				case "MAINT":
					person = new MaintananceEmployee(information[2], information[3]);
					mapOfEveryone.put(information[2], person);
					listOfEveryone.add(person);

					break;
				case "ADMIN":
					ArrayList<String> tempSubjects = new ArrayList<String>();
					for (int i = 4; i < information.length; i++) {
						tempSubjects.add(information[i]);
					}
					person = new AdministrationEmployee(information[2], information[3], tempSubjects);
					listOfEveryone.add(person);

					break;
				case "TEACH":
					ArrayList<String> tempSubjects1 = new ArrayList<String>();
					for (int i = 4; i < information.length; i++) {
						tempSubjects1.add(information[i]);
					}
					person = new Teacher(information[2], information[3], tempSubjects1);
					listOfEveryone.add(person);
					break;
				case "STUD":
					ArrayList<String> tempSubjects2 = new ArrayList<String>();
					for (int i = 5; i < information.length; i++) {
						tempSubjects2.add(information[i]);
					}

					person = new Student(information[2], information[3], information[4], tempSubjects2);
					listOfEveryone.add(person);
					break;

				default:
					break;
				}

				break;
			case "WORK":

				universityBallance += mapOfEveryone.get(information[1]).work(listOfEveryone);

				if (universityBallance <= 0) {
					System.out.println("Bankruptcy");
					return;
				}

				for (Person p1 : listOfEveryone) {
					if (p1._tolerance <= 0) {
						System.out.println(p1.getName() + " is not happy.");
						return;
					}
				}

				break;
			case "IDLE":

				for (Person p : listOfEveryone) {
					p.decreaseTolerance(5);
				}

				for (Person p1 : listOfEveryone) {
					if (p1._tolerance <= 0) {
						System.out.println(p1.getName() + " is not happy.");
						return;
					}
				}

				break;

			default:
				System.out.println("Please, check your inputs.");

				break;
			}

		}
		System.out.println("The balance of the university is " + universityBallance);
		for (Person p2 : listOfEveryone) {

			if (p2 instanceof Employee) {
				System.out.println(p2.getName() + " - " + p2._tolerance);
			}
		}
	}
}