package debitCreditCardOperationsUsingConstructor;

public class AtmMoneyWithdrawl extends AtmMoneyDeposit {
	
	public AtmMoneyWithdrawl() {
		super();
	}

	public double withDrawMoney(String cardNumber, int pinNumber) {// return DT string or void or int run time warning.
																	// Why
		if (cardVerification(cardNumber, pinNumber)) {
			System.out.println("Please Enter The Amount to be withdrawn");
			double amountToBeWithdrawn = sc.nextDouble();
			if ((balance >= amountToBeWithdrawn)) {
				balance = balance - amountToBeWithdrawn;
				return amountToBeWithdrawn;
			}
		}
		return 0;
	}
}
