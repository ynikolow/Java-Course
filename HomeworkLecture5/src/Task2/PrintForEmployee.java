package Task2;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PrintForEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the lenght:");
		int lenght = sc.nextInt();
		sc.nextLine();
		Employee[] employees = new Employee[lenght];
		System.out.println("Please enter the employees. You can enter " + lenght + " employees. "
				+ "\nThey should be inserted in this format: " + "\nName, Salary, Position, Department, Age(not required), Email(not required)" );

		for (int i = 0; i < employees.length; i++) {
			String sb = sc.nextLine();
			String[] splittedArray = sb.split(",");
			String name = splittedArray[0].trim();
			double salary = Double.parseDouble(splittedArray[1].trim());
			String position = splittedArray[2].trim();
			String department = splittedArray[3].trim();

			switch (splittedArray.length) {
			case 4:
				employees[i] = new Employee(name, salary, position, department);
				break;
			case 5:
				if (splittedArray[4].contains("@") == true) {
					String email = splittedArray[4].trim();
					employees[i] = new Employee(name, salary, position, department, email);
				} else {
					int age = Integer.parseInt(splittedArray[4].trim());
					employees[i] = new Employee(name, salary, position, department, age);
				}
				break;
			case 6:
				int age = Integer.parseInt(splittedArray[4].trim());
				String email = splittedArray[5].trim();
				employees[i] = new Employee(name, salary, position, department, age, email);
				break;
			}
		}
		Double[] salary = new Double[lenght];
		for (int i = 0; i < salary.length; i++) {
			salary[i] = employees[i].salary;
		}
		// another way would be to just sort the array in ascending order and assign
//		the value of i in the for cicle to salary[lenght] - 1 and then to itete i --
// but i learned that arrays can be sorted out descendingly  
		Arrays.sort(salary, Collections.reverseOrder());
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < lenght; j++) {
				if (salary[i] == employees[j].salary) {
					System.out.print(employees[j].name + ", " + employees[j].department 
							+ ", " + employees[j].position);
					if (employees[j].email != null) {
						System.out.print(", " + employees[j].email);
					} else {
					}
				}
			}
			System.out.println();
		}
	}
}