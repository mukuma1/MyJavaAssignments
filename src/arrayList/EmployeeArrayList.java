package arrayList;

import java.util.ArrayList;

public class EmployeeArrayList {

	public static void main(String[] args) {
		Employee employeeMamatha = new Employee("Mamatha", "557236908");
		Employee employeeAnesh = new Employee("Anesh", "557237807");
		Employee employeeNeeru = new Employee("Neeru", "557456789");
		Employee employeeSoumya = new Employee("Soumya", "557012345");
		ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
		employeeArrayList.add(employeeMamatha);
		employeeArrayList.add(employeeAnesh);
		employeeArrayList.add(employeeNeeru);
		employeeArrayList.add(employeeSoumya);

//		for (int i = 0; i < employeeArrayList.size(); i++) {
//			System.out.println("\nName of Employee " + (i + 1) + ": " + employeeArrayList.get(i).getEmployeeName()
//					+ "\nEmployee ID: " + employeeArrayList.get(i).getEmployeeId());
//		}
		System.out.println("DETAILS OF EMPLOYEES");

		for (Employee i : employeeArrayList) {
			System.out.println("\nName of Employee " + (employeeArrayList.indexOf(i) + 1) + ": " + i.getEmployeeName()
					+ "\nEmployee ID: " + i.getEmployeeId());
		}

		employeeArrayList.remove(employeeArrayList.indexOf(employeeMamatha));

		System.out.println("\nDETAILS OF EMPLOYEES AFTER REMOVING EMPLOYEE MAMATHA");
		for (Employee i : employeeArrayList) {
			System.out.println("\nName of Employee " + (employeeArrayList.indexOf(i) + 1) + ": " + i.getEmployeeName()
					+ "\nEmployee ID: " + i.getEmployeeId());
		}

	}

}
