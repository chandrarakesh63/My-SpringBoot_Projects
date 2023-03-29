
public class Calculate {

	public static void areaOfTrainglae()
	{
		int b=12,h=5;
		int traingleArea=1/2*(b*h);
		System.out.println(traingleArea);
	}
	
	public static void areaOfSquare ()
	{
		int a=3;
		int area=a*a*a*a;
		System.out.println(area);
	}
	public static void areaOfRectangle ()
	{
		int l=32,b=4;
		int area=l*b;
		System.out.println(area);
		
	}
	public static void main(String[] args) {
		Calculate c=new Calculate();
		c.areaOfTrainglae();
		c.areaOfSquare();
		c.areaOfRectangle();
	}
}
