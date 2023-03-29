package com.motivity.Log4J_Project;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class App
{

	private final static Logger log= LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		BasicConfigurator.configure();
	log.info("this is the Info massage");
	log.error("this is the error log");		
		

	}
}
