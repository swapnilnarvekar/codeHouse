package home.springdiexample.entities;

public class Employee {

	private int employeeNumber;
	private int aadharNumber;
	
	private Employee(){}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public static Employee getEmployeeWithEmployeeNumber(){
		Employee employee = new Employee();
		employee.setEmployeeNumber(100);
		return employee;
	}

	public static Employee getEmployeeWithAadharNumber(){
		Employee employee = new Employee();
		employee.setAadharNumber(2);
		return employee;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", aadharNumber=" + aadharNumber + "]";
	}
	
}
