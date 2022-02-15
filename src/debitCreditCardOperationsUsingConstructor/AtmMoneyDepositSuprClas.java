package debitCreditCardOperationsUsingConstructor;

import java.util.Scanner;

public class AtmMoneyDepositSuprClas {
	private String cardNumber;
	private int pinNumber;
	double balance;
	Scanner sc = new Scanner(System.in);

	public AtmMoneyDepositSuprClas() {
		super();
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	// Encapsulating & providing access to card# only for secure method
	public String getcardNumber(boolean isAuthorized) {
		if (isAuthorized) {
			return cardNumber;
		}
		return "No access";
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getbalance() {
		return balance;
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