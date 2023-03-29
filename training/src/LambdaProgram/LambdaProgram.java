package LambdaProgram;

public class LambdaProgram {
	
	public static void main(String[] args) {
	   Hii h=()-> {System.out.println("This is the lambda Expression");};

	h.play();
}
}
interface Hii
{
    	public void play();
}
