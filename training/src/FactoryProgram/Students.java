package FactoryProgram;

public class Students implements College{

	public void department()
	{
        String studentName="Rakesh";
		String departmentOf="B S C";
		int rollNo=063;
		int batchYear=2020;
		System.out.println("name of the student is "+studentName);
		System.out.println("Department of the student is "+departmentOf);
		System.out.println("Roll Number is "+rollNo);
		System.out.println("Batch is "+batchYear);
		
	}
}
