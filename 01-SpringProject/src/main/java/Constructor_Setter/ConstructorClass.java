package Constructor_Setter;

public class ConstructorClass {
	
	private String eName;
	private int eId;
	
	public ConstructorClass(String eName,int eId)
	{
		this.eName=eName;
		this.eId=eId;
	}
	@Override
	public String toString() {
		return this.eName+" :"  + this.eId;
	}

}
