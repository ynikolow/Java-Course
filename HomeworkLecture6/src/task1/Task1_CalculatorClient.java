package task1;

import java.util.Scanner;

public class Task1_CalculatorClient {
	public static void main(String[] args) {
		System.out.println("Please enter the command and the numbers:"
				+ "\nThe format should be: \nCommand 1st number 2nd number");


		Scanner sc = new Scanner(System.in);

		Calculator calc = new Calculator();

		for (int i = 0; i < 100; i++) {
			String line = sc.nextLine();
			String[] splittedLine = line.split(" ");

			if (splittedLine[0].equals("END")) {

				return;

			} else {
				calc.a = Double.parseDouble(splittedLine[1]);
				calc.b = Double.parseDouble(splittedLine[2]);

				switch (splittedLine[0]) {

				case "SUM":
					System.out.println(String.format("%.3f", calc.sum()));
					break;

				case "MUL":
					System.out.println(calc.multiply());
					break;

				case "PER":
					System.out.println(calc.percentage());
					break;

				case "DIV":
					System.out.println(calc.divide());
					break;

				case "SUB":
					System.out.println(calc.subtract());
					break;

				case "END":
					return;

				}
			}
		}
	}
}