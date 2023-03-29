package CreationalDesignPattern;

public class ManageTheWork  {
	
	public  FactoryInterface getInstance(String str)
	{
		if (str.equals("Open"))
		return new Walking();
		
		else  
			return new Factory2();
		
		
		
		
	}

}
