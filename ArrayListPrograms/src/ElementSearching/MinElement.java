package ElementSearching;

public class MinElement {
	
	public static void main(String[] args) {
		
		int[] arr= {12,32,23,34,45,2,90};
		int min= arr[0];
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
