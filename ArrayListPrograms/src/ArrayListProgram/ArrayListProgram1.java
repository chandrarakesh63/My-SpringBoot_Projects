package ArrayListProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListProgram1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList());
		List<Integer> li =new ArrayList<>(Arrays.asList(1,2,3,4));
		list.add(23);
		list.add(64);
		list.add(21);
		list.add(12);
		list.add(24);
		list.add(65);
		list.add(22);
		list.add(13);
		list.add(20);
		list.add(66);
		list.add(28);
		list.add(10);
		
		// This is the sort
		//list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);;
	
		Object [] obj=  list.toArray();
		System.out.println("This is conversion of list to arrays "+Arrays.toString(obj));
		
		System.out.println(list.isEmpty());

		System.out.println(list.size());

		System.out.println(list);
		
		//list.contains(list);
		
		Iterator<Integer> l =list.iterator();
		while(l.hasNext()) {
		System.out.println(l.next());
		}
		
		list.set(4, 25);
		System.out.println("List Index 4 contains : "+list.get(4));
		
		//list.removeAll(list);
		
		System.out.println(list);
		
		System.out.println("List Add all : "+list.addAll(1,li));
		System.out.println("New List : "+list);
		
	}

}
