package methodPart2;

public class Employee {
	String firstName= "";
	String lastName="";
	double hourlyRate= 0;
	double weeklySalary=0;
	
	String getFirstName() {
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	double getHourlyRate() {
		return hourlyRate;
	}
	
	void setFirstName(String newFirstName) {
		firstName= newFirstName;
	}
	
	void setLastName(String newLastName) {
		lastName= newLastName;
	}
	void setHourlyRate (double newHourlyRate) {
		hourlyRate=newHourlyRate;
	}
	double getweeklySalary (double hoursWorked) {
		weeklySalary=hourlyRate*hoursWorked;
		return weeklySalary;
	}

}
