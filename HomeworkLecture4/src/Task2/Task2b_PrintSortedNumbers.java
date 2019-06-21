package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
	public static void main(String[] args) {
		System.out.println("Please enter the lenght:");
		Scanner sc = new Scanner(System.in);
		int lenght = sc.nextInt();
		System.out.println("Please enter your numbers:");
		int[] array = new int[lenght];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for (int i : array) {
			System.out.println(i);
		}

	}

}
