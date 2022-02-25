package stringInbuildMethods;

import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isCityNameFound = false;
		String[] cityNames = { "Toronto", "Ottawa", "Brampton" };
		System.out.println("Enter the name of the city to be searched");
		String search = sc.next();
		for (int i = 0; i < cityNames.length; i++) {
			if (cityNames[i].equalsIgnoreCase(search)) {
				isCityNameFound = true;
				break;
			}
		}
		if (isCityNameFound) {
			System.out.println("City name Found");
		} else
			System.out.println("City name NOT Found");
	}

}
