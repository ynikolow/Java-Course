package Task4;

import java.util.Scanner;

public class Task4c_PrintEverySentance {
	public static void main(String[] args) {
		System.out.println("Please enter your line:");
		Scanner sc = new Scanner(System.in);
		String output = sc.nextLine();
		char[] newArray = output.trim().toCharArray();
		for (int i = 0; i < newArray.length; i++) {
			if ((newArray[i]) == '.' || (newArray[i] == '!') || (newArray[i] == '?')) {
				System.out.print(newArray[i]);
				System.out.println();
//Here the programs skips a character because this character is a space 				
				i++;

			} else {
				System.out.print(newArray[i]);

			}

		}
	}

}
