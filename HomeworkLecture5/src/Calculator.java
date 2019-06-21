
public class Calculator {
	private String history ;
	public Calculator() {
		this.history = "";
	}
	
	private void saveHistory(String newHistory) {
		this.history += newHistory + "\n";
	}
	
	public int sum(int x, int y) {
		this.saveHistory("sum of x: " + x + " y: " + y);
		return x + y;
	}
	
	public int minus(int x, int y) {
		this.saveHistory("minus of x: " + x + " y: " + y);
		return x - y;
	}
	
	public String getHistory() {
		return this.history;
	}
	
	public void showHistory() {
		System.out.println(this.history);
	}
	
	//by value
	public void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		// print from method 
		System.out.println("From method");
		System.out.println(a);
		System.out.println(b);
	}
	//pass by ref
	public void clearHistory(StringBuilder history) {
		history = null;
	}
	
	public long multiply(int a, int b) {
		System.out.println("execute with int");
		return a * b;
	}
	
	public long multiply(long a, long b) {
		System.out.println("execute with long");
		return a * b;
	}
	
	public long multiply(long a, long b, int c) {
		System.out.println("execute with 3 parms 2 longs and 1 int");
		return a * b * c;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		// moethod overloading 
		// here we have 3 overloaded method
		int a = 5;
		int b = 6;
		long c = 10;
		long d = 1;
		calc.multiply(a, c);
		calc.multiply(c, d);
		calc.multiply(c, b, a);
		
		// example for null ref
		// uncomment if you want to try
//		calc = null;
//		if(calc == null) {
//			return;
//		}
		
		int resultOfSum = calc.sum(5, 4);
		calc.minus(calc.sum(1, 2), calc.sum(1, 2));
		StringBuilder history = new StringBuilder("test string");
		calc.showHistory();
		System.out.println(resultOfSum);
		System.out.println(calc.getHistory());
		calc.showHistory();
		
		// swap values pass by value
		int a1 = 3;
		int b1 = 6;
	//	
		calc.swap(a1, b1);
		System.out.println(a1);
		System.out.println(b1);
		

		//var args example 
		calc.printNumbers(1, 2,"3","4");
	}
	// how to use var args
	public void printNumbers(int a, int b, String... varargs) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(varargs[0]);
		System.out.println(varargs[1]);
	}
	

}
