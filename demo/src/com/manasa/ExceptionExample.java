package com.manasa;

public class ExceptionExample extends Exception {
	static double accno[] = {23456,34567,45678,56789,67890};
	static String name[] = {"Manasa","Gayathri","Gopal","Girija","Sripada"};
	static double balance[] = {20000,30000,40000,500,60000};
	ExceptionExample(String s)
	{
		super(s);
	}
	public static void main(String args[])
	{
	
	try {	
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Account no is " +accno[i] +", Name is " +name[i] +", Balance is "  +balance[i]);
			if(balance[i] < 1000)
			{
				ExceptionExample e = new ExceptionExample("BAlance is less than minimum balance");
				throw e;
			}
			
		}
		
	}
		catch(ExceptionExample e)
		{
	e.printStackTrace();
	
}
		
}
}

