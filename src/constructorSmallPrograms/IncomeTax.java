package constructorSmallPrograms;

public class IncomeTax {
	/*
	 * Assuming income tax is calculated as 15% of the annual income for all slabs
	 * of income
	 */
	int annualIncome;
	

	public IncomeTax(int annualIncome) {
		super();
		this.annualIncome = annualIncome;
	}


	double taxCalculataion() {
		return 0.15 * annualIncome;
	}

}
