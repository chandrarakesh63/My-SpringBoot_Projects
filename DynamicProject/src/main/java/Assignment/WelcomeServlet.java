package Assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw= response.getWriter();
        Connection c=ConnectionProvider.getConnection();
        Statement s;
        try {
            s = c.createStatement();
            ResultSet rs=s.executeQuery("select * from user");
            pw.print("<h1>welcome to RAKESH website<h1>");
            pw.println("<table border=1 width=50% height=50%>");  
            pw.println("<tr><th>Name</th><th>Email</th><th>Password</th><th>Phone</th><tr>");  
            while (rs.next()) 
            {  
                String n = rs.getString("name");  
                String nmm = rs.getString("phnumber"); 
                String nm = rs.getString("email");
                String nmn = rs.getString("password");  

                pw.println("<tr><td>" + n + "</td><td>" + nmm + "</td><td>" + nm + "</td><td>" + nmn + "</td></tr>");   
            }  
            pw.println("</table>");  
            pw.println("</html></body>");  
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}