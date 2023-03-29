package CreationalDesignPattern;

public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		
		ManageTheWork mtw = new ManageTheWork();
		 FactoryInterface obj=mtw.getInstance("djdj");
		  obj.go();
		 
}
}
	
