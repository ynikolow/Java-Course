package task2_Bank;

public class DepositAccount extends BaseAccount {

	protected DepositAccount(String iban, Customer owner, double balance, double monthlyInterestRate) {
		super(iban, owner, balance, monthlyInterestRate);
	}

}
