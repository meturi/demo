package com.manasa;

public final class CAccount extends Account
{
	
//	CAccount(){
//		super();
//	}
final double minbalance = 500;
	double deposit (double damount)
	{
	super.deposit(damount);
	return damount;
	}
	double withdraw(double wamount)
	{
	super.withdraw(wamount);
	return wamount;
	}
/*	double deposit(double damount)
	{
	
		amount = amount + damount;
		totdeposit = totdeposit +damount;
		return totdeposit;
	
	}
	double withdraw(double wamount)
	{
		
         if(wamount>amount)
         {
	        System.out.println("Insufficient Balance");
         }
         else 
         {
        	 amount = amount - wamount;
		    totwithdraw = totwithdraw - wamount;
		    
	     }
         return totwithdraw;
	}*/
	void display()
	{
		System.out.println("Account number is" +accno);
		System.out.println("Name is" +name);
		System.out.println("amount is" +amount);
		System.out.println("Total deposits are" +totdeposit);
		System.out.println("Total withdraws are" +totwithdraw);
		
	}
}
