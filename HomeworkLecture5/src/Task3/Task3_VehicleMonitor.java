package Task3;

import java.util.Scanner;

public class Task3_VehicleMonitor {
	public static void main(String[] args) {
		System.out.println("Please enter the number of vehicles:");
		Scanner sc = new Scanner(System.in);
		int numberOfCars = sc.nextInt();
		System.out.println("Please enter the current price of fuel:");
		float priceOfFuel = sc.nextFloat();
		System.out.println("Please enter the cars:");

		Vehicle[] vehicles = new Vehicle[numberOfCars];
		sc.nextLine();

		for (int i = 0; i < numberOfCars; i++) {
			String line = sc.nextLine();
			String[] splittedArray = line.split(",");
			String type = splittedArray[0].trim();
			String model = splittedArray[1].trim();
			int power = Integer.parseInt(splittedArray[2].trim());
			double fuelConsumption = Double.parseDouble(splittedArray[3].trim());
			int yearProduced = Integer.parseInt(splittedArray[4].trim());
			float distance = Float.parseFloat(splittedArray[5].trim());
			String licenseNo = String.format("%04d", i);

			switch (splittedArray.length) {
			case 6:
				vehicles[i] = new Vehicle(type, model, power, fuelConsumption, yearProduced, licenseNo);
				break;
			case 8:
				int weight = Integer.parseInt(splittedArray[6].trim());
				String color = splittedArray[7].trim();
				vehicles[i] = new Vehicle(type, model, power, fuelConsumption, yearProduced, licenseNo, weight, color);
				break;

			default:
				break;
			}

		}
		for (int i = 0; i < vehicles.length; i++) {

		}
	}

}
