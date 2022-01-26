package methodPart2;

import java.util.Scanner;

public class ProfileUpdation {

	public static void main(String[] args) {
		customerService cs = new customerService();
		Scanner sc = new Scanner(System.in);
		// Accessing the class variable using object to view the initial values of variables
		System.out.println("Values before updation- Name: "+cs.name+" , Email: "+ cs.email+" , Address: " + cs.address);
		//updating the class variable by calling method
		System.out.println("Enter the new name");
		cs.updateName(sc.nextLine());
		System.out.println("Enter the new email");
		cs.updateEmail(sc.nextLine());
		System.out.println("Enter the new address");
		cs.updateAddress(sc.nextLine());
		//Accessing the class variable using object to view the updated values of variables
		System.out.println("Values after updation- Name: "+cs.name+" , Email: "+ cs.email+" , Address: " + cs.address);
	}

}
