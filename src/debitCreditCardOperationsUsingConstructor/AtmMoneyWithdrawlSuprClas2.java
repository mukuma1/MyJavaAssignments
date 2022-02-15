package debitCreditCardOperationsUsingConstructor;

public class AtmMoneyWithdrawlSuprClas2 extends AtmMoneyDepositSuprClas {

	public AtmMoneyWithdrawlSuprClas2() {
		super();
	}

	public String withDrawMoney(String cardNumber, int pinNumber) {
		if (cardVerification(cardNumber, pinNumber)) {
			System.out.println("Please Enter The Amount to be withdrawn");
			int amountToBeWithdrawn = sc.nextInt();
			if ((balance >= amountToBeWithdrawn)) {
				balance = balance - amountToBeWithdrawn;
				return "Withdrawl sucessfull for the amount of " + amountToBeWithdrawn;
			}
			return "Unable to process. Insufficient Balance";
		}
		return "Invalid credentials. Entered Card Number or Pin Number is incorrect";
	}
}
