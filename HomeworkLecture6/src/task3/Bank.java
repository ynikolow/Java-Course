package task3;

import java.util.HashMap;
import java.util.Map;

import task2.Credentials;

public class Bank {
	private static Map<String, Account> accounts = new HashMap<String, Account>();
	private static double allAssets;
	private static StringBuilder allAccounts = new StringBuilder();

	public static void openAccount(String name, String govId, String username, String password) {
		if (accounts.get(username) == null) {
		Credentials credentials = new Credentials(username, password);
		accounts.put(username, new Account(credentials, name, govId));
		System.out.print(" success");
		} else {
			System.out.println(" fail");
		}
	}

	public static void closeAccount(String username, String password) {
		if (accounts.get(username).hasAccess(password) == true) {
			accounts.remove(username);
			System.out.print(" success");
		} else {
			System.out.print(" fail");
		}
	}

	public static void deposit(String username, double amount) {
		if (amount >= 0) {
			accounts.get(username).deposit(amount);
			System.out.print(" success");
		} else {
			System.out.print(" fail");
		}
	}

	public static void withdraw(String username, String password, double amount) {
		if (amount >= 0 && accounts.get(username).getBalance() >= amount) {
			accounts.get(username).withdraw(amount);
			System.out.print(" success");
		} else {
			System.out.print(" fail");
		}
	}

	public static void transfer(String username, String password, double amount, String recipient) {
		if (amount >= 0 && accounts.get(username).getBalance() > amount
				&& accounts.get(username).hasAccess(password) == true) {
			accounts.get(username).withdraw(amount);
			accounts.get(recipient).deposit(amount);
			System.out.print(" success");
		} else {
			System.out.print(" fail");
		}
	}

	public static void printAccounts() {
		for (Map.Entry<String, Account> entry : accounts.entrySet()) {
			allAssets += entry.getValue().getBalance();
			allAccounts.append((entry.getValue().getName() + ", " + entry.getValue().getGovld() + ", "
					+ String.format("%.2f", entry.getValue().getBalance())) + "\n");
		}
		System.out.println(allAssets);
		System.out.println(allAccounts);
	}
}
