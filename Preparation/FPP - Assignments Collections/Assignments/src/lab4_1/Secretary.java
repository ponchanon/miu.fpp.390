package lab4_1;

public class Secretary extends DeptEmployee {
	private double overtimeHours;

	
	public Secretary(String name, double salary, int year, int month, int dayOfMonth, double overtimeHours) {
		super(name, salary, year, month, dayOfMonth);
		this.overtimeHours = overtimeHours;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary() {
		return salary + ( 12 * overtimeHours);
	}

	
	
}
