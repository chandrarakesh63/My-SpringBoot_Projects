package ElementSearching;

public class MaxElement {
	
	public static void main(String[] args) {
		int[] arr= {10,7,20,23,19};
		int max=arr[0];
		for (int i=0;i<arr.length-1;i++)
		{
			
				if (arr[i]>max)
				{
					max=arr[i];
					
				}
				
		}
		System.out.println(max);
		
	}

}
