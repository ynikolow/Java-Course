package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2a_PrintLargestNumber {
	public static void main(String[] args) {
		System.out.println("Please enter the lenght:");
		Scanner sc = new Scanner(System.in);
		int lenght = sc.nextInt();
		System.out.println("Please enter your numbers:");
		int[] array = new int[lenght];
		for (int i = 0; i <array.length; i++) {
			array[i] = sc. nextInt();
		}
		Arrays.sort(array);
		System.out.println(array[lenght -1]);
	}

}
