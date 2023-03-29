package SpringAnnotationProgram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("annotationCfg.xml");
		
		 AnnotationSpring annotationSpring=context.getBean("riku",AnnotationSpring.class);
		 System.out.println(annotationSpring.getMyName() + "  " + annotationSpring.getPhNo());
		
	}
}