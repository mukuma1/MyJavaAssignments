package banquetHallUsingAM;

public class BanquetHall {

	int calculatebaseCost(int costofFood, int costofBeverage, int tip) {
		return costofFood + costofBeverage + tip;
	}
	// Assuming tax as 13%
	//Calculate tax & cess are declared as private methods

	private double calculateTax(int baseCost) {
		return 0.13 * baseCost;
	}

	private double calculateCess(int numberOfGuest, int baseCost) {
		if (numberOfGuest <= 40) {
			return baseCost * 0.04;
		} else if (numberOfGuest <= 80) {
			return baseCost * 0.08;
		} else if (numberOfGuest <= 150) {
			return baseCost * 0.1;
		} else
			return baseCost * 0.125;
	}

	double totalCost(int baseCost, int numberOfGuest) {
		return baseCost + calculateTax(baseCost) + calculateCess(numberOfGuest, baseCost);
	}
}
