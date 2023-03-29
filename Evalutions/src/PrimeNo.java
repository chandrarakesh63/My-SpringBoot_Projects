import java.util.Iterator;

public class PrimeNo {
	public static void main(String[] args) {
		int num=10,count=0;
		
		for(int i=2;i<=num/2;i++)
		{
			if (num%i==0)
				count++;
		}
		if (count==0)
			System.out.println(num+" is a prime Number");
		else
			System.out.println(num+"This is not a prime number");
	}

}
