package com.manasa;



public class InstanceOf {
//	static float rate_interest;
	public static  double input( Object obj,double amount)
	{
		if(obj instanceof SbAccount)
		{
			amount = (amount*0.045)+amount;
			System.out.println("Amount is " +amount);
		}
		if(obj instanceof CAccount)
		{
			amount = (amount*0.02)+amount;
		}
		
		System.out.println("Final balance is " +amount);
		return amount;
	}
	


}
