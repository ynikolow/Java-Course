package Task0_Classes;

import java.util.Scanner;

public class PrintingForPerson {
	public static void main(String[] args) {
//		System.out.println("Please enter your name:");
		Scanner sc = new Scanner(System.in);
//		String inputName = sc.nextLine();
		System.out.println("Please enter your age:");
		int inputAge = sc.nextInt();
		sc.close();
		Person firsPerson = new Person();
		firsPerson.setAge(inputAge);
//		firsPerson.setName(inputName);
		System.out.println(firsPerson.output());
//		char [] array = inputName.toCharArray();
//		System.out.println(array[0]);
//		System.out.println(firsPerson.getName());
	}

}
