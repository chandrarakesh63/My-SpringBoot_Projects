package ManyToMany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.utility.HibernateUtils;

import OneToOneProject.Costumet;

public class ManyToManyMain {
	
	public static void main(String[] args) {
		
		Session session=HibernateUtils.getSession();
		
		Costumet c= new Costumet();
		c.setcId(22);
		c.setcName("Rakesh");
		c.setMobileNo(5616111);
		
		Costumet c1= new Costumet();
		c.setcId(21);
		c.setcName("Bikash");
		c.setMobileNo(5142612);
		
		Costumet c2= new Costumet();
		c.setcId(25);
		c.setcName("Babul");
		c.setMobileNo(5115126);
//		c.setOrders();
		
		List<Costumet> list=Arrays.asList(c,c1,c2);
		for (Costumet resp : list) {
			session.save(resp);
		}
		
		Items i= new Items();
		i.setBrand("Apple");
		i.setiId(12);
		
		Items i1= new Items();
		i.setBrand("Oppo");
		i.setiId(13);
		
		Items i2= new Items();
		i2.setBrand("OnePlus");
		i2.setiId(14);
		
		List<Items> listofitem=Arrays.asList(i,i1,i2);
		for (Items responce : listofitem) {
			session.save(responce);
			
			Transaction transaction=session.beginTransaction();
			transaction.commit();
		}
	}

}
