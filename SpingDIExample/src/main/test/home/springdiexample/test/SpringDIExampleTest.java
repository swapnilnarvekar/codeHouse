package home.springdiexample.test;

import org.springframework.beans.propertyeditors.ResourceBundleEditor;
import org.springframework.context.MessageSource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

import home.springdiexample.entities.CircularDependencyA;
import home.springdiexample.entities.CircularDependencyB;
import home.springdiexample.entities.Textbook;

public class SpringDIExampleTest {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		
//		testConstructorWithOneArgument(applicationContext);
		
//		testConstructorWithTwoArgument(applicationContext);
		
//		testConstructorWithTwoArgumentAndDifferentDataTypes(applicationContext);
		
//		testConstructorWithThreeArgumentAndDifferentDataTypes(applicationContext);
		
//		testCircularDependency(applicationContext);
		
//		testResourceBundleMessageSource(applicationContext);
		
		testMakeApplicationCotextRefresh(applicationContext);
		
		applicationContext.registerShutdownHook();
	}

	private static void testMakeApplicationCotextRefresh(AbstractApplicationContext applicationContext) {
		System.out.println("testMakeApplicationCotextRefresh - begin");
		
		Textbook textbook = applicationContext.getBean("bookWithOneArgument", Textbook.class);
		System.out.println("--- textbook - 1st : " + textbook + " | hashcode : "+textbook.hashCode());
		
		textbook.setLines(2017);
		textbook = applicationContext.getBean("bookWithOneArgument", Textbook.class);
		System.out.println("--- textbook - 2nd : " + textbook + " | hashcode : "+textbook.hashCode());
		
		applicationContext.refresh();
		
		textbook = applicationContext.getBean("bookWithOneArgument", Textbook.class);
		System.out.println("--- textbook - 3rd : " + textbook + " | hashcode : "+textbook.hashCode());
		
		
		System.out.println("testMakeApplicationCotextRefresh - end");
	}

	private static void testResourceBundleMessageSource(AbstractApplicationContext applicationContext) {
		System.out.println("testResourceBundleMessageSource - start");
		MessageSource messageSource = applicationContext.getBean("messageSource",ResourceBundleMessageSource.class);
		System.out.println("000 " + messageSource.getMessage("hello.good.morning", null, null));
		System.out.println("testResourceBundleMessageSource - end");
	}

	private static void testCircularDependency(AbstractApplicationContext applicationContext) {
		System.out.println("testCircularDependency - start");
		
		CircularDependencyA circularDependencyA = applicationContext.getBean("circularDependencyA" , CircularDependencyA.class);
		
		CircularDependencyB circularDependencyB = applicationContext.getBean("circularDependencyB" , CircularDependencyB.class);
		
		System.out.println("testCircularDependency - end");
	}

	private static void testConstructorWithThreeArgumentAndDifferentDataTypes(
			AbstractApplicationContext applicationContext) {
		System.out.println("testConstructorWithThreeArgumentAndDifferentDataTypes - start");
		
		Textbook textbook = applicationContext.getBean("bookWithThreeArgumentsDifferentType", Textbook.class);
		System.out.println("textBook : " + textbook);
		
		System.out.println("testConstructorWithThreeArgumentAndDifferentDataTypes - end");
	}
	
	private static void testConstructorWithTwoArgumentAndDifferentDataTypes(
			AbstractApplicationContext applicationContext) {
		System.out.println("testConstructorWithTwoArgumentAndDifferentDataTypes - start");
		
		Textbook textbook = applicationContext.getBean("bookWithTwoArgumentsDifferentType", Textbook.class);
		System.out.println("textBook : " + textbook);
		
		System.out.println("testConstructorWithTwoArgumentAndDifferentDataTypes - end");
	}

	/**
	 * Constructor with two arguments having same data type
	 * 
	 * @param applicationContext
	 */
	private static void testConstructorWithTwoArgument(AbstractApplicationContext applicationContext) {
		System.out.println("\ntestConstructorWithTwoArgument-start");
		
		Textbook textbook = applicationContext.getBean("bookWithTwoArguments", Textbook.class);
		System.out.println("textBook : " + textbook);
		
		System.out.println("testConstructorWithTwoArgument-end");
	}

	private static void testConstructorWithOneArgument(AbstractApplicationContext applicationContext) {
		System.out.println("\n\ntestConstructorWithOneArgument-start");
		
		Textbook textbook = applicationContext.getBean("bookWithOneArgument", Textbook.class);
		System.out.println("textBook : " + textbook);
		
		System.out.println("testConstructorWithOneArgument-end");
	}

}
