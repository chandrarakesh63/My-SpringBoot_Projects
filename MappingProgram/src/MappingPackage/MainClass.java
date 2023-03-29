package MappingPackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MainClass {

	public static Map<String,Employee> mapping() {
		Map<String, Employee> map = new HashMap<>();

		map.put("rakeshchandramo226@gmail.com", new Employee(12, "Rakesh", "java", Arrays.asList("USER")));
		map.put("bikashranjanmo92@gmail.com", new Employee(14, "Bikash", "Farmacy", Arrays.asList("Viewer")));
		map.put("subhamkumargupta32@gmail.com", new Employee(13, "Subham", "java", Arrays.asList("ADMIN")));
		map.put("babulkumarsahoo64@gmail.com", new Employee(15, "Babul", "java", Arrays.asList("USER")));
		map.put("akhilmahamad65@gmail.com", new Employee(17, "Akhil", "java", Arrays.asList("Viewer")));
		map.put("chandankumarsahoo85@gmail.com", new Employee(19, "Chandan", "Bsc", Arrays.asList("USER")));
		map.put("asutoshrout@gmail.com", new Employee(18, "Asutosh", "Btech", Arrays.asList("Viewer")));

		return map;
	}

	public static void checkValue(String str, Employee mapStream,String filter)
	{
		List<String> list=mapStream.getRoles();
		
		Optional<String> getFilter =list.stream().filter(users -> users.equals(filter)).findFirst();
		
		if(getFilter.isPresent())
		{
			System.out.println("Email  :" +str);
			System.out.println("Id : "+mapStream.getId());
			System.out.println("Name : "+mapStream.getName());
			System.out.println("Department : "+mapStream.getDepart());
			System.out.println("Roles : "+getFilter.get());
		}
		
	}
	
	public static void main(String[] args) {

		Map<String,Employee> map = mapping();
		
		Iterator<String> iterator =map.keySet().iterator();
		
		while(iterator.hasNext())
		{
			String str= iterator.next();
			checkValue(str, map.get(str),"USER");
		}
			
		}	
}
