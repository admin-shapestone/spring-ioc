package com.shapestone.spring_ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SetterInjectionExample 
{
    public static void main( String[] args )
    {
        BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext.xml");  
          
        Student student=(Student)factory.getBean("setterBean");  
        student.displayInfo();  
        
        Student student1=(Student)factory.getBean("setterBean");  
        student1.displayInfo();  
    }
}
