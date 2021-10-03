package zemoso;

class Payment{
	int collegeFee;
	String paymentType;
	Payment(int collegeFee, String paymentType)
	{
		this.collegeFee=collegeFee;
		this.paymentType=paymentType;
	}
	void pay()
	{
		
		if (paymentType =="Credit Card")
		{
			payWithCreditCard p= new payWithCreditCard();
			p.payMoney();
		}
		else if(paymentType=="VISA")
		{
			payWithVisa p= new payWithVisa();
			p.payMoney();
			
		}
		else if(paymentType=="MasterCard")
		{
			payWithMasterCard p= new payWithMasterCard();
			p.payMoney();
		}
		else if(paymentType=="Mobile Payment")
		{
			payWithMobilePayment p= new payWithMobilePayment();
			p.payMoney();
		}
		
		else
		{
			System.out.println("The college fee paid through Cash ");
		}
	}

}
class payWithCreditCard
{
		void payMoney()
		{
		System.out.println("The college fee paid through Credit Card");
		}
}	
class payWithVisa
{
		void payMoney()
		{
		System.out.println("The college fee paid through VISA Card");
		}
}
class payWithMasterCard
{
		void payMoney()
		{
		 System.out.println("The college fee paid to through Master Card");
		}
}
class payWithMobilePayment
{
		void payMoney()
		{
		 System.out.println("The college fee paid to through Mobile Payments");
		}
}
	
