package scannerLoop;

import java.util.Scanner;

public class waterTank {

	public static void main(String[] args) {
		/*
		 * Assuming the current level of water tank as empty (0) or a whole number which
		 * is a multiple of 10
		 **/
		Scanner sc = new Scanner(System.in);
		int tank = 0;
		int bucket = 10;
		int counter = 0;
		System.out.println("Enter the Current Level of Water in the Tank");
		tank = sc.nextInt();
		do {
			if (tank == 100) {
				System.out.println("Tank is Full. " + counter + " Buckets of water was needed to fill the tank");
				break;
			}
			tank = tank + bucket;
			counter++;
		} while (counter <= 10);
	}

}
