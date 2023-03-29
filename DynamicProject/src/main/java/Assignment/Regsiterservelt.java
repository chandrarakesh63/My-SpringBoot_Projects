package Assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class Regsiterservelt extends HttpServlet{
	
	 private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        Connection c = null;
	        PrintWriter pw = response.getWriter();
	        try {
	            String name =request.getParameter("name");
	            String email =request.getParameter("email");
	            String password =request.getParameter("password");
	            String phone =request.getParameter("phnumber");
	            c=ConnectionProvider.getConnection();
	            PreparedStatement ps = c.prepareStatement("insert into user values(?,?,?,?)");
	            ps.setString(1, name);
	            ps.setString(2, email);
	            ps.setString(3, password);
	            ps.setString(4, phone);

	            int i=ps.executeUpdate();
	            if(i>0) {
	                response.getWriter() .print("Register successfull");
	              //  RequestDispatcher rd=request.getRequestDispatcher("RegisterPage.html");
	              //  rd.forward(request, response);
	            }
	            else {
	               
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            pw.print("Regsiter fail");
	        }
	    }
	}
