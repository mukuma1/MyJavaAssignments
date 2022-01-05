
public class IfElseQ2 {

	public static void main(String[] args) {
		// Checking licence eligiblity based on current age & existing level of license
		int age = 50;
		String license = "G1";
		
		if (age >= 16) {
			if (license == "") {
				System.out.println("Eligible to apply for learner's license G1");
			} else if (age == 16 & license == "G1") {
				System.out.println(
						"Not Eligible for upgrade. Minimum age requirement for next level (G2) application is 17 yrs");
			} else if (age >= 17 & license == "G1") {
				System.out.println("Eligible to apply for next level G2");
			} else if (age == 17 & license == "G2") {
				System.out.println(
						"Not Eligible for upgrade. Minimum age requirement for next level (G) application is 18 yrs");
			} else if (age >= 18 & license == "G2")
				System.out.println("Eligible to apply for next level G");
			else if (license == "G") {
				System.out.println("Full license holder. No upgrade available. Licence valid until expiry.");
			}
		} else
			System.out.println("Not eligible, as minimum age requirement for learner's license G1 is 16yrs");

	}

}
