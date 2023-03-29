package EvalutionPrograms;

public class FactoryMethod {
	
	public Shape getInstance(String str)
	{
		if (str.equalsIgnoreCase("traingle"))
			return new Traingle();
		else if (str.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		else
			return new Square();
	}

}
