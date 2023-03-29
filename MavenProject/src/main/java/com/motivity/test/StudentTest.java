package com.motivity.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.model.Student;
import com.motivity.utility.HibernateUtils;

public class StudentTest {
	
	public void saveStudent()
	{
		Student student =new Student(6,35,"Bikash");
		Session session =HibernateUtils.getSession();
		Transaction trans =session.beginTransaction();
		session.save(student);
		trans.commit();
		session.close();
	}
	public void updateStudent()
	{
		Student student=new Student(5,19,"Bikash");
		Session session = HibernateUtils.getSession();
		Transaction tra= session.beginTransaction();
      	session.update(student);
		tra.commit();
	    session.close();
   }
	public void deleteStudent()
	{
		Student student =new Student();
		student.setSid(2);
		Session session = HibernateUtils.getSession();
		Transaction tra =session.beginTransaction();
		session.delete(student);
		tra.commit();
		session.close();
	}
	public void readStudent()
	{
		Student student =new Student();
		Session session = HibernateUtils.getSession();
		Transaction tra =session.beginTransaction();
		student = (Student)session.get(Student.class,3);
		tra.commit();
		System.out.println(student);
	}
	public void getAAll() {
		 Session session=HibernateUtils.getSession();
		     Query query= session.createQuery("from Student");
		       List<Student> list=  query.list();
		       
		       for (Student data : list) {
				System.out.println(data);
			}
	}                       	
}
