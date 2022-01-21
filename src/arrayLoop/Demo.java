package arrayLoop;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		boolean isbrandvalid = true;
		boolean isProductFound = false;
		String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] google = { "GooglePixel 6", "GooglePixel 6 Pro", "GooglePixelPro", "GooglePixel 5" };
		String[] apple = { "iPhone12", "iPhone12 Mini", "iPhone11", "iPhone11 Mini" };
		System.out.println("Enter the brand name to view the list of available product");
		Scanner sc = new Scanner(System.in);
		String brand = sc.nextLine();

		switch (brand) {

		case "Samsung":

			// Prompting Brand & displaying the array elements
			System.out.println("The available products under " + brand + " are");
			for (int i = 0; i < samsung.length; i++) {
				System.out.println(samsung[i]);
			}
			// Prompting Product & matching it with array elements
			System.out.println("Please select a product");
			String product = sc.nextLine();
			for (int i = 0; i < samsung.length; i++) {
				if (product.equals(samsung[i])) {
					System.out.println("Product Selected is: " + samsung[i]);
					isProductFound = true;
					break;
				}
			}
			break;

		case "Google":

			// Prompting Brand & displaying the array elements
			System.out.println("The available products under " + brand + " are");
			for (int i = 0; i < google.length; i++) {
				System.out.println(google[i]);
			}
			// Prompting Product & matching it with array elements
			System.out.println("Please select a product");
			product = sc.nextLine();
			for (int i = 0; i < google.length; i++) {
				if (product.equals(google[i])) {
					System.out.println("Product Selected is: " + google[i]);
					isProductFound = true;
					break;
				}
			}
			break;

		case "Apple":

			// Prompting Brand & displaying the array elements
			System.out.println("The available products under " + brand + " are");
			for (int i = 0; i < apple.length; i++) {
				System.out.println(apple[i]);
			}
			// Prompting Product & matching it with array elements
			System.out.println("Please select a product");
			product = sc.nextLine();
			for (int i = 0; i < apple.length; i++) {
				if (product.equals(apple[i])) {
					System.out.println("Product Selected is: " + apple[i]);
					isProductFound = true;
					break;
				}
			}

			break;

		default:
			System.out.println("Invalid Brand");
			isbrandvalid = false;
		}
		// Condition for error message

		if (isbrandvalid && !isProductFound) {
			System.out.println("Invalid Product. Please select a product from the list");
		}

	}

}
