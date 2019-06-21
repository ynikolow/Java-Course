package Task1;

import java.util.Scanner;

public class Task1e_IsPrime {
	public static void main(String[] args) {
		System.out.println("Please enter your number:");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int sum = 0;

		for (int i = b; i > 0; i--) {
			if (b % i != 0) {

			} else {
				sum += i;
			}
//			if the number is not prime the program will stop faster
			
			if (sum > b) {
				break;
			}
		}
		
		/*
		 * Here I have added 1 because a number is prime if it can be devided by itself
		 * and 1
		 */
		if (sum != ++b) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}
}
