package home.springdiexample.entities;

public class EmployeeDao {
	private String name;
	
	public EmployeeDao(){
		super();
		this.name = "Sapnil";
		System.out.println("empty constructor is called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeDao [name=" + name + "]";
	}

	
}
