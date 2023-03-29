package com.Spring.Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/Setter/Setter-Bean-Conf.xml");
		Employee1 emp=(Employee1) context.getBean("employee1");
		System.out.println(emp);
	}

}
