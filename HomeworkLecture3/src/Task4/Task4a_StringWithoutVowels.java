package Task4;

import java.util.Scanner;

public class Task4a_StringWithoutVowels {
	public static void main(String[] args) {
		System.out.println("Please insert your text:");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] array = line.toLowerCase().toCharArray();
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {

			case 'a':
				System.out.print("");
				break;

			case 'e':
				System.out.print("");
				break;

			case 'i':
				System.out.print("");
				break;

			case 'o':
				System.out.print("");
				break;

			case 'u':
				System.out.print("");
				break;

			default:
				System.out.print(array[i]);
			}

		}
	}
}
