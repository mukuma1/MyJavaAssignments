package stringInbuildMethods;

public class Extract {

	public static void main(String[] args) {
		String str = "100 queens street, Toronto, M5V 3E3";
		String streetAddress = str.substring(str.indexOf("100"), str.lastIndexOf(", Tor"));
		System.out.println("Street Address: " + streetAddress);
		String city = str.substring(str.indexOf("Tor"), str.lastIndexOf(", M5"));
		System.out.println("City: " + city);
		String zip = str.substring(str.indexOf("M5"));
		System.out.println("Zip: " + zip);

	}

}
