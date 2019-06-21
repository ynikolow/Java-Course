package task2_Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2_Bank {
	public static void main(String[] args) {
		System.out.println("Please, enter commands: ");
		
		Scanner sc = new Scanner(System.in);
		String input;
		int ibanCount = 0;
		

		Map<String, BaseAccount> mapOfAllAccounts = new HashMap<String, BaseAccount>();

		while (!(input = sc.nextLine()).equalsIgnoreCase("END")) {
			String[] information = input.split(" ");

			switch (information[0]) {
			case "OPEN":
				ibanCount++;
				if (Integer.parseInt(information[2]) == 1) {
					switch (Integer.parseInt(information[3])) {
					case 1:
						mapOfAllAccounts.put(String.format("%08d", ibanCount),
								new DepositAccount(String.format("%08d", ibanCount),
										new IndividualCustomer(information[1]), Double.parseDouble(information[4]),
										Double.parseDouble(information[5])));

						break;

					case 2:
						mapOfAllAccounts.put(String.format("%08d", ibanCount),
								new LoanAccount(String.format("%08d", ibanCount),
										new IndividualCustomer(information[1]), Double.parseDouble(information[4]),
										Double.parseDouble(information[5])));

						break;

					case 3:
						mapOfAllAccounts.put(String.format("%08d", ibanCount),
								new MortgageAccount(String.format("%08d", ibanCount),
										new IndividualCustomer(information[1]), Double.parseDouble(information[4]),
										Double.parseDouble(information[5])));

						break;

					default:
						System.out.println("Please, check your inputs");
						break;

					}
				} else if (Integer.parseInt(information[2]) == 2) {
					switch (Integer.parseInt(information[3])) {
					case 1:
						mapOfAllAccounts.put(String.format("%08d", ibanCount),
								new DepositAccount(String.format("%08d", ibanCount),
										new CorporateCustomer(information[1]), Double.parseDouble(information[4]),
										Double.parseDouble(information[5])));

						break;

					case 2:
						mapOfAllAccounts.put(String.format("%08d", ibanCount),
								new LoanAccount(String.format("%08d", ibanCount), new CorporateCustomer(information[1]),
										Double.parseDouble(information[4]), Double.parseDouble(information[5])));

						break;

					case 3:
						mapOfAllAccounts.put(String.format("%08d", ibanCount),
								new MortgageAccount(String.format("%08d", ibanCount),
										new CorporateCustomer(information[1]), Double.parseDouble(information[4]),
										Double.parseDouble(information[5])));

						break;

					default:
						System.out.println("Please, check your inputs");
						break;

					}

				} else {
					System.out.println("One can type only 1 or 2");
				}

				break;

			case "PUT":
				BaseAccount.deposit(mapOfAllAccounts.get(information[1]), Double.parseDouble(information[2]));

				break;

			case "GET":
				BaseAccount.withdraw(mapOfAllAccounts.get(information[1]), Double.parseDouble(information[2]));

				break;

			case "INFO":

				System.out.println(String.format("%.2f", BaseAccount
						.getInterestAmount(mapOfAllAccounts.get(information[1]), Double.parseDouble(information[2]))));
				break;

			default:
				System.out.println("Please, check your inputs");
				break;
			}
		}
	}
}
