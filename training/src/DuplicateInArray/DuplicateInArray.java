package DuplicateInArray;

   
public class DuplicateInArray {
	public static void main(String[] args) {
		
	
	int arr[]= {2,3,7,4,5,8,7,6,8,1,7,4,10,11,12,1,2,};
	int len =arr.length;

	for(int i = 0; i<len-1;i++){
	for(int j = i +1; j < len; j++){
	if((arr[i] == (arr[j])) && (i != j)){
	System.out.println("Duplicates eles are: "+arr[i] +" at position " +i);
	}
	}
	}
	}

}
