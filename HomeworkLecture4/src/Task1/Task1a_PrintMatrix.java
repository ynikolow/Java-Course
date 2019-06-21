package Task1;

import java.util.Scanner;

public class Task1a_PrintMatrix {
	public static void main(String[] args) {
		System.out.println("Please enter the the size of the square:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		sc.close();
		int[][] array = new int[a][a];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				array[j][i] = ++b;
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
