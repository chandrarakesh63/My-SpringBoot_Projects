package com.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestColl {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Collection/CollectionSpring.xml");
		CollectionsPractic co=(CollectionsPractic) context.getBean("coll");
		
		System.out.println(co.getName());
		System.out.println(co.getPhones());
		System.out.println(co.getAddress());
		System.out.println(co.getCourse());
		
	}

}
