package DuplicateProgram;

import java.util.HashMap;

public class Duplicate2 {
public static void main(String[] args) {
	String s="This is Rakesh";
	
	HashMap<Character,Integer> hi = new HashMap<>();
	
	for(int i=1;i<s.length();i++)
	{
		hi.put(s.charAt(i),hi.getOrDefault(s.charAt(i),0)+1);
	}
	System.out.println(hi);
}	


}
