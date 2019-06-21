package Task3;

import java.util.Scanner;

public class Task3a_IsPalindrome {
	public static void main(String[] args) {
		System.out.println("Please enter your string:");
		Scanner sc = new Scanner(System.in);
		String oldString = sc.next();
		sc.close();
		StringBuilder newString = new StringBuilder(oldString).reverse();
		String newNewString = newString.toString();
		if (oldString.equals(newNewString)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
