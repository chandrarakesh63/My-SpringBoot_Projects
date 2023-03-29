package Organisarion;

import java.sql.Date;

public class JavaCoe implements Organisation{

	int empid; 
	String ename;
	int empsal; 
	Date empdob; 
	String evaluateddate;
	String onBoardeddate;
	String exisDate;
	String stream; 
	JavaCoe(int empid, String ename, int empsal, String evDate, String obdate, String exdate, String stream) { 
		this.empid = empid;
		this.ename = ename;
		this.empsal = empsal; 
		this.evaluateddate = evDate; 
		this.onBoardeddate = obdate; 
		this.exisDate = exdate;
		this.stream = stream; 
		} 
	@Override
	public String toString() {
		return "Javacoe [empid=" + empid + ", ename=" + ename + ", empsal=" + empsal + "" + ", evaluateddate=" + evaluateddate + ", onBoardeddate=" + onBoardeddate + ", exisDate=" + exisDate + ", stream=" + stream + "]"; 
		}
	@Override 
	public void writeProgram(String sname) { 
		if(sname.equalsIgnoreCase("java")) { 
			JavaCoe java =new JavaCoe(empid,ename,empsal,evaluateddate,onBoardeddate,exisDate,stream); 
			System.out.println(java); } }
}
