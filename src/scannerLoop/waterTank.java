package scannerLoop;

import java.util.Scanner;

public class waterTank {

	public static void main(String[] args) {
		/*
		 * Assuming the current level of water tank as empty (0) or a whole number which is a
		 * multiple of 10
		 **/
		Scanner sc = new Scanner(System.in);
		int tank = 0;
		int bucket = 10;
		System.out.println("Enter the Current Level of Water in the Tank");
		tank = sc.nextInt();
		for (int i = 0; i <= 10; i++) {
			if (tank == 100) {
				System.out.println("Tank is Full. " + i + " Buckets of water was needed to fill the tank");
				break;
			}
			tank = tank + bucket;
		}
	}

}
