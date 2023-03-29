package Spring_1;

public class PaymentProcessor implements IPayment{

	public boolean payBill(Double billAmt) {
		return false;
	}

	public PaymentProcessor()
	{
		System.out.println("**** Payment Processor constructor****");
	}
	private IPayment payment;

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	public void doPayment(Double billAmt)
	{
		boolean ispaymentDone =payment.payBill(billAmt);
		if(ispaymentDone=true)
		{
			System.out.println("payment complete successfully");
		}
		else {
			System.out.println("failed to complete payment");
		}
		
	}
	
	
	
}
