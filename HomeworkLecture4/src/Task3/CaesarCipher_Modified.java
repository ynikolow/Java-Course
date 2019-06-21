package Task3;

import java.util.Scanner;

public class CaesarCipher_Modified {
	public static void main(String[] args) {
		System.out.println("Please enter your text:");
		Scanner sc = new Scanner(System.in);
		String scanned = sc.nextLine();
//		System.out.println("Please enter the tool: (encode or decode)");
//		String method = sc.next();
		System.out.println("Please enter the margin:");
		int b = sc.nextInt();
		sc.close();
		
		char[] array = scanned.toCharArray();
		String[] arrayToSrting = new String[scanned.length()];
		
		for (int i = 0; i < scanned.length(); i++) {
			arrayToSrting[i] = Character.toString(array[i]);
		}
		StringBuilder outputString = new StringBuilder();
		StringBuilder alphabet = new StringBuilder();
		for (char i = 'a'; i <= 'z'; i++) {
			alphabet.append(i);
		}
		alphabet.append(alphabet);
		alphabet.append(alphabet);
		String alphabet1 = alphabet.toString();
		
		for (int i = 0; i<arrayToSrting.length; i ++) {
			if (alphabet.indexOf(arrayToSrting[i]) >=0) {
				int place = alphabet.indexOf(arrayToSrting[i]);
				outputString.append(alphabet1.charAt(place+b));
		}
}
		System.out.println(outputString);
}
}
