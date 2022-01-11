package scannerLoop;

import java.util.Scanner;

public class thermostat {

	public static void main(String[] args) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desired temperature in Celsius");
		temp = sc.nextInt();
		System.out.println("Temperature set to " + temp+ " degree Celsius");
	}

}
