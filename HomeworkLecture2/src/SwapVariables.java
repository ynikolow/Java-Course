import java.util.Scanner;

public class SwapVariables {
	public static void main(String[] args) {
		System.out.println("Please insert your first number:");
		Scanner sc1 = new Scanner(System.in);
		int firstNumber = sc1.nextInt();
		System.out.println("Please insert your second number:");
		int secondNumber = sc1.nextInt();
		sc1.close();
		int swapper;
		swapper = firstNumber;
		firstNumber = secondNumber ;
		secondNumber = swapper ;
		System.out.println("The result is:");
		System.out.println("the new first number is: " + firstNumber);
		System.out.println("the new second number is: " + secondNumber);
		
	}

}
