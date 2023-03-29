package EvalutionJdbcSql;

import java.sql.Connection;
import java.sql.DriverManager;

import Assignment.Databasedetails;

public class ConnectionProvider {
	private ConnectionProvider() {

	}
	public static Connection getConnection() {
	    Connection con=null;
	    try {
	        Class.forName(Databasedetails.DATABASE_DRIVER);
	        con = DriverManager.getConnection(Databasedetails.DATABASE_URL,Databasedetails.DATABASE_USER,Databasedetails.DATABASE_PASS);


	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return con;
	}


}
