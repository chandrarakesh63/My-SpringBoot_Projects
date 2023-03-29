package ShallowPrograms;

public class ShallowProgram1 {
	String name;
	String id;
	
	public static void main(String[] args) {
		
	ShallowProgram1 sh=new ShallowProgram1();
	
	sh.name="djjd";
	sh.id="dhhd";
	System.out.println(sh);
	ShallowProgram1 shl =new ShallowProgram1();
	System.out.println(shl);
	shl.id=sh.id;
	shl.name=sh.name;
	shl=sh;
	
	System.out.println(sh.id + "  " + sh.name);
	System.out.println(shl.id +  "  " + shl.name);
	
	}
}
