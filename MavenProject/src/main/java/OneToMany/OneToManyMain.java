package OneToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.utility.HibernateUtils;

import OneToOneProject.Costumet;

public class OneToManyMain {
	public static void main(String[] args) {
		
	Session session=HibernateUtils.getSession();
	Costumet c= new Costumet();
	c.setcId(14);
	c.setcName("Bikash");
	c.setMobileNo(456411623);
	
	
	Orders o= new Orders();
	o.setOrderAmount(2000);
	o.setOrderId(15);
	o.setOrderTracking(416163);
	//o.se
	
	Orders o1= new Orders();
	o.setOrderAmount(5626);
	o.setOrderId(16);
	o.setOrderTracking(2113);
	
	session.save(o);
	session.save(o1);
	
	
	Transaction transaction =session.beginTransaction();
	transaction.commit();
	
	
	}	

}
