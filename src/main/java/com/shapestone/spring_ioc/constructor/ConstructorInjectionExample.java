package com.shapestone.spring_ioc.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConstructorInjectionExample {
	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext.xml");  
        
        Student student=(Student)factory.getBean("constructorBean");  
        student.displayInfo();  
	}

}
