package methodPart2;

public class customerService {
	String name = "John";
	String email = "john@gmail.com";
	String address = "100 queen street";

	
	String updateName(String newName) {
		name = newName;
		return name;
	}

	String updateEmail(String newEmail) {
		email = newEmail;
		return email;
	}

	String updateAddress(String newAddress) {
		address = newAddress;
		return address;
	}

}
