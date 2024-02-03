package EMS;

public class Manager extends Employee {
	public Manager(int employeeId, String name, String department, double salary, String designation) {
		super(employeeId, name, department, salary, designation);
	}
	
	@Override
	public double addBonus() {
		return getSalary() + 300;
	}
}