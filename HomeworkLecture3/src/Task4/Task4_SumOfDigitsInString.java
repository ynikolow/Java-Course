package Task4;

import java.util.Scanner;

public class Task4_SumOfDigitsInString {
	public static void main(String[] args) {

		System.out.println("Please enter your text:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(i);
		}
		int sum = 0;
		String temp = sb.toString();
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < temp.length(); j++) {
				if (name.charAt(i) == temp.charAt(j)) {
					sum += name.charAt(i) - 48;
				}
			}

		}
		System.out.println(sum);
	}
}
