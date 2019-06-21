package Task1;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
	public static void main(String[] args) {
		System.out.println("Please enter your number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;

		if (number / 10 == 0) {
			sum = number % 10;
			System.out.println(sum);
		} else {
			while (number / 10 != 0) {
				sum += number % 10;
				number = number / 10;
			}
			System.out.println(sum + number % 10);
		}

	}
}
