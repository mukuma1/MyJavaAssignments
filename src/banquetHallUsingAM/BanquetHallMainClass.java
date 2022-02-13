package banquetHallUsingAM;

import java.util.Scanner;

public class BanquetHallMainClass {

	public static void main(String[] args) {
		BanquetHall obj = new BanquetHall();
		Scanner sc = new Scanner(System.in);

		System.out.println("Plese Enter the cost of food");
		int costOfFood = sc.nextInt();

		System.out.println("Plese Enter the cost of beverages");
		int costOfBeverage = sc.nextInt();

		System.out.println("Plese Enter the tip amount");
		int tipAmount = sc.nextInt();

		int baseCost = obj.calculatebaseCost(costOfFood, costOfBeverage, tipAmount);

		System.out.println("Plese Enter the number of Guests");
		int noOfGuest = sc.nextInt();

		System.out.println("Total Bill: " + obj.totalCost(baseCost, noOfGuest));

	}

}
