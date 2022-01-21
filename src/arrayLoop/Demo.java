package arrayLoop;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		boolean isfound = false;
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
			// Prompting Product & matching it with array elements
			System.out.println("Please select a product");
			String product = sc.next();
			for (int i = 0; i < samsung.length; i++) {
				if (product.equals(samsung[i])) {
					System.out.println("Product Selected is: " + samsung[i]);
					isfound = true;
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
			product = sc.next();
			for (int i = 0; i < google.length; i++) {
				if (product.equals(google[i])) {
					System.out.println("Product Selected is: " + google[i]);
					isfound = true;
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
			product = sc.next();
			for (int i = 0; i < apple.length; i++) {
				if (product.equals(apple[i])) {
					System.out.println("Product Selected is: " + apple[i]);
					isfound = true;
					break;
				}
			}

			break;

		default:
			System.out.println("Invalid Brand");
		}
		// Condition for error message
		if (!isfound) {
			System.out.println("Invalid Product. Please select a product from the list");
		}

	}

}
