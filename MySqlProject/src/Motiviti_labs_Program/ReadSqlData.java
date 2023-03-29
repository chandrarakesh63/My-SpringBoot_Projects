package Motiviti_labs_Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadSqlData {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity_labs", "root", "12345");

			String quary = "select * from employee";
			
			Statement stm=con.createStatement();
			ResultSet result =stm.executeQuery(quary);
			
			while(result.next()) {
				System.out.println(result.getInt(1) +  "   " + result.getString(2) +  "  " + result.getString(3) +  "  "  + result.getString(4));
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
