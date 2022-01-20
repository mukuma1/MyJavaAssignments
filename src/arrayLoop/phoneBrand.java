package arrayLoop;

import java.util.Scanner;

public class phoneBrand {

	public static void main(String[] args) {
		int counter = 0;
		String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] google = { "GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" };
		String[] apple = { "iPhone12", "iPhone12Mini", "iPhone11", "iPhone11Mini" };
		System.out.println("Enter the brand name to view the list of available product");
		Scanner sc = new Scanner(System.in);
		String brand = sc.next();

		switch (brand) {

		case "Samsung":

			// Prompting Brand & displaying the array elements
			System.out.println("The available products under " + brand + " are");
			for (int i = 0; i < samsung.length; i++) {
				System.out.println(samsung[i]);
			}
			// Prompting Product & matching it will array elements
			System.out.println("Please select a product");
			String product = sc.next();
			for (int i = 0; i < samsung.length; i++) {
				if (product.equals(samsung[i])) {
					System.out.println("Product Selected is: " + samsung[i]);
					counter++;
					break;
				}
			}
			// Condition for error message
			if (counter == 0) {
				System.out.println("Invalid Product. Please select a product from the list");
			}
			break;

		case "Google":
			
			// Prompting Brand & displaying the array elements
			System.out.println("The available products under " + brand + " are");
			for (int i = 0; i < samsung.length; i++) {
				System.out.println(google[i]);
			}
			// Prompting Product & matching it will array elements
			System.out.println("Please select a product");
			product = sc.next();
			for (int i = 0; i < samsung.length; i++) {
				if (product.equals(google[i])) {
					System.out.println("Product Selected is: " + google[i]);
					counter++;
					break;
				}
			}
			// Condition for error message
			if (counter == 0) {
				System.out.println("Invalid Product. Please select a product from the list");
			}
			break;

		case "Apple":
			
			// Prompting Brand & displaying the array elements
			System.out.println("The available products under " + brand + " are");
			for (int i = 0; i < samsung.length; i++) {
				System.out.println(apple[i]);
			}
			// Prompting Product & matching it will array elements
			System.out.println("Please select a product");
			product = sc.next();
			for (int i = 0; i < samsung.length; i++) {
				if (product.equals(apple[i])) {
					System.out.println("Product Selected is: " + apple[i]);
					counter++;
					break;
				}
			}
			// Condition for error message
			if (counter == 0) {
				System.out.println("Invalid Product. Please select a product from the list");
			}
			break;

		default:
			System.out.println("Invalid Brand");
		}

	}

}
