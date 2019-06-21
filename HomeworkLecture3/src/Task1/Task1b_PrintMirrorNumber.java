package Task1;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
	public static void main(String[] args) {
		System.out.println("Please insert your number:");
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		System.out.println(sb.reverse());

	}
}
