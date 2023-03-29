package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorProgram {
	 public static void main(String[] args)  
	    {  
	        ArrayList<String> familyMembers = new ArrayList<String>();  
	    
	        familyMembers.add("Rakesh");  
	        familyMembers.add("Bikash");  
	        familyMembers.add("Rabi");  
	        familyMembers.add("Jyoti");  
	        familyMembers.add("Madhusudhan");  
	    
	        // Iterator to iterate the cityNames  
	        Iterator iterator = familyMembers.iterator();  
	    
	        System.out.println("family  Members : ");  
	    
	        while (iterator.hasNext())  
	          System.out.print(iterator.next() + " ");  
	    
	       System.out.println();  
	    }  

}
