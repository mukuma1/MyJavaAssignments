package debitCreditCardOperationsUsingConstructor;

import java.util.Scanner;

public class visaDebitMainClass {
	public static void main(String[] args) {
		
		//Task: Performing three operations; Utility Bill Payment , cash deposit & cash withdrwal & printing the closing balance
		
		Scanner sc = new Scanner(System.in);
		boolean isBillPaymentActivated = false;
		VisaDebit obj = new VisaDebit("4111111111111111", 1234, 1000.50);//Creating object & initializing variables
		
		// Making BillPayment for utility
		System.out.println("MAKING BILL PAYMENT FOR UTILITY");
		System.out.println("Enter name of the Institution");
		if (sc.next().equals("Reliance")) {
			isBillPaymentActivated = true;
		}
		System.out.println(obj.billPayment(isBillPaymentActivated));
		System.out.println("Available Balance: " + obj.getbalance());

		// Depositing cash via ATM
		System.out.println("\nDEPOSITING CASH VIA ATM");
		System.out.println("Enter the Card Number for verification");
		String cardNumber = sc.next();
		System.out.println("Enter the Pin Number for verification");
		int pinNumber = sc.nextInt();
		System.out.println(obj.depositMoney(cardNumber, pinNumber));
		System.out.println("Availabe Balance: " + obj.getbalance());

		// Withdrawing cash via ATM
		System.out.println("\nWITHDRAWING CASH VIA ATM");
		System.out.println("Enter the Card Number for verification");
		cardNumber = sc.next();
		System.out.println("Enter the Pin Number for verification");
		pinNumber = sc.nextInt();
		System.out.println(obj.withDrawMoney(cardNumber, pinNumber));
		
		// Final account balance
		System.out.println("Closing Balance for the day: " + obj.getbalance());
		sc.close();
	}

}