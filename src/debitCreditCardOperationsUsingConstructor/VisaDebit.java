package debitCreditCardOperationsUsingConstructor;

public class VisaDebit extends AtmMoneyWithdrawl {
	//Implemented Multilevel Inheritance
	
	public VisaDebit() {
		super();
	}

	public VisaDebit(String cardNumber, int pinNumber, double balance) {// parameterised Constructor
		super();
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
		this.balance = balance;
	}

	public String preAuthorizedDebit(String cardNumber) {
		if (this.cardNumber.equals(cardNumber)) {
			System.out.println("Enter the Bill Amount");
			double billamount = sc.nextDouble();
			if ((balance >= billamount)) {
				balance = balance - billamount;
				return "Bill Payment Sucessful";
			}
			return "Transaction declined.No sufficient Balance";
		}
		return "Transaction declined.Pre-Authorization not activated for the institution";
	}

}
