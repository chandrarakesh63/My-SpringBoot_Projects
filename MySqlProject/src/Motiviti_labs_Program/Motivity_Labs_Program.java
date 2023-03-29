package Motiviti_labs_Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Motivity_Labs_Program {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity_labs", "root", "12345");

		System.out.println("Enter employee name");
		String empname=sc.nextLine();
		System.out.println("enter employee mail id");
		String empmailID =sc.nextLine();
		System.out.println("Enter Employee Department");
		String Dept =sc.nextLine();
		
		String quary = "INSERT INTO employee(empname,empmailID,Dept) VALUES (?,?,?)";
		PreparedStatement state = con.prepareStatement(quary);
		
		state.setString(1, empname);
		state.setString(2, empmailID);
		state.setString(3, Dept);

		int h = state.executeUpdate();
		System.out.println(h);
	}
}
