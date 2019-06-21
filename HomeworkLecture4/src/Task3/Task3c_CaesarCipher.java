package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3c_CaesarCipher {
	public static void main(String[] args) {
		System.out.println("Please enter your text:");
		Scanner sc = new Scanner(System.in);
		String scanned = sc.nextLine();
		System.out.println("Please enter the tool: (encode or decode)");
		String method = sc.next();
		sc.close();
		char[] array = scanned.toCharArray();
		String[] arrayToSrting = new String[scanned.length()];
		for (int i = 0; i < scanned.length(); i++) {
			arrayToSrting[i] = Character.toString(array[i]);
		}
		StringBuilder outputString = new StringBuilder();
		StringBuilder alphabet = new StringBuilder();
		for (char i = 'a'; i <= 'z'; i++) {
			alphabet.append(i);
		}
		for (char i = 'A'; i <= 'Z'; i++) {
			alphabet.append(i);
		}

		if (method.equals("encode")) {
			for (int i = 0; i < arrayToSrting.length; i++) {
				if (alphabet.indexOf(arrayToSrting[i]) >= 0) {
					if (array[i] != 'z') {
						array[i] = (char) (array[i] + 1);
					} else {
						array[i] = 'a';
					}
				} else {

				}

			}
			for (char c : array) {
				System.out.print(c);
			}
		} else if (method.equals("decode")) {
			for (int i = 0; i < array.length; i++) {
				if (alphabet.indexOf(arrayToSrting[i]) >= 0) {
					if (array[i] != 'a') {
						array[i] = (char) (array[i] - 1);
					} else {
						array[i] = 'z';
					}
				} else {

				}
			}
			for (char c : array) {
				System.out.print(c);
			}
		} else {
			System.out.println("You can enter only encode or decode");
		}
	}
}