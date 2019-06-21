package task1;

public class Calculator {
	double a;
	double b;
	
	protected double sum() {
		return a + b;
	}
	
	protected double subtract() {
		return b - a;
	}
	
	protected double multiply() {
		return a * b;
	}
	
	protected double divide() {
		return a / b;
	}
	protected double percentage() {
		return (b / 100) * a;
	}
}
