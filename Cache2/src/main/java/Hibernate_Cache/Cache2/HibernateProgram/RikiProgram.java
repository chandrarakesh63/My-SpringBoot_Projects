package Hibernate_Cache.Cache2.HibernateProgram;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Hibernate_Cache.Cache2.Model.Riki;

public class RikiProgram {
	
public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("config.xml")
				.addAnnotatedClass(Riki.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			Riki riki=new Riki(2,"rakesh","rakesh@1234gmail.com","java");
		   session.beginTransaction();
		   
		   session.save(riki);
		   session.getTransaction().commit();
		   session.close();
			
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		finally {
			factory.close();
		}
}
}
