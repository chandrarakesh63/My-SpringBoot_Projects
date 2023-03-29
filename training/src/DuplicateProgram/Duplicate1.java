package DuplicateProgram;

import java.util.HashMap;

public class Duplicate1 {

	public static void main(String[] args) {
		String PGraph="Rakesh is a good boy and he is a innocent boy .";
		
		HashMap<Character,Integer> hs= new HashMap<>();
		for (int i=1;i<PGraph.length();i++)
		{
			hs.put(PGraph.charAt(i), hs.getOrDefault(PGraph.charAt(i),0)+1);
		
			//hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
			
		}
		System.out.println(hs);
	}

	
}
