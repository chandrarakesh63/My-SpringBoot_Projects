package EvalutionPrograms;

public class Main {
	
	
	public static void main(String[] args) {
		
		FactoryMethod fm=new FactoryMethod();
		Shape s= fm.getInstance("traingle");
		s.area();

	}

}
