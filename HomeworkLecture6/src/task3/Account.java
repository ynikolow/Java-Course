package task3;

import task2.Credentials;

public class Account {
	private Credentials credentials;
	private String name;
	private String govId;
	private double balance;
	
	public Account(Credentials credentials, String name, String govld) {
		this.credentials = credentials;
		this.name = name;
		this.govId = govld;
		balance = 0.0;
	}
	
	public Credentials getCredentials() {
		return credentials;
	}

	public String getName() {
		return name;
	}

	public String getGovld() {
		return govId;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public boolean hasAccess(String password) {
		return this.credentials.getPassword().equals(password);
	}
}