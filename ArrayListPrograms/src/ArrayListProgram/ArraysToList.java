package ArrayListProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// In this Array program String coantains or not ,if present then count how many time it is present.....

public class ArraysToList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		int count = 0;
		
		List<String> list = Arrays.asList("AA", "BB", "AA", "CC");

		//System.out.println(list.contains(str));

//		

		long l = list.stream().filter(n -> n.contains(str)).count();
		//System.out.println(list);
		System.out.println(str + " = " + l);

	}
}
