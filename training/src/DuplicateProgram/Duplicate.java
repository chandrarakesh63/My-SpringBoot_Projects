package DuplicateProgram;

import java.util.HashMap;

public class Duplicate {
	public static void main(String[] args) {
		
	
		String str="Motivity labs";
		
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(int i=1;i<str.length();i++)
		{
			hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
		}

		System.out.println(hm);
	}
}
