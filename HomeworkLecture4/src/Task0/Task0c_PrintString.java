package Task0;

import java.util.Scanner;

public class Task0c_PrintString {
	public static void main(String[] args) {
		System.out.println("Please enter your string:");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
}
