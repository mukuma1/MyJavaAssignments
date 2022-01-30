package atmMoneyDepositUsingMethod;

import java.util.Scanner;

public class BankOperationMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankOperations bankOperationsobj = new BankOperations();
		System.out.println("Please Enter Card Number & Pin Number");
		boolean isLoginCredentialMatching = bankOperationsobj.cardVerification(sc.next(), sc.nextInt());
		
		if (isLoginCredentialMatching) {
			System.out.println("Please Enter The Deposit Amount");
			System.out.println("Amount deposited Sucessfully, New balance is "+bankOperationsobj.depositMoney(sc.nextInt()));
		}else
			System.out.println("Invalid credentials. Entered pin number or card number is incorrect");

	}

}
