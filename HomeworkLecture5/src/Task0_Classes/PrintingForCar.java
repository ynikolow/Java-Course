package Task0_Classes;

import java.util.Scanner;

public class PrintingForCar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the car's:\nbrand, model, horse power and year \nin the already mentioned fashion.");
		Car car1 = new Car(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
		System.out.println(car1.taxCalculator());
	}

}
