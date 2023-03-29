package com.Spring.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_main {
	
	public static void main(String[] args) {
		
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/Spring/Constructor/Constructor-Bean-Conf.xml");
	
		 Employee emp= (Employee) context.getBean("employee");
	     System.out.println(emp);
	
	}

}
