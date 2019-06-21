package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task2_CredentialsManager {
	public static void main(String[] args) {

		System.out.println("Please enter operation Username Password New passoword");
		Scanner sc = new Scanner(System.in);

		List<Credentials> dataBase = new ArrayList<Credentials>();
		HashMap<String, List<String>> passwords = new HashMap<String, List<String>>();

		for (int i = 0; i < 100; i++) {
			String line = sc.nextLine();
			String[] splittedLine = line.split(" ");

			switch (splittedLine[0]) {
			case "ENROLL":
				dataBase.add(new Credentials(splittedLine[1].trim(), splittedLine[2].trim()));
				List<String> pass = new ArrayList<String>();
				pass.add(splittedLine[2].trim());
				passwords.put(splittedLine[1].trim(), pass);
				System.out.println("ENROLL success");
				break;

			case "CHPASS":

				List<String> tempPassword = new ArrayList<>();
				tempPassword = passwords.get(splittedLine[1].trim());
				List<String> withoutLastPassword = new ArrayList<>();
				withoutLastPassword = tempPassword;
				if (tempPassword.size() != 1) {
					withoutLastPassword = tempPassword.subList(0, tempPassword.size() - 1);
				} else {
					withoutLastPassword = null;
				}
				if (tempPassword.get(tempPassword.size() - 1).equals(splittedLine[2].trim())
						&& (withoutLastPassword == null
								|| withoutLastPassword.contains(splittedLine[3].trim()) == false)) {
					tempPassword.add(splittedLine[3].trim());
					passwords.replace(splittedLine[1].trim(), tempPassword);
					for (int j = 0; j < dataBase.size(); j++) {
						if (dataBase.get(j).getUsername().equals(splittedLine[1])) {
							dataBase.get(j).setPassword(splittedLine[3].trim());
						}

					}
					System.out.println("CHPASS success");
				} else {
					System.out.println("CHPASS fail");
				}

				break;

			case "AUTH":
				List<String> forAuthorization = new ArrayList<>();
				forAuthorization = passwords.get(splittedLine[1].trim());
				if (forAuthorization.get(forAuthorization.size() - 1).equals(splittedLine[2].trim())) {
					System.out.println("AUTH success");
				} else {
					System.out.println("AUTH fail");
				}

				break;
			case "END":
				i = 100;
				break;

			}

		}

	}
}