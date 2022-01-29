package calculatorUsingMethod;

import java.util.Scanner;

public class CalculatorMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calculatorobj = new Calculator();
		
		System.out.println("Enter The First Number");
		calculatorobj.firstNumber(sc.nextDouble());
		
		for (int i = 1; i < 100; i++) {
			System.out.println("Select the operation:\n" + " +, -, *, /, %");
			calculatorobj.Operation(sc.next());
			
			System.out.println("Enter the Next Number");
			System.out.println(calculatorobj.calculation(sc.nextDouble()));
			
			System.out.println("Do you want to continue: True/False");
			if (!sc.nextBoolean()) {
				break;
			}
		}
		System.out.println("Final Result= "+calculatorobj.result);

	}

}
