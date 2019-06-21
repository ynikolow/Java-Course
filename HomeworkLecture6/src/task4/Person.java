package task4;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String _name;
	private double _balace;
	private List<String> _purchases = new ArrayList<String>();

	protected Person(String name, double balance) {
		_name = name;
		_balace = balance;
		_purchases = new ArrayList<>();
	}

	public void addPurchase(String purchase) {
		this._purchases.add(purchase);
	}

	public static void printPurchases(Person person1) {
		StringBuilder purchasesOfPerson = new StringBuilder();
		purchasesOfPerson.append(person1._name + " - ");
		if (!person1._purchases.isEmpty()) {
			for (int i = 0; i < person1._purchases.size() -1; i ++) {
				purchasesOfPerson.append(person1._purchases.get(i) + ", ");
			}
			purchasesOfPerson.append(person1._purchases.get(person1._purchases.size()-1));
		} else {
			purchasesOfPerson.append("Nothing bought");
		}
		System.out.println(purchasesOfPerson.toString());
	}

	public String get_name() {
		return _name;
	}

	public double get_balace() {
		return _balace;
	}

	public static void replaceAmount(Person person, double price) {
		person._balace -= price;
	}
}
