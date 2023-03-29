package Business_Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Business_Aop/Config.xml");
		
		BusinessAopProgram business= context.getBean("BusinessAopClass",BusinessAopProgram.class);
		business.LogicOne();
		System.out.println(" One ************************ ");
		business.LogicTwo();
		System.out.println(" Two ************************ ");
		business.LogicThree();
		System.out.println(" Three ************************ ");
		business.LogicFour();
		System.out.println(" Four ************************ ");
		business.LogicFive();
		
		context.close();
	}

}
