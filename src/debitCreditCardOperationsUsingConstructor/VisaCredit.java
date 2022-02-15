package debitCreditCardOperationsUsingConstructor;

public class VisaCredit extends AtmMoneyWithdrawlSuprClas2 {
	// Multilevel Inheritance
	double creditAvailable;
	int creditLimit;
	double balance;
	int dailywithdrawLimit;

	public VisaCredit(String cardNumber, int pinNumber, double creditAvailable, int creditLimit,
			int dailyWithdrawLimit) {
		super();
		setCardNumber(cardNumber);
		setPinNumber(pinNumber);
		this.creditAvailable = creditAvailable;
		this.creditLimit = creditLimit;
		this.dailywithdrawLimit = dailyWithdrawLimit;
	}

	@Override
	public double getbalance() {
		balance = creditLimit - creditAvailable;
		return balance;
	}

	public double getcreditAvailable() {
		return creditAvailable;
	}

	@Override
	public String withDrawMoney(String cardNumber, int pinNumber) {
		if (cardVerification(cardNumber, pinNumber)) {
			System.out.println("Please Enter The Amount to be withdrawn");
			int amountToBeWithdrawn = sc.nextInt();
			if (amountToBeWithdrawn <= (dailywithdrawLimit - 5)) {// Cash advance service charge=5.00/-
				if (creditAvailable >= amountToBeWithdrawn) {
					getbalance();
					balance = balance + amountToBeWithdrawn + 5;// Cash advance service charge=5.00/-
					creditAvailable = creditLimit - balance;
					return "Withdrawl sucessfull for the amount of " + amountToBeWithdrawn;
				}
				return "Unable to process. Insufficient Balance";
			}
			return "Requested Amount exceeds the daily withdrawl limit";
		}
		return "Invalid credentials. Entered Card Number or Pin Number is incorrect";
	}

	@Override
	public String depositMoney(String cardNumber, int pinNumber) {
		if (cardVerification(cardNumber, pinNumber)) {// calling card verification method. No obj needed

			System.out.println("Please Enter The Deposit Amount");
			int depositAmount = sc.nextInt();
			getbalance();
			balance = balance - depositAmount;
			creditAvailable = creditLimit - balance;
			return "Amount deposited Sucessfully";
		}
		return "Invalid credentials. Entered pin number or card number is incorrect";
	}

	/*
	 * Assuming 1% immediate cash back for all purchases & bill payment done via
	 * credit card
	 */
	public String preAuthorizedDebit(boolean isPreAuthorizedPaymentActivated) {
		if (isPreAuthorizedPaymentActivated) {
			System.out.println("Enter the Bill Amount");
			double billamount = sc.nextDouble();
			if (billamount <= creditAvailable) {
				double cashBack = billamount * 0.01;
				getbalance();
				balance = balance + billamount - cashBack;
				creditAvailable = creditLimit - balance;
				return "Transaction Sucessful";
			}
			return "Transaction declined.No sufficient Balance";
		}
		return "Transaction declined.Pre-Authorization not activated for the institution";
	}

}