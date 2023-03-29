package CreationalDesignPattern;

public class SingleTon {
	
	public static void main(String[] args) {
		Single si=Single.getInstance();
	}
}
 class Single{
	 
	 static Single si=new Single();
	 private Single()
	 {
		 System.out.println("this is exicuted");
     }
	 public static Single getInstance()
	 {
		return si; 
	 }
	 }
