package com.manasa;

import java.util.ArrayList;
import java.util.Collections;

public class CustomArraylist implements Comparable<CustomArraylist>{
	String ename;
	
	int eid;
	double salary;
	String address;
	public CustomArraylist(String ename,int eid,double salary,String address)
	{this.ename= ename;
	this.eid = eid;
	this.salary = salary;
	this.address = address;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int compareTo(CustomArraylist ca) {
		// TODO Auto-generated method stub
		return this.ename.compareTo(ca.ename);
	}
	public String toString()
	{
	return "name is" +this.ename+ "ID is" +this.eid +"Salary is " +this.salary +"Address is" +this.address;
	}
	
public static void main(String args[])
{
	ArrayList<CustomArraylist> ca = new ArrayList<CustomArraylist>();
	ca.add(new CustomArraylist("Manasa",231,20000,"Kurnool"));
	ca.add(new CustomArraylist("Gayathri",456,30000,"Hyderabad"));
	ca.add(new CustomArraylist("GoapalaKrishna",567,40000,"LbNagar"));
	ca.add(new CustomArraylist("BhuvanSripada",789,50000,"Roseville"));
	ca.add(new CustomArraylist("Girija",678,60000,"Rocklin"));
	System.out.println("Sorting by ename:");
	Collections.sort(ca);
for(CustomArraylist cl:ca)
{
	System.out.println(cl.getEname()+ ","  +cl.getEid() +"," +cl.getSalary() +"," +cl.getAddress());
}
System.out.println("sorting by eid:");
Collections.sort(ca, new EidComparator());
for(CustomArraylist cl:ca)
{
	System.out.println(cl.getEname()+ ","  +cl.getEid() +"," +cl.getSalary() +"," +cl.getAddress());
	
}
System.out.println("Sorting by Address:");
Collections.sort(ca, new AddressComparator());
for(CustomArraylist cl:ca)
{
	System.out.println(cl.getEname()+ ","  +cl.getEid() +"," +cl.getSalary() +"," +cl.getAddress());
	
}

System.out.println(ca);
}
}
