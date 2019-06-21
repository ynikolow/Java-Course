import java.util.Scanner;

public class SecondsInBiggerIntervals {
	public static void main(String[] args) {

		System.out.println("Please enter seconds:");
		Scanner sc = new Scanner(System.in);
		long seconds = sc.nextLong();
		sc.close();

		int aMinuteInSeconds = 60;
		int anHourInSeconds = aMinuteInSeconds * 60;
		int aDayInSeconds = anHourInSeconds * 24;

		byte d = (byte) (seconds / aDayInSeconds);

		byte h = (byte) ((seconds % aDayInSeconds / anHourInSeconds));

		byte m = (byte) (((seconds % aDayInSeconds % anHourInSeconds/ aMinuteInSeconds)));

		byte s = (byte) (((seconds % aDayInSeconds % anHourInSeconds % aMinuteInSeconds)));
		System.out.println("The result is:");
		System.out.println(d + " days, " + h + " hours, " 
		+ m + " minutes, " + s + " seconds");
		
	}

}
