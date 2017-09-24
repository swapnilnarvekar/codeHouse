package home.springdiexample.entities;

public class B {
	
	private String name;
	private C c ;
	
	public B(){
		System.out.println("Constructor of Bean B is called");
	}

	public B(C c) {
		super();
		this.c = c;
		System.out.println("Constructor of Bean B is called");
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "B [name=" + name + ", c=" + c + "]";
	}
	
	
}
