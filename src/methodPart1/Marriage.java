package methodPart1;

import java.util.Scanner;

public class Marriage {

	public static void main(String[] args) {
		Updation up = new Updation();// instantiation
		Scanner sc = new Scanner(System.in);

		System.out.println("Maiden name is " + up.maidenName);// calling variable using object
		System.out.println("Enter the married name");
		up.updateMaidenName(sc.nextLine());// updating variable
		String marriedName = up.getMaidenName();// calling method using object
		System.out.println("Maiden name has been changed to " + marriedName);

	}

}
