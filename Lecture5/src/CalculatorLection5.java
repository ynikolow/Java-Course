
public class CalculatorLection5 {
	String history;
	public CalculatorLection5() {
	this.history = "";
	}
	
	private void saveHistory(String newHistory) {
		this.history += "\n" + newHistory;
		
	}

 public int sum(int x, int y) {
	 this.saveHistory("sum of x:"+ x + "y:" + y);
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
public static void main(String[] args) {
	CalculatorLection5 calc = new CalculatorLection5();
	int resultOfSum = calc.sum(5, 4);
	calc.sum(5, 4);
	calc.sum(5, 4);

	System.out.println(resultOfSum);
//	System.out.println(calc.getHistory());
	calc.showHistory();
}
}