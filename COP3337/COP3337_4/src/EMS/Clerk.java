package EMS;

// Clerk extends Employee for inheritance
public class Clerk extends Employee {
	public Clerk(int employeeId, String name, String department, double salary, String designation) {
		// super constructor for inheriting Employee
		super(employeeId, name, department, salary, designation);
	}
	
	// Override addBonus to use polymorphism and change the original addBonus method in Employee
	@Override
	public double addBonus() {
		return getSalary() + 100;
	}
}