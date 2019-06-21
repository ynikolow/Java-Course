package Task0;

import java.util.Scanner;

public class Task0a_ReadInt {

	public static void main(String[] args) {
		System.out.println("Please enter a number");

		Scanner sc = new Scanner(System.in);
		int newNumber = sc.nextInt();
		System.out.println(++newNumber);

	}

}
