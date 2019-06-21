package task2_Bank;

public class BaseAccount {

	private String _iban;
	private Customer _owner;
	private double _balance;

	private double _monthlyInterestRate;

	protected BaseAccount(String iban, Customer owner, double balance, double monthlyInterestRate) {
		_iban = iban;
		_owner = owner;
		_balance = balance;
		_monthlyInterestRate = monthlyInterestRate;
	}

	protected static void deposit(BaseAccount account, double amount) {
		account._balance += amount;
	}

	protected static double getInterestAmount(BaseAccount account, double months) {
		if (account instanceof LoanAccount) {
			if (account._owner instanceof IndividualCustomer) {
				months -= 3;
//if account is isntance of Corporate Customer it goes here 
			} else {
				months -= 2;
			}
		} else if (account instanceof MortgageAccount) {
			if (account._owner instanceof IndividualCustomer) {
				months -= 6;
//if account is instance of Corporate Customer it goes here 
			} else {
				if (months <= 12) {
					months /= 2;
					/*
					 * if the months are more than 12 we should calculate 50 % of the interest rate
					 * for the first year + all the months after the first year
					 */
				} else {
					months = 6 + months - 12;
				}
			}
//the else is in case the account is of a DepositAccount. we have no specification for that account
		} else {

		}
		if (months <= 0) {
			months = 1;
		} else {

		}
		return account._monthlyInterestRate / 100 * account._balance * months;
	}

	protected static void withdraw(BaseAccount account1, double amount) {
		if (account1 instanceof DepositAccount) {
			account1._balance -= amount;
		} else {
			System.out.println("Only deposit accounts have withdraw function");
		}
	}
}
