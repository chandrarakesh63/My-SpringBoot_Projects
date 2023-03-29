package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	// Add the element in an array.
	list.add(4);
	list.add(7);
	list.add(3);
	list.add(5);
	list.remove(0);
	System.out.println(list);
	
	//get elements
	int element=list.get(1);
	System.out.println(element);
	
	// add element in between
	list.add(1, 5);
	System.out.println(list);
	
	// Size of array
	
	int size=list.size();
	System.out.println(size);
	
	// sorting the array.
	
	Collections.sort(list);
	System.out.println(list);
	
}
}
