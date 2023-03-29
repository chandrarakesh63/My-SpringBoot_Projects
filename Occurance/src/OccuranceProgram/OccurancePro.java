package OccuranceProgram;

public class OccurancePro {
	
	public static void main(String[] args) {
		String s="Deloitte";
		char ch='t';
		int count=0;
		
		if(s.indexOf(ch)==-1)
		{
			System.out.println("Not in Range ");
			System.exit(0);
		}
			int cnt=1;
			for(int i=0;i<s.length();i++){
			char ch1=s.charAt(i);
			if(ch==ch){
			s=s.replaceFirst(String.valueOf(ch),String.valueOf(cnt));
			cnt++;
			}
			}
			System.out.println(s);
			}
}	
		
//		for(int i=0 ; i<s.length();i++) {
//			
//			if (s.charAt(i)==ch)
//			{
//				count++;
//				System.out.println(count); 
//				if (count==1)
//				{
//					
//				System.out.println(	s.replace(ch,'c'));
//				
//				}
//			}
//			//System.out.println( s.toCharArray());
//		
//		}	
	

