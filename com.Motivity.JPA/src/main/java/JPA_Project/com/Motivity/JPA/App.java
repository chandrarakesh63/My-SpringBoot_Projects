package JPA_Project.com.Motivity.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{

	public void findEntity() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Test");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	 Employee employee = em.find(Employee.class, 1);
         System.out.println("student id :: " + employee.geteId());
         System.out.println("student firstname :: " + employee.getEmail());
         System.out.println("student lastname :: " + employee.geteName());
    	
    	em.getTransaction().commit();
        
    }
	
	public void insert()
	{
		Employee e1=new Employee();
//    	e1.seteId(1);
//    	e1.seteName("Bikash");
//    	e1.setEmail("bikash@1234gmail.com");
//    	
//    	Employee e2= new Employee();
//    	e2.seteName("Babul");
//    	e2.setEmail("babulkumar23@gmail.com");
//    	
//    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Test");
//    	EntityManager em=emf.createEntityManager();
//    	em.getTransaction().begin();
//    	em.persist(e1);
//    	em.persist(e2);
//    	em.getTransaction().commit();
		
	}
	
	
	public void update()
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Test");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	 Employee employee = em.find(Employee.class, 1);
         System.out.println("student id :: " + employee.geteId());
         System.out.println("student firstname :: " + employee.getEmail());
         System.out.println("student lastname :: " + employee.geteName());
    	
         employee.seteName("Babu");
         employee.setEmail("babu1234@gmail.com"); 
    	em.getTransaction().commit();
        
	}
	
	
	public void delete()
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Test");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	 Employee employee = em.find(Employee.class, 1);
         System.out.println("student id :: " + employee.geteId());
         System.out.println("student firstname :: " + employee.getEmail());
         System.out.println("student lastname :: " + employee.geteName());
    	em.remove(employee);
    	em.getTransaction().commit();
        
	}
		
	
    public static void main( String[] args )
    {
    	
    	App app= new App();
    	
    	//app.insert();
    	//app.findEntity();
    	//app.update();
    	app.delete();
    	
    }
}
