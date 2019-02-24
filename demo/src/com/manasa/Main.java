package com.manasa;

import java.util.Scanner;



public class Main {

public static void main(String[] args) {
		
		
/*		System.out.println("Enter the type of account to be created");
		Scanner s= new Scanner(System.in);
		 String type = s.nextLine();
		 Account a;
		 
		// a = new CAccount();
		 
		 if(type.equals("savings"))
		 {
			 a = new SbAccount();
			 System.out.println("Enter account holder details");
			 int accno = s.nextInt();
			 String name = s.next();
			 double amount = s.nextDouble();
			 a.setAccno(accno);
			 a.setName(name);
			 a.setAmount(amount);
			
			System.out.println("Enter the amount to be deposited");
			double damount = s.nextDouble(); 
		    a.deposit(damount);
		    System.out.println("Enter amount to be withdarwn");
		    double wamount = s.nextDouble();
		    a.withdraw(wamount);
		    a.display();
	    }
		 else
		 {
			 a = new CAccount();
			 System.out.println("Enter account holder details");
			 int accno = s.nextInt();
			 String name = s.next();
			 double amount = s.nextDouble();
			 a.setAccno(accno);
			 a.setName(name);
			 a.setAmount(amount);
			
			System.out.println("Enter the amount to be deposited");
			double damount = s.nextDouble(); 
		    a.deposit(damount);
		    System.out.println("Enter amount to be withdarwn");
		    double wamount = s.nextDouble();
		    a.withdraw(wamount);
		    a.display();
	    }
}
}*/
	String a="abc";
	String b="abc";//new String("abc");
	String c=new String("abc");
	//b="abcd";
	System.out.println("prinitng equals"+b.equals(c));
	System.out.println("prinitng =="+(b==c));
	c=c.intern();
	System.out.println("prinitng b value"+b+"printing c value"+c);
	System.out.println("prinitng equals"+b.equals(c));
	System.out.println("prinitng =="+(b==c));
	}

}