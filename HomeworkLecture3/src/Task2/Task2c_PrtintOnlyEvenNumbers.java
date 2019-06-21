package Task2;

import java.util.Scanner;

public class Task2c_PrtintOnlyEvenNumbers {
	public static void main(String[] args) {
		System.out.println("Please enter the lenght:");
		Scanner sc = new Scanner(System.in);
		int lenght = sc.nextInt();
		int[] array = new int[lenght];
		System.out.println("Please enter the numbers:");
		for (int i = 0; i < lenght; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < lenght; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}

		}
	}

}
