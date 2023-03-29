package motivityProgram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Employee extends HttpServlet{
	
	

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("Name");
		String adress=req.getParameter("Adress");
		String salary=req.getParameter("salary");
		int id =Integer.parseInt(req.getParameter("Roll"));
		
		PrintWriter out=resp.getWriter();
		out.print("The name of the Person is" +name+ "Employee NO of the person is " +id);
		
	}

}
