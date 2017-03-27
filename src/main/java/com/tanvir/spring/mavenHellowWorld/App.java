package com.tanvir.spring.mavenHellowWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/tanvir/spring/mavenHellowWorld/beans/beans.xml");
    	Patient pt = (Patient)context.getBean("patient");
    	pt.setName("TEST");
        System.out.println( pt);
        
        Address address = (Address)context.getBean("address2");
        System.out.println(address);
        
        
        
        
        
        
        
        
        
        ((ClassPathXmlApplicationContext)context).close();
    }
}
