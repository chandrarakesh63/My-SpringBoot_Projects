package ArrayList;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  System.out.println(al);
		  LinkedList<String> al2=new LinkedList<String>();
		  al2.add("volu");
		  al2.add("Riku");
		  al.addFirst("Hii");
		  al2.addLast("Byy");
		  al.addAll(al2);
		  System.out.println(al);
		  
	}

}
