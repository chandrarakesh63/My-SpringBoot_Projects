package StringP;

public class StringClass {
	
	    public static void main(String[] args) {
	        String name1=new String("John");
	        String name2=new String("John");


	        System.out.println(name1==name2);

	        System.out.println(name1.equals(name2));
	        System.out.println("===================");

	        name2=name1;


	        System.out.println(name1==name2);

	        System.out.println(name1.equals(name2));
	    }

}
