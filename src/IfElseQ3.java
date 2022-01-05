
public class IfElseQ3 {

	public static void main(String[] args) {
		// Find the largest of three #
		int firstNumber, a;
		firstNumber = a = 150;
		
		int secondNumber, b;
		secondNumber = b = 150;
		
		int thirdNumber, c;
		thirdNumber = c = 150;
		
		// Nested if else statement
		if (a - b > 0) {
			if (a - c > 0) {
				System.out.println("The largest among three numbers is the first number = " + a);
			} else if (a - c == 0) {
				System.out.println(
						"The first number = third number = " + a + " , which is greater than the second number");
			} else {
				System.out.println("The largest among the three numbers is the third number = " + c);
			}
		} else if (a - b == 0) {
			if (a - c > 0) {
				System.out.println(
						"The first number = second number =  " + a + " , which is greater than the third number");
			} else {
				if (a - c == 0) {
					System.out.println("All the three Numbers are equal");
				} else {
					System.out.println("The largest among the three numbers is the third number = " + c);
				}
			}
		} else if (b - c > 0) {
			System.out.println("The largest among the three numbers is the second number = " + b);
		} else if (b - c == 0) {
			System.out.println("The Second number = third number = " + b + " , which is greater than the first number");
		} else
			System.out.println("The largest among the three numbers is the third number = " + c);

	}

}
