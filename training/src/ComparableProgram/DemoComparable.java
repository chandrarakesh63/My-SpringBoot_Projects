package ComparableProgram;

import java.util.ArrayList;
import java.util.Collections;

public class DemoComparable implements Comparable<Integer>{
	
	public static void main(String[] args) {
		
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	al.add(231);
	al.add(48);
	al.add(43);
	al.add(553);
	Collections.sort(al);
	
	al.forEach(d->System.out.println(d));
	
 	System.out.println("This is the dessending Order ");
	Collections.reverse(al);
	al. forEach(d->System.out.println(d));
	
	}

	@Override
	public int compareTo(Integer o) {
		return this.compareTo(o);
	}

	

}
