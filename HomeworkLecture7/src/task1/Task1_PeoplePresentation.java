package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1_PeoplePresentation {
	public static void main(String[] args) {
		System.out.println("Please, insert" + "\n" + "<fist name> <last name>"
				+ " <faculty number> <lecture count> <exercise count> " + "\n" + "for a student or "
				+ "\n<fist name> <last name> <weekly salary> <work hours per day> for a working person");
		Scanner sc = new Scanner(System.in);
		String input;
		List<Student> allStudents = new ArrayList<Student>();
		List<Worker> allWorkers = new ArrayList<Worker>();

		while (!(input = sc.nextLine()).equalsIgnoreCase("END")) {
			String[] information = input.split(" ");
			if (CheckIfCorrect.checkName(information[0]) == true || CheckIfCorrect.checkName(information[1]) == true) {
				return;
			} else {

			}

			switch (information.length) {

			case 5:
				if (CheckIfCorrect.checkFacultyNumber(information[2]) == true
						|| CheckIfCorrect.checkIfPositive(Double.parseDouble(information[3])) == true
						|| CheckIfCorrect.checkIfPositive(Double.parseDouble(information[4])) == true
						|| CheckIfCorrect.chechIfIngeger(information[3]) == true
						|| CheckIfCorrect.chechIfIngeger(information[4]) == true) {
					return;
				} else {
					allStudents.add(new Student(information[0], information[1], information[2],
							Integer.parseInt(information[3]), Integer.parseInt(information[4])));
				}
				break;

			case 4:
				if (CheckIfCorrect.checkIfPositive(Double.parseDouble(information[2])) == true
						|| CheckIfCorrect.checkIfPositive(Double.parseDouble(information[3])) == true) {
					return;
				} else {
					allWorkers.add(new Worker(information[0], information[1], Double.parseDouble(information[2]),
							Double.parseDouble(information[3])));
				}
				break;

			default:
				System.out.println("Please check your inputs.");
				break;
			}
		}
		for (Student student : allStudents) {
			System.out.println(student.printStudent());
		}
		for (Worker worker : allWorkers) {
			System.out.println(worker.printWorker());
		}
	}

}
