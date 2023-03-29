package Encapsulation;

public class Encapsulation {
	private String name;
	private int age;
	private char firstLetter;
	public Encapsulation(String name,int age,char firstLetter) {
		this.setName(name);
		this.setAge(age);
		this.setFirstLetter(firstLetter);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getFirstLetter() {
		return firstLetter;
	}
	public void setFirstLetter(char firstLetter) {
		this.firstLetter = firstLetter;
	}
	
	}

