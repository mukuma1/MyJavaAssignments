package constructorSmallPrograms;

public class Mortgage {
	double annualInterestrate;
	long mortgageAmount;

	public Mortgage(double annualInterestrate, long mortgageAmount) {
		super();
		this.annualInterestrate = annualInterestrate;
		this.mortgageAmount = mortgageAmount;
	}

	double monthlyInterestCalculation() {
		return annualInterestrate * 0.01 * mortgageAmount * 0.0833;
	}
}
