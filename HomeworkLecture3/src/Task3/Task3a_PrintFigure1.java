package Task3;
import java.util.Scanner;

public class Task3a_PrintFigure1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the lenght of your square");
		int a = sc.nextInt();

		String[][] figure = new String[a][a];

		for (int k = 0; k < a; k++) {
			for (int z = 0; z < a; z++) {
				if (k == 0) {
					figure[k][z] = "*";
				} else if (z + k == a-1) {
					figure[k][z] = "*";
				} else if (k == a - 1) {
					figure[k][z] = "*";

				} else {
					figure[k][z] = " ";

				}

				System.out.print(figure[k][z]);
			}
			System.out.println();
		}

	}
}