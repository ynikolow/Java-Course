package Task0;

import java.util.Scanner;

public class Task0_ReadAge {
	public static void main(String[] args) {
		System.out.println("Please enter your age:");
		Scanner sc = new Scanner(System.in);
		byte age = sc.nextByte();
		if (age>=0) {
			if(age>=18) {
				System.out.println("You are allowed to drink");
			}
			
			else System.out.println("You are not allowed to drink");
		}
			else  {
				System.out.println("Please enter a valid age");
				
			}
		}
	}


