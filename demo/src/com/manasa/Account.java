package com.manasa;

public abstract class Account {
	int accno;
	String name;
	double amount;
	double damount;
	double wamount;
	double totdeposit = 0;
	double totwithdraw = 0;

/*	Account() {

	}

	abstract void display();

	abstract double deposit(double damount);

	abstract double withdraw(double wamount);

*/
	abstract void display();
	double deposit(double damount)
	{
		amount = amount+damount;
		totdeposit = totdeposit + damount;
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
        	 amount = amount -wamount;
		    totwithdraw = totwithdraw - wamount;
		    
	     }
         return totwithdraw;
	}
	
	
	
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDamount() {
		return damount;
	}

	public void setDamount(double damount) {
		this.damount = damount;
	}

	public double getWamount() {
		return wamount;
	}

	public void setWamount(double wamount) {
		this.wamount = wamount;
	}

	public double getTotdeposit() {
		return totdeposit;
	}

	public void setTotdeposit(double totdeposit) {
		this.totdeposit = totdeposit;
	}

	public double getTotwithdraw() {
		return totwithdraw;
	}

	public void setTotwithdraw(double totwithdraw) {
		this.totwithdraw = totwithdraw;
	}

}
