package Spring_1;

public class CreditCardPayment  implements IPayment{
	
	public CreditCardPayment()
	{
		System.out.println("*** CreditCardPayment:: Constructor****");
	}

	public boolean payBill (Double billAmt)
	{
		return false;
	}
} 
