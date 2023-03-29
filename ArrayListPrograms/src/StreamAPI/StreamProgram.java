package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram {
	
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Rakesh",26000,23));
		list.add(new Employee("Bikash",36000,25));
		list.add(new Employee("Nihar",40000,22));
		list.add(new Employee("Chandan",30000,23));
		list.add(new Employee("Sibani",15000,23));
		list.add(new Employee("Lipa",28000,23));
		list.add(new Employee("Sarbada",70000,23));
		
		List<Employee> newel=list.stream().filter(n-> n.getAge()>=23).map(n->{n.setSalary(n.getSalary()*1.10f);
		return n;
		}).collect(Collectors.toList());
		
		System.out.println(newel);
		
	}

}
