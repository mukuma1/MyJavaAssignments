package methodPart2;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee ep = new Employee();
		System.out.println(
				"Details needed to calculate Weekly Salary: First Name, last Name, Hourly Salary Rate, No: of hours worked in a week");
		System.out.println("Enter First Name");
		// Input needed to set the values
		String firstName = sc.next();
		System.out.println("Enter Last Name");
		String lastName = sc.next();
		System.out.println("Enter Hourly Rate");
		double hourlyrate = sc.nextDouble();
		System.out.println("Enter No: of Hours Worked per week");
		double hoursWorked = sc.nextDouble();
		// updating the class variables with values of local variables
		ep.setFirstName(firstName);
		ep.setLastName(lastName);
		ep.setHourlyRate(hourlyrate);
		// calling method to view the updated result
		firstName = ep.getFirstName();
		lastName = ep.getLastName();
		hourlyrate = ep.getHourlyRate();
		// calling method for salary calculation
		double weeklySalary = ep.getweeklySalary(hoursWorked);
		System.out.println("Employee Details- Full Name: " + firstName + " " + lastName + ", Hourly Salary Rate in CAD: " + hourlyrate
				+ " , Weekly Salary in CAD: " + weeklySalary);

	}

}
