
public class Calculator {
	String history;
	public Calculator() {
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
	 return 0;
	 
	 


	}

}
