package EMS;

public class Employee {
	// member values
	private int employeeId;
	private String name;
	private String department;
	private double salary;
	private String designation;
	
	// Employee constructor
	public Employee(int employeeId, String name, String department, double salary, String designation) {
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.designation = designation;
	}
	
	// Employee getter and setters
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	// return if the Employee instance designation equals the parameter, to allow for comparison
	public boolean equals(String designation) {
		return this.designation.equals(designation);
	}
	
	// returns the salary value of Employee + 200 to get the salary with bonus value
	public double addBonus() {
		return getSalary() + 200;
	}
	
	// Employee display method, utilizes getter methods to print values
	public void display() {
		System.out.printf("Employee ID: \t%s\n", getEmployeeId());
		System.out.printf("Name: \t\t\t%s\n", getName());
		System.out.printf("Department: \t%s\n", getDepartment());
		System.out.printf("Salary: \t\t$%.2f\n", getSalary());
		System.out.printf("Designation: \t%s\n", getDesignation());
		System.out.println("-------------------------------");
	}
}