package HibernateProject.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.motivity.model.Student;
import com.motivity.test.StudentTest;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        StudentTest studentTest =new StudentTest();
         // studentTest.saveStudent();
       //  studentTest.updateStudent();
         //studentTest.deleteStudent();
          
        //  studentTest.readStudent();
       // studentTest.readStudent();
        studentTest.getAAll();
    }
}
