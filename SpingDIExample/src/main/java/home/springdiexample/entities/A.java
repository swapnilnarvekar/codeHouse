package home.springdiexample.entities;

public class A {

	private B b1;
	
	public A() {
		super();
	}

	public A(B b1){
		System.out.println("Constructor of Bean A is called");
		System.out.println("Instance of B as : "+b1);
		this.b1=b1;
	}

	

	public B getB1() {
		return b1;
	}

	public void setB(B b1) {
		this.b1 = b1;
		System.out.println("setter of Bean B is called");
	}

	@Override
	public String toString() {
		return "A [b=" + b1 + "]";
	}
	
	
}
