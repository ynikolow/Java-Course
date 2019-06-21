package Task2;

import java.util.Scanner;

public class Task2b_PrintReversedSequence {
	public static void main(String[] args) {
		System.out.println("Please enter the lenght:");
		Scanner sc = new Scanner(System.in);
		int lenght = sc.nextInt();
		int[] array = new int[lenght];
		System.out.println("Please enter the numbers:");
		for (int i = 0; i < lenght; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = --lenght; i >= 0; i--) {
			if (i != 0) {
				System.out.print(array[i] + " ");
			} else {
				System.out.println(array[i]);
			}
		}

	}

}
