package banquetHall;

public class BanquetHall {

	int calculatebaseCost(int costofFood, int costofBeverage, int tip) {
		return costofFood + costofBeverage + tip;
	}
	// Assuming tax as 13%

	double calculateTax(int baseCost) {
		return 0.13 * baseCost;
	}

	double calculateCess(int numberOfGuest, int baseCost) {
		if (numberOfGuest <= 40) {
			return baseCost * 0.04;
		} else if (numberOfGuest <= 80) {
			return baseCost * 0.08;
		} else if (numberOfGuest <= 150) {
			return baseCost * 0.1;
		} else
			return baseCost * 0.125;
	}

	double totalCost(int baseCost, double tax, double cess) {
		return baseCost + tax + cess;
	}
}
