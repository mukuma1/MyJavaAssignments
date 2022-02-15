package debitCreditCardOperationsUsingConstructor;

import java.util.Scanner;

public class VisaCreditMainClass {

	public static void main(String[] args) {
		/*
		 * Task: Performing three operations; pre-authorized debit, Making credit card
		 * payment via ATM & cash withdrwal & printing the statement balance & available
		 * credit for the day
		 */
		Scanner sc = new Scanner(System.in);
		boolean isPreAuthorizedPaymentActivated = false;
		VisaCredit obj = new VisaCredit("4111111111111111", 1234, 3500.50, 5000, 1000);// Creating object & initializing
																						// variables
		// Debiting Pre-authorized payments
		System.out.println("DEBITING PRE-AUTHORIZED PAYMENTS");
		System.out.println("Enter name of the Institution");
		if (sc.next().equals("Enbridge")) {
			isPreAuthorizedPaymentActivated = true;
		}
		System.out.println(obj.preAuthorizedDebit(isPreAuthorizedPaymentActivated));
		System.out.println("Available credit: " + obj.getcreditAvailable());

		// Making payment to credit card via ATM
		System.out.println("\nMAKING PAYMENT TO CREDIT CARD VIA ATM");
		System.out.println("Enter the Card Number for verification");
		String cardNumber = sc.next();
		System.out.println("Enter the Pin Number for verification");
		int pinNumber = sc.nextInt();
		System.out.println(obj.depositMoney(cardNumber, pinNumber));
		System.out.println("Available Credit: " + obj.getcreditAvailable());

		// Withdrawing cash via ATM
		System.out.println("\nWITHDRAWING CASH VIA ATM");
		System.out.println("Enter the Card Number for verification");
		cardNumber = sc.next();
		System.out.println("Enter the Pin Number for verification");
		pinNumber = sc.nextInt();
		System.out.println(obj.withDrawMoney(cardNumber, pinNumber));

		// Statement balance for the day
		System.out.println("Statement Balance for the day: " + obj.getbalance() + "\nAvailable Credit: "
				+ obj.getcreditAvailable());
		sc.close();
	}

}