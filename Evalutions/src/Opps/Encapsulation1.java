package Opps;

public class Encapsulation1 extends Encapsulation{
	
	public Encapsulation1(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation("rakesh",22);
		System.out.println(e.getAge());
		System.out.println(e.getName());
		
	}

}
