package debitCreditCardOperationsUsingConstructor;

import java.util.Scanner;

public class AtmMoneyDeposit {
	String cardNumber; //when access is modified to private cardVerification method showing error
	int pinNumber;
	double balance;
	Scanner sc = new Scanner(System.in);

	public AtmMoneyDeposit() {
		super();
	}

	public double getbalance() {
		return balance;
	}
	// Encapsulating & providing access to card# only for secure method
		public String getcardNumber(boolean isAuthorized) {
			if (isAuthorized) {
				return cardNumber;
			}
			return "No access";
		}
		
	boolean cardVerification(String cardNumber, int pinNumber) {
		if (this.cardNumber.equals(cardNumber) && this.pinNumber == pinNumber) {
			return true;
		}
		return false;
	}

	public String depositMoney(String cardNumber, int pinNumber) {
		if (cardVerification(cardNumber, pinNumber)) {// calling card verification method. No obj needed 

			System.out.println("Please Enter The Deposit Amount");
			int depositAmount = sc.nextInt();
			balance = balance + depositAmount;
			return "Amount deposited Sucessfully";
		}
		return "Invalid credentials. Entered pin number or card number is incorrect";
	}
}
