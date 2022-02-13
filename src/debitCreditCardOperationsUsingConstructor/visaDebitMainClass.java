package debitCreditCardOperationsUsingConstructor;

import java.util.Scanner;

public class visaDebitMainClass {
	public static void main(String[] args) {
		//Task: Performing three operations; pre-authorized debit, cash deposit & cash withdrwal & printing the closing balance
		Scanner sc = new Scanner(System.in);
		boolean isPreAuthorizedPaymentActivated = false;
		VisaDebit obj = new VisaDebit("4111111111111111", 1234, 1000.50);//Creating object & initializing variables
		// Debiting Pre-authorized payments from account using debit card#
		System.out.println("Debiting Pre-authorized payments from account using debit card#");
		System.out.println("Enter name of the Institution");
		if (sc.next().equals("Reliance")) {
			isPreAuthorizedPaymentActivated = true;
		}
		System.out.println(obj.preAuthorizedDebit(obj.getcardNumber(isPreAuthorizedPaymentActivated)));
		System.out.println("Available Balance: " + obj.getbalance());

		// Depositing cash via ATM
		System.out.println("\nDepositing cash via ATM");
		System.out.println("Enter the Card Number for verification");
		String cardNumber = sc.next();
		System.out.println("Enter the Pin Number for verification");
		int pinNumber = sc.nextInt();
		System.out.println(obj.depositMoney(cardNumber, pinNumber));
		System.out.println("Availabe Balance: " + obj.getbalance());

		// Withdrawing cash via ATM
		System.out.println("\nWithdrawing cash via ATM");
		System.out.println("Enter the Card Number for verification");
		cardNumber = sc.next();
		System.out.println("Enter the Pin Number for verification");
		pinNumber = sc.nextInt();
		double cashWithdrwan = obj.withDrawMoney(cardNumber, pinNumber);
		if (cashWithdrwan == 0) {
			System.out.println("Unable to Process at this moment");
		} else {
			System.out.println("Withdrawl sucessfull for the amount of: " + cashWithdrwan);
		}
		
		// Final account balance
		System.out.println("Closing Balance for the day: " + obj.getbalance());
		sc.close();
	}

}
