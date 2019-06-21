package Task3;

import java.util.Scanner;

public class Task3b_PrintLetterCount {
	public static void main(String[] args) {
		System.out.println("Please enter your text:");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine().toLowerCase();
		System.out.println("Please enter a character:");
		String temp = sc.next();
		char lookForThis = temp.charAt(0);
		int countOfLetters = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == lookForThis) {
				countOfLetters++;
			}
		}
		System.out.println("The letter " + lookForThis + " is contained " + countOfLetters + " times");

	}

}
