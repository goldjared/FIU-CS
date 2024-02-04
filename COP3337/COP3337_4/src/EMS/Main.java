package EMS;

// import arraylist util for Main employee arrlist, and util Random class for gen random num in test cases
import java.util.ArrayList;
import java.util.Random;

public class Main {
	// emsId static of the class, so no EMS instance will have the same ID.
	private static int emsId;
	private double deductions;
	// arrayList to store employees of a system
	private final ArrayList<Employee> employeeArr;
	
	public Main() {
		// increment static emsId
		emsId++;
		deductions = 0;
		// create arrayList
		employeeArr = new ArrayList<>();
	}
	
	// add an Employee object to the Employee arrlist. Manager and Clerk inherit from Employee so they can pass
	public void addEmployee(Employee employee) {
		employeeArr.add(employee);
	}
	
	// returns the arraylist of employees
	public ArrayList<Employee> getEmployeeArr() {
		return employeeArr;
	}
	
	// returns the deduction amount calculated via days absent and the employees salary data
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
		// 1. create instance of Main
		Main test1 = new Main();
		// 2. Create an Employee, Manager, and Clerk
		// add each Employee instance to Main Employee ArrList. Manager and Clerk can be added since they inherit from Employee
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
		// for each employee obj within the test1 instance employee ArrList, call the display method
		for (Employee employee : test1.getEmployeeArr()) {
			employee.display();
		}
		
		System.out.println("SALARIES WITH BONUSES:");
		System.out.println("-------------------------------");
		// for each employee obj within the test1 instance employee ArrList,
		// printf using the current employee getName and addBonus methods
		// since Manager and Clerk inherit from Employee, their addBonus methods override the Employee addBonus method
		// with polymorphism
		for (Employee employee : test1.getEmployeeArr()) {
			System.out.printf("%s's salary with bonus: \t" + "$%.2f\n", employee.getName(), employee.addBonus());
		}
		
		System.out.println("-------------------------------");
		System.out.println("DEDUCTIONS:");
		System.out.println("-------------------------------");
		
		// for each employee obj within the test1 instance employee ArrList
		for (Employee employee : test1.getEmployeeArr()) {
			// create Random val to generate a random int of days absent for each employee
			Random rnd = new Random();
			int randomAbsentVal = rnd.nextInt(7) + 1;
			// get deduction val from instance deduct method using rnd absentVal and employee instance
			double deducted = test1.deduction(randomAbsentVal, employee);
			System.out.printf("%s's days absent: " + ((employee.getName().length() < 4) ? "\t\t" : "\t") + "%d \tDeduction: $%.2f\n", employee.getName(), randomAbsentVal, deducted);
		}
		System.out.println("-------------------------------");
		// print total deduction val from test1 getter method
		System.out.printf("Total deductions: $%.2f\n", test1.getDeductions());
	}
}