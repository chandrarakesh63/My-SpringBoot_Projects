package com.Spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/ref/CollectionSpring.xml");
		A temp=(A) context.getBean("aref");
		System.out.println(temp.getOb());
		System.out.println(temp.getX());
	}

}
