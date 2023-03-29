package OneToOneProject;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.utility.HibernateUtils;

public class OneToOneMain {
	
	public static void main(String[] args) {
		
		Costumet costumet =new Costumet();

		costumet.setMobileNo(6370206);
		costumet.setcName("Rikku");
		
		Session session =HibernateUtils.getSession();
		session.save(costumet);
		
		Wallet wallet =new Wallet();
		wallet.setAmount(5000);
		wallet.setwId(12);
		wallet.setCostumet(costumet);
		session.save(wallet);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		
		
	}

}
