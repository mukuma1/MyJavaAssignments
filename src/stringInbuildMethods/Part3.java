package stringInbuildMethods;

public class Part3 {

	public static void main(String[] args) {
		String[] cityNames = { "Toronto", "Ottawa", "Brampton" };
		for (int i = 0; i < cityNames.length; i++) {
			if (cityNames[i].charAt(0) == 'T') {
				cityNames[i]="Mississauga";
			}
		}
		for (int i = 0; i < cityNames.length; i++) {
			System.out.println(cityNames[i]);
		}

	}

}
