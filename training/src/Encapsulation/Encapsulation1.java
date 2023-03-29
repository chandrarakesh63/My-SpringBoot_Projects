package Encapsulation;

public class Encapsulation1 extends Encapsulation{
	public Encapsulation1(String name, int age, char firstLetter) {
		super(name, age, firstLetter);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Encapsulation en=new Encapsulation("Rakesh Chandra Mohanty",22,'r');
		System.out.println(en.getName());
		System.out.println(en.getAge());
		System.out.println(en.getFirstLetter());
	}
}
