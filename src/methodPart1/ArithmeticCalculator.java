package methodPart1;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		MathematicalOperations mp = new MathematicalOperations();// Instantiation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number, n1");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number, n2");
		int n2 = sc.nextInt();
		
		//Addition
		System.out.println("Sum of two numbers, n1+n2= " + mp.addition(n1, n2));//by calling method
		System.out.println("Sum= " + mp.result);//by calling variable
		
		//Substraction
		System.out.println("Difference of two numbers, n1-n2= " + mp.substraction(n1, n2));//by calling method
		System.out.println("Difference= " + mp.result);//by calling variable

	}

}
