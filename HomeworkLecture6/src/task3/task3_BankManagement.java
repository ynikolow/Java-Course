package task3;

import java.util.Scanner;

public class task3_BankManagement {
	public static void main(String[] args) {

		System.out.println("Please enter command and arguments");

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine() != false) {
			String line = sc.nextLine();
			String[] splittedLine = line.split(" ");

			switch (splittedLine[0]) {
			case "OPEN":
				System.out.print(splittedLine[0]);
				
				Bank.openAccount(splittedLine[3], splittedLine[4], splittedLine[1], splittedLine[2]);

				break;
			case "CLOSE":
				System.out.print(splittedLine[0]);
				Bank.closeAccount(splittedLine[1], splittedLine[2]);

				break;
			case "DEPOSIT":
				System.out.print(splittedLine[0]);
				Bank.deposit(splittedLine[1], Double.parseDouble(splittedLine[2]));
				break;
			case "WITHDRAW":
				System.out.print(splittedLine[0]);
				Bank.withdraw(splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]));
				break;
			case "TRANSFER":
				System.out.print(splittedLine[0]);
				Bank.transfer(splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), splittedLine[4]);
				break;
			case "END":
				Bank.printAccounts();
				return;
			}
			System.out.println();
		}
	}
}