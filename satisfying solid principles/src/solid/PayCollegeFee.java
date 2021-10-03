package solid;

public interface PayCollegeFee {
	
	public void pay();

}
class payWithCreditCard implements PayCollegeFee
{
	public void pay()
	{
	System.out.println("The college fee paid through Credit Card");
	}
}
class payWithVisa implements PayCollegeFee
{
		public void pay()
		{
		System.out.println("The college fee paid through VISA Card");
		}
}
class payWithMasterCard implements PayCollegeFee
{
		public void pay()
		{
		 System.out.println("The college fee paid to through Master Card");
		}
}


class Payment
{
	PayCollegeFee  paycollgefee;
	void payMoney(PayCollegeFee paycollgefee)
	{
		paycollgefee.pay();
	}
}