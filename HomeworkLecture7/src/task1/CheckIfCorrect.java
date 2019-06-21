package task1;

public class CheckIfCorrect {

	protected static boolean checkName(String name) {
		boolean isItForTermination = false;
		if (!(name.length() >= 2 && name.length() <= 30)) {
			System.out.println("Expected lenght for " + name + " is between 2 and 30 symbols");
			isItForTermination = true;
		} else if (!(name.matches("[A-Za-z]+"))) {
			System.out.println("Expected only latin letters in " + name + ".");
			isItForTermination = true;
		} else if (!(Character.isUpperCase(name.charAt(0)))) {
			System.out.println("Expected upper case letter at first positon of " + name + ".");
			isItForTermination = true;
		} else {

		}
		return isItForTermination;
	}

	protected static boolean checkFacultyNumber(String facultyNumber) {
		boolean isItForTermination = false;
		if (facultyNumber.length() >= 5 && facultyNumber.length() <= 10) {

		} else {
			System.out.println("Expected lenght for faculty number is between 5 and 10 symbols");
			isItForTermination = true;
		}
		return isItForTermination;
	}

	protected static boolean checkIfPositive(double salaryOrHours) {
		boolean isItForTermination = false;
		if (salaryOrHours >= 0) {

		} else {
			System.out.println("Expected positive number for " + salaryOrHours + ".");
			isItForTermination = true;
		}
		return isItForTermination;
	}

	protected static boolean chechIfIngeger(String input) {
		boolean isItForTermination = false;
		if (!(input.contains(".") || input.contains(","))) {

		} else {
			System.out.println("Expected integer for " + input + ".");
			isItForTermination = true;
		}
		return isItForTermination;
	}

}