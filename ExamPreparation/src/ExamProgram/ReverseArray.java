package ExamProgram;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		List<Integer> list=new  ArrayList<Integer>();
		
		list.add(29);
		list.add(19);
		list.add(23);
		list.add(22);
		list.add(24);
		
		for(int i=list.size()-1; i>=0;i--)
		{
			System.out.println(list.get(i));
		}
	}

}
