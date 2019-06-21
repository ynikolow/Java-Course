package Task1;

import java.util.Scanner;

public class Task1d_PrintAllDividers {
	public static void main(String[] args) {
		System.out.println("Please enter your number:");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		System.out.println("Your number can be evenly devided by:");
		for (int i = b; i > 0; i--) {
			if (b % i != 0) {
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
