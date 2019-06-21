import java.util.Scanner;

public class InchToCM {
	public static void main(String[] args) {
		System.out.println("Please insert inches");
		/* the program works on my end when you insert a number with "," 
		 * not with "." ; why?
		 */
		Scanner sc = new Scanner(System.in);
		double inches = sc.nextDouble();
		sc.close();
		double fromInchToCM = inches *2.54;
		
		System.out.println("The value in cm is:" + "\n" +fromInchToCM);
		
	}

}
