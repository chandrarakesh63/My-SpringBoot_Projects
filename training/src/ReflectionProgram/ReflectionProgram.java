package ReflectionProgram;

import java.lang.reflect.Field;

public class ReflectionProgram {
	public static void main(String[] args) {
		User1 obj = new User1("Rakesh" , "rakeshchandramo226@gmail.com");
	
	try
	{
		Field checkValue=User1.class.getDeclaredField("name");
		Field checkValue1=User1.class.getDeclaredField("email");
		
		checkValue.setAccessible(true);
		checkValue1.setAccessible(true);
		
		String name=(String)checkValue.get(obj);
		String email=(String)checkValue1.get(obj);
		
		System.out.println("This is the private method ");
		System.out.println(name);
		System.out.println(email);
	}
	catch(Exception e)
	{
		System.out.println("something went wrong");
	}
	}
}
