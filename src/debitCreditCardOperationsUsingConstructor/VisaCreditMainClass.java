package debitCreditCardOperationsUsingConstructor;

import java.util.Scanner;

public class VisaCreditMainClass {

	public static void main(String[] args) {
		/*
		 * Task: Performing three operations; Utility Bill Payment, cash deposit & cash
		 * withdrwal & printing the statement balance & available credit for the day
		 */
		Scanner sc = new Scanner(System.in);
		boolean isBillPaymentActivated = false;
		VisaCredit obj = new VisaCredit("4111111111111111", 1234, 3500.50, 5000, 1000);// Creating object & initializing
																						// variables
		// Making BillPayment for utility
		System.out.println("Making BillPayment for utility");
		System.out.println("Enter name of the Institution");
		if (sc.next().equals("Enbridge")) {
			isBillPaymentActivated = true;
		}
		System.out.println(obj.billPayment(obj.getcardNumber(isBillPaymentActivated)));
		System.out.println("Available credit: " + obj.getcreditAvailable());

		// Making payment to credit card via ATM
		System.out.println("\nMaking payment to credit card via ATM");
		System.out.println("Enter the Card Number for verification");
		String cardNumber = sc.next();
		System.out.println("Enter the Pin Number for verification");
		int pinNumber = sc.nextInt();
		System.out.println(obj.depositMoney(cardNumber, pinNumber));
		System.out.println("Available Credit: " + obj.getcreditAvailable());

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

		// Statement balance for the day
		System.out.println("Statement Balance for the day: " + obj.getbalance() + "\nAvailable Credit: "
				+ obj.getcreditAvailable());
		sc.close();
	}

}
