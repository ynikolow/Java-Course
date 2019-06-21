package task2_Bank;

public class LoanAccount extends BaseAccount {

	protected LoanAccount(String iban, Customer owner, double balance, double monthlyInterestRate) {
		super(iban, owner, balance, monthlyInterestRate);
	}

}
