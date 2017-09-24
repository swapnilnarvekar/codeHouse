package home.springdiexample.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class EmployeeService {
	
	
	@Autowired(required=false)
	@Qualifier(value="employeeDao")
	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	@Required
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public String toString() {
		return "EmployeeService [employeeDao=" + employeeDao + "]";
	}
	
}
