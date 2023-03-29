package ThrowException;

public class ThrowException {
	public static void main(String[] args) throws Exception {
		int myAge=22;
		int myBroAge=21;
		if(myAge<myBroAge)
		{
			System.out.println("my brother is bigger to me");
		}
		else {
			throw new ThisIsAnException("here i get the exception");
		}
	}
}
