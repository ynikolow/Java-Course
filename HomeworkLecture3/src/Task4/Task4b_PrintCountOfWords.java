package Task4;

import java.util.Scanner;

public class Task4b_PrintCountOfWords {
	public static void main(String[] args) {

		System.out.println("Please enter your text:");
		Scanner sc = new Scanner(System.in);
		int countOfWords = 0;

		String input = sc.nextLine();
		String[] array = input.split(" ");

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].matches("[a-zA-Z]+")) {
				countOfWords++;
			}
		}
		// The sentance can end only with one of these characters . ? !
		String lastWord = array[array.length - 1];
		if (lastWord.endsWith(".") || lastWord.endsWith("!")
				|| lastWord.endsWith("?") && lastWord.substring(0, lastWord.length() - 1).matches("[a-zA-Z]+")) {
			countOfWords++;
		}

		System.out.println("The number of words is: " + countOfWords);
	}
}
