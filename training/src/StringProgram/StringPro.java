package StringProgram;

public class StringPro {
	
	
	public static void main(String[] args) {
		

	String s="Rakesh";
	String s1="Rakesh";
	String s2="rakesh";
	String s3=new String("rakesh");
	
	
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	System.out.println(s==s3);
	System.out.println(s2==s3);
	System.out.println(s2.equals(s3));
	}
}
