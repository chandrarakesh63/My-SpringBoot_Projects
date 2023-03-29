package DynamicPractice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PracticeProgram extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("Name");
		String adress =req.getParameter("adress");
		String mail =req.getParameter("mail");
		int houseNo= Integer.parseInt(req.getParameter("HouseNo"));  
		
		PrintWriter out=resp.getWriter();
		out.print("Name of the person is "  + name );
		out.print( "Adress of the person is "  + adress);
		out.print("Mail of the person is "  + mail);
		out.print("  House No of the person is " +houseNo);
		
	}

}
