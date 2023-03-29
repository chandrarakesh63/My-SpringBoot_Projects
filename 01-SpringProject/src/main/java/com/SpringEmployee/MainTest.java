package com.SpringEmployee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringEmployee/confg.xml");
		
		Employee1 emp2= (Employee1) context.getBean("emp1");
		
		System.out.println(emp2);
		
		
	}

}
