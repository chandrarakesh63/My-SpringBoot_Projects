package StudentProgram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student extends HttpServlet{
	
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("Name");
		String collegeName=req.getParameter("College");
		String adress=req.getParameter("Adress");
		int id =Integer.parseInt(req.getParameter("Roll"));
		
		PrintWriter out=resp.getWriter();
		out.print("  The name of the person is  " +name+ "  College name of the student is "  +collegeName
				+    "   Your Adress is   "  +adress+  "  roll no of the person is  " +id);

}
}
