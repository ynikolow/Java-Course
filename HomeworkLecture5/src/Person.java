
public class Person {
	private String name;
	private int age;
	private boolean isMale;
	private float salary;
	
	public Person(String name, int age, boolean isMale, float salary) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
		this.salary = salary;
		
	}
	
	public Person() {
		this.name = "UNKNOWN";
		this.age = 0;
		this.isMale = false;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isMale() {
		return isMale;
	}

	private void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public void run() {
		System.out.println("Person " + this.name +" running");
	}
	
	public  String writeCode(String lang) {
		String result = "Pesron " + this.name 
				+ "write code with lang " + lang;
		return result;
	}
	
//	public float calcSalary() {
//		if( this.salary < 500) {
//			return this.salary;
//		}
//		return this.salary - this.salary*0.1f;
//		
//	}
	
	public void calcSalary() {
		if( this.salary < 500) {
			System.out.println(this.salary);
			return;
		}
		System.out.println(this.salary - this.salary*0.1f);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Person: name = " + this.name +
				" age = " + this.age + 
				" isMale = " + this.isMale; 
	}

	public static void main(String[] args) {
		Person stoian = new Person("Stoian", 25, true, 1000);
		Person gosho = new Person("Gosho", 20, true, 400);
		Person[] persons = new Person[10];
		persons[0] = stoian;
		persons[1] = gosho;
		
//		float sumOfSalary = 0f;
		for(int i = 0; i < 2; ++i) {
//			sumOfSalary += persons[i].calcSalary();
			persons[i].calcSalary();
		}
//		System.out.println("Sum is " + sumOfSalary);
//		Person stoian2 = new Person("Georgi", 15, false);
//		stoian.run();
		
//		String result = stoian2.writeCode("Java");
//		System.out.println(result);
//		
//		System.out.println(stoian);
//		System.out.println(stoian2);
	}
}

