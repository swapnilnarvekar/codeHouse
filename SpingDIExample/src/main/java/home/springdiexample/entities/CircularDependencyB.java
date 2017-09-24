package home.springdiexample.entities;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CircularDependencyB implements InitializingBean,ApplicationContextAware{

	private static ApplicationContext applicationContext = null;
	
	private CircularDependencyA circularDependencyA;
	
	public CircularDependencyB() {
		super();
		System.out.println("default constructor is called - CircularDependencyB");
	}

	public CircularDependencyB(CircularDependencyA circularDependencyA) {
		super();
		this.circularDependencyA = circularDependencyA;
	}

	public CircularDependencyA getCircularDependencyA() {
		return circularDependencyA;
	}

	public void setCircularDependencyA(CircularDependencyA circularDependencyA) {
		this.circularDependencyA = circularDependencyA;
	}

//	@PostConstruct
	public void loadCircularDependencyA(){
		System.out.println("loadCircularDependencyA");
		circularDependencyA.setCircularDependencyB(this);
	}
	
	@Override
	public String toString() {
		return "CircularDependencyB [circularDependencyA=" + circularDependencyA + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("CircularDependencyB.afterPropertiesSet() - start");		
		circularDependencyA = applicationContext.getBean("circularDependencyA", CircularDependencyA.class);
	
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		applicationContext = arg0;
	}
	
}
