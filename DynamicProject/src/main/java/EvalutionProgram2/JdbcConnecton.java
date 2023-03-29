package EvalutionProgram2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnecton {
	
public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/MS_Access","root","12345");
		
		Statement stm=con.createStatement();
		
		String quary="insert into student(SRollNo,SName,Course,PhNumber) values(5,'bikash','testing','9583808450')";
		int h=stm.executeUpdate(quary);
		System.out.println(h);
}
}
