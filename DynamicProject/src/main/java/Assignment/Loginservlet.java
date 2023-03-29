package Assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class Loginservlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection c = null;
        PrintWriter pw = response.getWriter();
        try {

            String email =request.getParameter("email");
            String password =request.getParameter("phnumber");

            c=ConnectionProvider.getConnection();
            PreparedStatement ps = c.prepareStatement("select * from user where email=? and password=?");

            ps.setString(1, email);
            ps.setString(2, password);


            ResultSet rs=ps.executeQuery();
            if(rs.next()) {
                RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
                rd.forward(request, response);
            }
            else {
                pw.print("Invalid Username and Password");
//                RequestDispatcher rd=request.getRequestDispatcher("index.html");
//                rd.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
