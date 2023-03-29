package TimeAndDAteZone;

import java.util.Date;
import java.util.TimeZone;

public class TimeZone1 {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		String[] id= TimeZone.getAvailableIDs();
		
		for(String s: id)
		{
			s= s.toLowerCase();
			
			if(s.contains(s))
			{
				System.out.println(s);
			}
		}
		
		
	}

}
