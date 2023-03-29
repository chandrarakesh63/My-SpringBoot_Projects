package SerializationProgram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ClassWithSerilization {
	
	public static void main(String[] args) {
		
		Employee list = new Employee(1,"SUbham");
		
		
		String fileName = "data.txt";
		
		try {
			
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(list);
			
			System.out.println("Data Will be Passed...");
			
			out.close();
			file.close();
			
		}
		catch(Exception e) {
			System.out.println("Something Wrong in Output");
		}
		
		list = null;
		
		try {
			
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			list = (Employee)in.readObject();
			
			System.out.println("File read seccessfully");
			
			in.close();
			file.close();
			
			System.out.println(list);
			
		}
		catch(Exception e) {
			System.out.println("Something is Wrong in deserialization");
		}	
	}
}