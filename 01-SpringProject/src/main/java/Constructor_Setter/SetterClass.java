package Constructor_Setter;

public class SetterClass {
	
	private String eName;
	private int eId;
	
	public void seteName(String eName) {
		System.out.println("This is the eName setter injection used");
		this.eName = eName;
	}
	public void seteId(int eId) {
		System.out.println("This is the eId setter injection used");

		this.eId = eId;
	}
	@Override
	public String toString() {
		return "Ename  " +  eName + " EId " + eId;
	}

}
