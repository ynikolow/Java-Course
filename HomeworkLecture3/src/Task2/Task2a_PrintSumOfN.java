package Task2;

import java.util.Scanner;

public class Task2a_PrintSumOfN {
	public static void main(String[] args) {
		System.out.println("Please enter the lenght:");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int lenght = sc.nextInt();
		int[] array = new int[lenght];
		System.out.println("Please enter the numbers:");
		for (int i = 0; i < lenght; i++) {
			array[i] = sc.nextInt();
		}

		for (int c : array) {
			sum += c;
		}
		System.out.println("The sum is:");
		System.out.println(sum);

	}

}
