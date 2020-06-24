package com.sample.FirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        
    	/*ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	Person person = (Person) context.getBean("address");
    	System.out.println(person.toString());*/
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	
    	/*Address address = context.getBean(Address.class);
    	System.out.println(address.toString());*/
    	
    	Person person = context.getBean(Person.class);
    	System.out.println(person.toString());
    }
}
