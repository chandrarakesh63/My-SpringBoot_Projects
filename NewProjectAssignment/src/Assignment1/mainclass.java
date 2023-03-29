package Assignment1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class mainclass {

	  static int max=0;
	public static void main(String[] args){
		ArrayList<MgEmployee1> array =new ArrayList<MgEmployee1>();
		MgEmployee1 m1= new MgEmployee1(1,"rakesh",18100);
		MgEmployee1 m2=new MgEmployee1(2,"abhilash",19050);
		MgEmployee1 m3=new MgEmployee1(3,"bikash",19000);
		MgEmployee1 m4=new MgEmployee1(4,"nihar",20000);
		MgEmployee1 m5=new MgEmployee1(5,"babul",20500);
		MgEmployee1 m6=new MgEmployee1(6,"niru",21000);
		
		array.add(m1);
		array.add(m2);
		array.add(m3);
		array.add(m4);
		array.add(m5);
		array.add(m6);
		
		array.stream().filter(user -> user.getSalary() > 18000).forEach(System.out::println);
		System.out.println("Increment by 10 %");
	             array.stream()
				.filter(user -> user.getSalary() > 20000)
		         .map(user -> user.getSalary()+2000)
		          .forEach(p->System.out.println(p));
	             
	             System.out.println("Increment by 5% ");
	             array.stream()
					.filter(user -> user.getSalary() < 20000)
			         .map(user -> user.getSalary()+1000)
			          .forEach(p->System.out.println(p));
	             
//	           MgEmployee1 e=array.stream()
//	        		   .collect(Collectors.minBy((o1, o2) -> o1.get)
//	        				   
	         
	             
		}
}

