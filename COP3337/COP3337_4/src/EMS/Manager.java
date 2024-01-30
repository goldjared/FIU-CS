package EMS;

public class Manager extends Employee {
	public Manager(int employeeId, String name, String department, int salary, String designation) {
		super(employeeId, name, department, salary, designation);
	}
	
	@Override
	public void addBonus() {
		setSalary(getSalary() + 300);
	}
}