package Task3;
import java.util.Scanner;

public class Task3a_PrintSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the lenght of your square");
		int a = sc.nextInt();

		String[][] square = new String[a][a];

		for (int k = 0; k < a; k++) {
			for (int z = 0; z < a; z++) {
				if (k == 0) {
					square[k][z] = "*";
				} else if (z == 0) {
					square[k][z] = "*";
				} else if (k == a - 1) {
					square[k][z] = "*";
				} else if (z == a - 1) {
					square[k][z] = "*";
				} else {
					square[k][z] = " ";

				}

				System.out.print(square[k][z]);
			}
			System.out.println();
		}

	}
}