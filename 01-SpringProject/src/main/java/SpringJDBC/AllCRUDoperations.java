package SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AllCRUDoperations {
	
	public void insert()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		  Studentdao studentdao = context.getBean("studentdao",Studentdao.class);
		  
		  Student1 s=new Student1();
		  s.setId(102);
		  s.setName("Rakesh");
		  int result = studentdao.insert(s);
		  System.out.println("Number of  query recorded:-"+result);
	}
	
	public void update()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		  Studentdao studentdao = context.getBean("studentdao", Studentdao.class); 
		  Student1 s1=new Student1();
		  s1.setId(102); s1.setName("Babul");
		  int result= studentdao.change(s1);
		  System.out.println("Number of  query updated:-"+result);
	}
	public void read()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Studentdao studentdao = context.getBean("studentdao", Studentdao.class);
		Student1 getsStudent = studentdao.getsStudent(102);
		System.out.println(getsStudent);
		
	}
	
	public static void main(String[] args) {
		
		AllCRUDoperations all= new AllCRUDoperations();
		all.insert();
		//all.update();
		//all.read();
		
		
		
	}

}
