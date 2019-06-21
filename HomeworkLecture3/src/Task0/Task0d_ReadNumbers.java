package Task0;

import java.util.Scanner;

public class Task0d_ReadNumbers {
	public static void main(String[] args) {
		System.out.println("Please enter lenght");
		Scanner sc = new Scanner(System.in);
		int lenght = sc.nextInt();
		System.out.println("Please enter the numbers you want to print");
		int[] numbers = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for (int k = 0; k<lenght; k++) {
			System.out.println(numbers[k]);
		}
	}
}
