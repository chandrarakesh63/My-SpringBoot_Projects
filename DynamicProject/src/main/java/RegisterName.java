import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RegisterName {
	
	private String dnUrl= "jdbc:mysql://localhost:3306/motivity_labs";
	private String dbUname="root";
	private String dbPassword = "12345";
	private String dbDriver ="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con=null;
		try {
			con=DriverManager.getConnection(dnUrl,dbUname,dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public String insert (RegisterName registration)
	{
		loadDriver(dbDriver);
		
		return null;
	}
}
