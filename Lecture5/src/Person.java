
public class Person {
	private String name;
	private int age;
	private boolean isMale;

	public Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;

	}

	private boolean isMale() {
		return isMale;
	}

	private void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public static void main(String[] args) {
		Person stoian = new Person("Stoian", 24, true);
		System.out.println(stoian.isMale());

	}

}
