package task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4_Market {

	private static Map<String, Person> _allPeople = new HashMap<String, Person>();
	private static Map<String, Product> _allProducts = new HashMap<String, Product>();


	public static void main(String[] args) {

		System.out.println("Please, enter the people and their balances");
		Scanner sc = new Scanner(System.in);
		String people = sc.nextLine();
		System.out.println("Please, enter the products and their price");
		String produts = sc.nextLine();

		String[] splittedLineOfPeople = people.split(";");
		String[] splittedLineOfProducts = produts.split(";");

		for (int i = 0; i < splittedLineOfPeople.length; i++) {
			String[] splittedElementOfPeople = splittedLineOfPeople[i].split("=");
			if (!splittedElementOfPeople[0].isEmpty()) {
				if (!(Double.parseDouble(splittedElementOfPeople[1]) < 0)) {
					_allPeople.putIfAbsent(splittedElementOfPeople[0],
							new Person(splittedElementOfPeople[0], Double.parseDouble(splittedElementOfPeople[1])));
				} else {
					System.out.println("Balance cannot be negative");
					return;

				}
			} else {
				System.out.println("Name cannot be empty.");
				return;
			}
		}
		for (String str : splittedLineOfProducts) {
			String[] splittedElementOfProducts = str.split("=");
			if (!(Double.parseDouble(splittedElementOfProducts[1]) < 0)) {
				_allProducts.putIfAbsent(splittedElementOfProducts[0],
						new Product(splittedElementOfProducts[0], Double.parseDouble(splittedElementOfProducts[1])));
			} else {
				System.out.println("Price cannot be negative");
				return;
			}
		}

		String commands;
		while (!(commands = sc.nextLine()).equalsIgnoreCase("END")) {
			String[] operation = commands.split(" ");
			if (_allPeople.get(operation[0]) != null && _allProducts.get(operation[1]) != null) {
				if (_allPeople.get(operation[0]).get_balace() >= _allProducts.get(operation[1]).get_price()) {
					Person.replaceAmount(_allPeople.get(operation[0]), _allProducts.get(operation[1]).get_price());
					_allPeople.get(operation[0]).addPurchase(operation[1]);
					System.out.println(_allPeople.get(operation[0]).get_name() + " bought "
							+ _allProducts.get(operation[1]).get_name());
				} else {
					System.out.println(_allPeople.get(operation[0]).get_name() + " can't afford "
							+ _allProducts.get(operation[1]).get_name());
				}
			} else {
				System.out.println("Please, check if you have entered the inputs correctly");
			}
		}
		for (Map.Entry<String, Person> entry : _allPeople.entrySet()) {
			Person.printPurchases(entry.getValue());
		}
	}
}
