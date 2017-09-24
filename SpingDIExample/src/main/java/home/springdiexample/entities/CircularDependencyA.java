package home.springdiexample.entities;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CircularDependencyA implements InitializingBean,ApplicationContextAware{

	private CircularDependencyB circularDependencyB;
	private static ApplicationContext applicationContext=null;
	
	public CircularDependencyA() {
		super();
		System.out.println("default constructor is called - CircularDependencyA");
	}

	public CircularDependencyA(CircularDependencyB circularDependencyB) {
		super();
		this.circularDependencyB = circularDependencyB;
	}

	public CircularDependencyB getCircularDependencyB() {
		return circularDependencyB;
	}

	public void setCircularDependencyB(CircularDependencyB circularDependencyB) {
		this.circularDependencyB = circularDependencyB;
	}

//	@PostConstruct
	public void loadCircularDependencyB(){
		System.out.println("loadCircularDependencyB");
		circularDependencyB.setCircularDependencyA(this);
	}
	
	@Override
	public String toString() {
		return "CircularDependencyA [circularDependencyB=" + circularDependencyB + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("CircularDependencyA.afterPropertiesSet() - start");
		circularDependencyB = applicationContext.getBean("circularDependencyB",CircularDependencyB.class);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		applicationContext = arg0;
	}
	
}
