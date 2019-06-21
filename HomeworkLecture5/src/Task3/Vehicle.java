package Task3;

public class Vehicle {
	String type;
	String model;
	int power;
	double fuelConsumption;
	int yearProduced;
	String licenseNo;
	int weight;
	String color;
	

	public Vehicle(String type, String model, int power, double fuelConsumption, int yearProduced, String licenseNo,
			int weight, String color) {
		super();
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		this.licenseNo = licenseNo;
		this.weight = weight;
		this.color = color;
	}
	
	public Vehicle(String type, String model, int power, double fuelConsumption, int yearProduced, String licenseNo
			) {
		super();
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		this.licenseNo = licenseNo;
	}

	public double calculateTripPrice(double fuelPrice, double distance) {
		return distance / 100 * this.fuelConsumption * fuelPrice;
	}

	public double getInsurancePrice() {
		float typeCoefficinet = 0;
		switch (type) {
		case "car":
			typeCoefficinet = 1;
		case "suv":
			typeCoefficinet = 1.12f;
		case "truck":
			typeCoefficinet = 1.2f;
		case "motorcycle":
			typeCoefficinet = 1.5f;
		default:
			System.out.println("Please check your spelling");

		}
		return (.16 * power) * (1.25 * yearProduced) * (.05 * fuelConsumption) * typeCoefficinet;
	}

}
