 package GroupedByPrograms;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.motivity.utility.HibernateUtils;

public class EmployeeTest {
	
	public void saveEmployee()
	{
		
		Session session =HibernateUtils.getSession();
		Employee e1=new Employee(23,"Rakesh","rakeshchandramo226@gmail.com");
		Employee e= new Employee(25,"Bikash","bikashranjanmo92@gmail.com");
		Employee e2=new Employee(26,"Abhilash","abhilashkhatua23@gmail.com");
		Employee e3 =new Employee(27,"Babul","babulkumar234@gmail.com");
		Transaction transaction = session.beginTransaction();
		session.save(e1);
		session.save(e);
		session.save(e3);
		session.save(e2);
		
		transaction.commit();
		session.close();
	}
	public void groupedByOperation()
	{
		Session session =HibernateUtils.getSession();
		Criteria criteria=session.createCriteria(Employee.class);
		Object value= criteria.setProjection(Projections.max("age")).uniqueResult();
		System.out.println("maximum age is " + value);
		
		Object value1=criteria.setProjection(Projections.min("age")).uniqueResult();
		System.out.println("minimum age is " + value1);
		
		Object value2=criteria.setProjection(Projections.avg("age")).uniqueResult();
		System.out.println("Avrage age is "+ value2);
	}
	
//	public void orderByOperation()
//	{
//		Session session =HibernateUtils.getSession();
//		Criteria crat =session.createCriteria(Employee.class);
//		List<Employee> empl = crat.add()
//
//	}
	
   public static void main(String[] args) {
		
	    EmployeeTest emp1=new EmployeeTest();
	    //emp1.saveEmployee();
	    emp1.groupedByOperation();
		
		
	}


}
