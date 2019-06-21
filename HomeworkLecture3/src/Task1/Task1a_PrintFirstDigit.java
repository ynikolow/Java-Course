package Task1;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {
	public static void main(String[] args) {
		System.out.println("Please enter your number:");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		System.out.println(number.charAt(0));

	}
}