package Spring_1;

public class DebitCardPayment implements IPayment{

	 public DebitCardPayment()
	 {
		 System.out.println("**** DebitCardPayment Constructor ***");
	 }
	
	public boolean payBill(Double billAmt) {
		return false;
	}

}
