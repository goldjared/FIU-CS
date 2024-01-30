package EMS;

public class Clerk extends Employee {
	public Clerk(int employeeId, String name, String department, int salary, String designation) {
		super(employeeId, name, department, salary, designation);
	}
	
	@Override
	public void addBonus() {
		setSalary(getSalary() + 100);
	}
}