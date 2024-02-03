package EMS;

public class Clerk extends Employee {
	public Clerk(int employeeId, String name, String department, double salary, String designation) {
		super(employeeId, name, department, salary, designation);
	}
	
	@Override
	public double addBonus() {
		return getSalary() + 100;
	}
}