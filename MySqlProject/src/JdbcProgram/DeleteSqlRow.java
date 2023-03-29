package JdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteSqlRow {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity_labs", "root", "12345");

			System.out.println("Enter id which you want to Delete ");
			int eid = sc.nextInt();
			sc.nextLine();

			String quary = "delete from employee where eid=" + eid;
			PreparedStatement state = con.prepareStatement(quary);

			int h = state.executeUpdate();
			System.out.println(h);
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
