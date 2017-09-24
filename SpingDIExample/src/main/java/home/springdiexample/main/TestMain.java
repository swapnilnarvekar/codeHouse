package home.springdiexample.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import home.springdiexample.entities.Employee;

public class TestMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext  applicationContext = new ClassPathXmlApplicationContext("classpath:config.xml");
//		applicationContext.start();
		/*A beanA = applicationContext.getBean("beanA", A.class);
		System.out.println("Bean A : " + beanA);*/
		System.out.println("===========================");
		
		/*CircularDependencyB employeeService = applicationContext.getBean("circularDependencyB",CircularDependencyB.class);
		System.out.println("EmployeeService : " + employeeService);*/
		
		
		/*Textbook textbook = applicationContext.getBean("beanTextBook1",Textbook.class);
		System.out.println(" " + textbook.getName().toString());*/
		
		Employee employee = applicationContext.getBean("employeeWithEmployeeNumber",Employee.class);
		System.out.println("Employee : " + employee);
		
		
		
		
	}

}
