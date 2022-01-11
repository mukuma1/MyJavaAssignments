package scannerLoop;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// Assuming input as a POSITIVE integer
		
		int inputNum = 0;
		int counter = 0;
		int reminder = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		inputNum = sc.nextInt();
		
		if (inputNum == 1) {
			System.out.println("1 is neither prime nor compount");// This condition can be omitted if the input>1
		}
		for (int i = 2; i <inputNum; i++) {
			reminder = inputNum % i;
			if (reminder == 0) {
				counter++;
				System.out.println("Entered integer is NOT a prime number");
				break;
			}
		}
		if (counter == 0 && inputNum != 1) {    //The condition inputNum!=1 can be eliminated if the input>1
			System.out.println("Entered interger is a PRIME number");
		}

	}

}
