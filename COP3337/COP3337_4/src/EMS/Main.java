package EMS;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static int emsId;
	private double deductions;
	private final ArrayList<Employee> employeeArr;
	
	public Main() {
		emsId++;
		deductions = 0;
		employeeArr = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employeeArr.add(employee);
	}
	
	public ArrayList<Employee> getEmployeeArr() {
		return employeeArr;
	}
	
	public double deduction(int absentDays, Employee employee) {
		double currentDeduction = (employee.getSalary() / 20) * absentDays;
		deductions += currentDeduction;
		return currentDeduction;
	}
	
	public int getEmsId() {
		return emsId;
	}
	
	public double getDeductions() {
		return deductions;
	}
	
	public static void main(String[] args) {
		Main test1 = new Main();
		
		Employee john = new Employee(1, "John", "HR", 3000, "Employee");
		test1.addEmployee(john);
		Manager alice = new Manager(2, "Alice", "Finance", 4000, "Manager");
		test1.addEmployee(alice);
		Clerk bob = new Clerk(3, "Bob", "Admin", 2500, "Clerk");
		test1.addEmployee(bob);
		
		System.out.println("-------------------------------");
		System.out.println("EMPLOYEE MANAGEMENT SYSTEM #" + test1.getEmsId());
		System.out.println("-------------------------------");
		System.out.println("VIEW EMPLOYEES");
		System.out.println("-------------------------------");
		for (Employee employee : test1.getEmployeeArr()) {
			employee.display();
		}
		
		System.out.println("SALARIES WITH BONUSES:");
		System.out.println("-------------------------------");
		for (Employee employee : test1.getEmployeeArr()) {
//			System.out.printf("%s's salary with bonus: $%.2f\n", employee.getName(), employee.addBonus());
			System.out.printf("%s's salary with bonus: \t" + "$%.2f\n", employee.getName(), employee.addBonus());
		}
		
		System.out.println("-------------------------------");
		System.out.println("DEDUCTIONS:");
		System.out.println("-------------------------------");
		for (Employee employee : test1.getEmployeeArr()) {
			Random rnd = new Random();
			int randomAbsentVal = rnd.nextInt(7) + 1;
			double deducted = test1.deduction(randomAbsentVal, employee);
			System.out.printf("%s's days absent: " + ((employee.getName().length() < 4) ? "\t\t" : "\t") + "%d \tDeduction: $%.2f\n", employee.getName(), randomAbsentVal, deducted);
		}
		System.out.println("-------------------------------");
		System.out.printf("Total deductions: $%.2f\n", test1.getDeductions());
	}
}