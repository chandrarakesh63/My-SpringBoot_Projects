package com.SpringConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringConstructor/Constructor.xml");
		
		ConstroctorOverloading constr= (ConstroctorOverloading) context.getBean("const");
		
		System.out.println(constr);
		constr.doSum();
		
	}

}
