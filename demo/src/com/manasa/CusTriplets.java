package com.manasa;

import java.util.*;

public class CusTriplets {
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer>  b)
	{
		int k=0 ,l= 0;
		for(int i=0;i<3;i++)
		{
				
			if(a.get(i)>b.get(i))
				 k++;
			if(a.get(i)<b.get(i))
				l++;
		
		}
	  	List<Integer> c = new ArrayList<Integer>();
	  	c.add(k);
	  	c.add(l);
	System.out.println("Bob score is" +k);
	System.out.println("Alice score is " +l);
		
		return  c;	
	}
		

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
	List<Integer> a = new ArrayList<Integer>(3);
	List<Integer> b = new ArrayList<Integer>(3);
		System.out.println("enter score ot bob and alice");
		
	for(int i=0;i<3;i++)
		{
			a.add(s.nextInt());
			b.add(s.nextInt());
		}
		

	compareTriplets(a ,b);
		
	}

}
