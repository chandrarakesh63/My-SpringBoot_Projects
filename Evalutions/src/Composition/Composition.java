package Composition;

import java.util.ArrayList;
import java.util.List;

class College
{
	String name;
	String address;
	College(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
}
class University
{
	 private List<College>college;
	 University(List<College>college)
	 {
		 this.college=college;
	 }
	 public List<College> getDetails()
	 {
		 return college;
	 }
	 
}
public class Composition 
{
	public static void main(String[] args)
	{
	College c1=new College("aes","hyd");
	College c2=new College("bess","warangal");
	List<College>li=new ArrayList<College>();
	li.add(c1);
	li.add(c2);
	University u=new University(li);
	List<College>c3=u.getDetails();
	for(College cg:c3)
			{
				System.out.println("name is:"+cg.name+" " +"address is:" +cg.address);
			}
	
}

}
