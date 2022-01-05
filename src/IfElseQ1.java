
public class IfElseQ1 {

	public static void main(String[] args) {
		// print grade based on percentage scored

		int percentageScored, p;
		percentageScored = p = 78;

		if (0 <= p & p < 50) {
			System.out.println("Percentage Scored =" + p + ", D grade");
		} else if (50 <= p & p < 60) {
			System.out.println("Percentage Scored =" + p + ", C grade");
		} else if (60 <= p & p < 75) {
			System.out.println("Percentage Scored =" + p + ", B grade");
		} else
			System.out.println("Percentage Scored =" + p + ", A grade");

	}

}
