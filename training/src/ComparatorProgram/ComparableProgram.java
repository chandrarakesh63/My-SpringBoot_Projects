package ComparatorProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableProgram implements Comparator<String>{
	

	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList<String>();
		
		al1.add("Rakesh");
		al1.add("Babul");
		al1.add("Riku");
		al1.add("Bikash");
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);
		
		
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}
