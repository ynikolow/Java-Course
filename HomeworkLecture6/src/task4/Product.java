package task4;

public class Product {
	private String _name;
	private double _price;

	protected Product(String name, double price) {
		_name = name;
		_price = price;
	}

	public String get_name() {
		return _name;
	}

	public double get_price() {
		return _price;
	}
}
