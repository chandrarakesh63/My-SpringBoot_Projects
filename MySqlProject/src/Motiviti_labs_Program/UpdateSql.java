package Motiviti_labs_Program;

import java.sql.*;
import java.util.Scanner;

public class UpdateSql {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity_labs", "root", "12345");

			System.out.println("Enter id which you want to update ");
			int eid = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter employee name");
			String empname = sc.nextLine();
			System.out.println("enter employee mail id");
			String empmailID = sc.nextLine();
			System.out.println("Enter Employee Department");
			String Dept = sc.nextLine();

			String quary = "update employee set empname=?, empmailID=?, Dept=? where eid=" + eid;
			PreparedStatement state = con.prepareStatement(quary);

			state.setString(1, empname);
			state.setString(2, empmailID);
			state.setString(3, Dept);

			int h = state.executeUpdate();
			System.out.println(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
