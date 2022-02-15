package debitCreditCardOperationsUsingConstructor;

public class VisaDebit extends AtmMoneyWithdrawlSuprClas2 {
	// Implemented Multilevel Inheritance
	
	public VisaDebit() {
		super();
	}

	public VisaDebit(String cardNumber, int pinNumber, double balance) {// parameterised Constructor
		super();
		setCardNumber(cardNumber);
		setPinNumber(pinNumber);;
		this.balance = balance;
	}

	public String billPayment(boolean isBillPaymentActivated) {
		if (isBillPaymentActivated) {
			System.out.println("Enter the Bill Amount");
			double billamount = sc.nextDouble();
			if ((balance >= billamount)) {
				balance = balance - billamount;
				return "Bill Payment Sucessful";
			}
			return "No sufficient Balance to process the payment";
		}
		return "Bill payment not activated for the institution. Please activate & try again";
	}

}
