package StreamProgram;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Name {
	private int i;
	private String name;

	public Name(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}

	public Name() {
		super();
	}

	@Override
	public String toString() {
		return "Name [i=" + i + ", name=" + name + "]";
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Stream {

	public static void main(String[] args) {

		ArrayList<Name> list = new ArrayList<>();

		list.add(new Name(47, "Bikash"));
		list.add(new Name(74, "rakesh"));
		list.add(new Name(63, "Nihar"));
		list.add(new Name(92, "Subham"));
		list.add(new Name(20, "Babul"));

		System.out.println("This is all the details in list");
		System.out.println(list);

		System.out.println("This is find By id in Stream");
		list.stream().filter(n -> n.getI() == 20).forEach(System.out::println);

		System.out.println("This is find By name in Stream");
		list.stream().filter(f -> f.getName().equals("rakesh")).forEach(System.out::println);

		System.out.println("This is find By StartWith in Stream");
		list.stream().filter(n -> n.getName().startsWith("B")).collect(Collectors.toList())
				.forEach(System.out::println);
		
		
		list.stream().filter(v -> v.getI() == 20).map(v -> v.getI()+2).forEach(System.out::println);
		
		list.stream().filter(x -> x.getName().equals("rakesh")).map(x -> x.getName()+"  "+"jkkdk").forEach(System.out::println);

	}

}
