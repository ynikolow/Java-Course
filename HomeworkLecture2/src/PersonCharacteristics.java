import java.util.Scanner;

public class PersonCharacteristics {
	public static void main(String[] args) {
		System.out.println("Please enter your first name:");
		Scanner sc1 = new Scanner(System.in);
		String firstName = sc1.next();
		System.out.println("Please enter your last name:");
		String lastName = sc1.next();
		System.out.println("Please enter the year of your birth:");
		int yearOfBirth = 2019 - sc1.nextShort();
		System.out.println("Please enter your weight");
		float weight = sc1.nextFloat();
		System.out.println("Please enter your height in cm:");
		float height = sc1.nextFloat();
		System.out.println("Please enter your profession:");
		String proffesion = sc1.next();
		sc1.close();
		System.out.println(firstName + lastName + " is " + yearOfBirth + " years old. "
		+ "His weight is " + weight + " and he is " + height + " cm tall."
		+ " He is a " + proffesion);
	}

}
