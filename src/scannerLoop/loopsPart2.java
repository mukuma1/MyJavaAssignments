package scannerLoop;

import java.util.Scanner;

public class loopsPart2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userid = "";
		String password = "";
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter User Id");
			userid = sc.next();
			System.out.println("Enter Password");
			password = sc.next();
			if (userid.equals("pivotAdmin") && password.equals("Admin123")) {
				System.out.println("You are Logged in to the application");
				break;
			} else
				System.out.println("Incorrect Username or password. Try again");
			if (i == 3) {
				System.out.println("Account locked");
				break;
			}
		}
	}
}
