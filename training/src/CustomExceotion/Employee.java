package CustomExceotion;

public class Employee {
	
	private int empid;
	private String empname;
	private int empage;
	private String empdepartment;
	public Employee(int empid, String empname, int empage, String empdepartment) throws AgeNotWithinRangeException, NameNotValidException {
		
		if(empage <25 || empage >58) {
			throw new AgeNotWithinRangeException("Age not withinrange 25 to 58");
		}
		if (!empname.matches("employee"))
		{
			throw new NameNotValidException("Name contains numbers or special symbols ");
		}
		this.empid = empid;
		this.empname = empname;
		this.empage = empage;
		this.empdepartment = empdepartment;
	}
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empage);
		System.out.println(empdepartment);
	}
	public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException {
		Employee emp=new Employee(34,"rakesh",242,"java");
		emp.display();
		
		
	}
	
	

}
