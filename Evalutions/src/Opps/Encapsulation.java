package Opps;

public class Encapsulation {
	
	private String name="Rakesh chandra mohanty";
	private int  age = 12;
	
	public  Encapsulation(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge()
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name=name;
	}

}
