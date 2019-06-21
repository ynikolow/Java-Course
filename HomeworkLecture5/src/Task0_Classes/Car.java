package Task0_Classes;

import java.util.Scanner;

public class Car {
	private String brand;
	private String model;
	private int horsePower;
	private int year;

	private int currentYear = 2019;
	private String category;
	private double sum;

	public Car(String brand, String model, int horsePower, int year) {
		this.brand = brand;
		this.model = model;
		this.horsePower = horsePower;
		this.year = year;
	}

	public String insuranceCategory() {
		if (year >= (currentYear - 8)) {
			category = "1st Category";
		} else if (year > (currentYear - 15) && year < (currentYear - 8)) {
			category = "2nd Category";
		} else if (year > (currentYear - 25) && year < (currentYear - 15)) {
			category = "3rd Category";
		} else {
			category = "4th Category";
		}
		return category;
	}

	public double taxCalculator() {
		if (insuranceCategory() == null) {
			insuranceCategory();
		} else {

			switch (category) {
			case "1st Category":
				sum = 150;
				break;
			case "2nd Category":
				sum = 200;
				break;
			case "3rd Category":
				sum = 300;
				break;
			case "4th Category":
				sum = 500;
				break;
			}
			if (horsePower < 80) {
				sum += sum * .2;
			} else if (horsePower > 140) {
				sum += sum * .45;
			} else {

			}
		}
		return sum;
	}
}
