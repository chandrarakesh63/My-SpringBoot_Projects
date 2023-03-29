package EvalutionJdbcSql;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Assignment.ConnectionProvider;
@WebServlet("/RegisterServletprogram")
public class Regsiterservelt extends HttpServlet{
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection c = null;
        PrintWriter pw = response.getWriter();
        try {
            String registationNO =request.getParameter("RegistationNO");
            String userName =request.getParameter("UserName");
            String password =request.getParameter("password");
            String email =request.getParameter("email");
            c=ConnectionProvider.getConnection();
            PreparedStatement ps = c.prepareStatement("insert into user_registration values(?,?,?,?)");
            ps.setString(1, registationNO);
            ps.setString(2, userName);
            ps.setString(3, password);
            ps.setString(4, email);

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
