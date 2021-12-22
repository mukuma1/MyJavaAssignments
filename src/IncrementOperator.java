
public class IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		x = x++ + ++x + x++ + ++x + ++x;

		boolean reminder = (x % 2) == 0;
		if (reminder == true) {
			System.out.println("Value of 'x' is " + x + ", it's an even number");
		}

		if (reminder == false) {

			System.out.println("Value of 'x' is " + x + ", it's an odd number");
		}

	}

}
