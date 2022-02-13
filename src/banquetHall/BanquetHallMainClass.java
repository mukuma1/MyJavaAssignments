package banquetHall;

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

		double tax = obj.calculateTax(baseCost);

		System.out.println("Plese Enter the number of guests");
		int noOfGuest = sc.nextInt();

		double cess = obj.calculateCess(noOfGuest, baseCost);
		
		System.out.println("Total Bill: " + obj.totalCost(baseCost, tax, cess));

	}

}
