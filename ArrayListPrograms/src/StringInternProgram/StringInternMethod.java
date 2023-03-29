package StringInternProgram;

public class StringInternMethod {
	
	public static void main(String[] args) {
		
		String str1="Java";
		String str2=new String("Java");
		String str3=str1.intern();
		String str4=str2.intern();
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		System.out.println(str2==str4);
		System.out.println(str1==str4);
		
	}

}
