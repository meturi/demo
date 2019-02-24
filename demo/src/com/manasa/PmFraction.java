package com.manasa;

import java.util.Scanner;

public class PmFraction {
	
	static void plusMinus(int ar[])
	{
		float j=0,k=0,l=0;
		for(int i=0;i<ar.length;i++)
		{
			
			if(ar[i]<0)
				j++;
			if(ar[i]==0)
				k++;
			if(ar[i]>0)
				l++;	
				
		}
		System.out.println(j/ar.length);
		System.out.println("zeroes fraction in array are" +(k/ar.length));
		System.out.println("positive numbers fraction in array are" +(l/ar.length));
			
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]= sc.nextInt();
		}
		plusMinus(ar);	
		
		
	}

}
