package ExamProgram;

public class ReverseWord {
	
	public static void main(String[] args) {
		String str="Hello Rakesh";
		String temp="";
		String[] d=str.split(" ");
		for(int i= d.length-1; i>=0;i--)
		{
			temp =temp + d[i] + " ";
		}
		
		System.out.println(temp);
	}

}
