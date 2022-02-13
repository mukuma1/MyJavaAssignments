package debitCreditCardOperationsUsingConstructor;

public class VisaCredit extends AtmMoneyWithdrawl {
	//Multilevel Inheritance
	double creditAvailable;
	int creditLimit;
	double balance;
	int dailywithdrawLimit;

	public VisaCredit(String cardNumber, int pinNumber, double creditAvailable, int creditLimit,int dailyWithdrawLimit) {
		super();
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
		this.creditAvailable = creditAvailable;
		this.creditLimit = creditLimit;
		this.dailywithdrawLimit=dailyWithdrawLimit;
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
	public double withDrawMoney(String cardNumber, int pinNumber) {
		if (cardVerification(cardNumber, pinNumber)) {
			System.out.println("Please Enter The Amount to be withdrawn");
			int amountToBeWithdrawn = sc.nextInt();
			if ((creditAvailable >= amountToBeWithdrawn)&&amountToBeWithdrawn<=(dailywithdrawLimit-5)) {// Cash advance service charge=5.00/-
				getbalance();
				balance = balance + amountToBeWithdrawn + 5;// Cash advance service charge=5.00/-
				creditAvailable = creditLimit - balance;
				return amountToBeWithdrawn;
			}
		}
		return 0;
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
	public String billPayment(String cardNumber) {
		if (this.cardNumber.equals(cardNumber)) {
			System.out.println("Enter the Bill Amount");
			double billamount = sc.nextDouble();
			if (billamount <= creditAvailable) {
				double cashBack = billamount * 0.01;
				getbalance();
				balance = balance + billamount - cashBack;
				creditAvailable = creditLimit - balance;
				return "Bill Payment Sucessful";
			}
			return "No sufficient Balance to process the payment";
		}
		return "Bill payment not activated for the institution. Please activate & try again";
	}

}
