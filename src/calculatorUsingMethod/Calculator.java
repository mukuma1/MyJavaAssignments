package calculatorUsingMethod;

public class Calculator {
	double result = 0;
	double num1 = 0;
	String operation = "";

	double firstNumber(double num1) {
		result = num1;
		return result;
	}

	String Operation(String operat) {
		operation = operat;
		return operation;
	}

	double calculation(double num2) {

		switch (operation) {
		case "+":
			result = result + num2;
			break;
		case "-":
			result = result - num2;
			break;
		case "*":
			result=result*num2;
			break;
		case "%":
			result=result%num2;
			break;
		case "/":
			result=result/num2;
			break;
		default:
			System.out.println("Please select a valid Operation. The first number entered or the result of previous operation is:");
			break;

		}
		return result;
	}

}
