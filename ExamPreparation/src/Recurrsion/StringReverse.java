package Recurrsion;

public class StringReverse {
	
	public static String strRev(String str, int num, String rev)
	{
		if(num<0) {
			return rev;
		}
		else {
			
			return str.charAt(num)+strRev(str, num-1, rev);
		}
	}

	public static void main(String[] args) {
		String s="Rakesh Mohanty";
		System.out.println(strRev(s, s.length()-1, " "));
	}
}
