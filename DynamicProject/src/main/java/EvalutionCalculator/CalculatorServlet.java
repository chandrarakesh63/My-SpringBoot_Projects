package EvalutionCalculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EvalutionPrograms.Main;


public class CalculatorServlet extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
		int num1 =Integer.parseInt(req.getParameter("num1"));
		int num2 =Integer.parseInt(req.getParameter("num2"));
		
		int k=num1+num2;
		
		PrintWriter out=resp.getWriter();
		out.print("Sum of two number is "  +k);
	
	
	}
	
	

}
