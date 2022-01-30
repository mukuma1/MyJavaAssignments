package atmMoneyDepositUsingMethod;

public class BankOperations {
	String storedCardNo = "4111111111111111";
	int storedPinNo = 1234;
	double accountBalance = 525.50;
	boolean isloginCredentialMatching = false;

	boolean cardVerification(String cardNo, int pinNo) {
		if (cardNo.equals(storedCardNo) && pinNo == storedPinNo) {
			return true;
		}
		return false;
	}

	double depositMoney(int depositAmount) {
		accountBalance = accountBalance + depositAmount;
		return accountBalance;

	}
}
