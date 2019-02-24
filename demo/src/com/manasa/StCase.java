package com.manasa;

import java.util.Scanner;

public class StCase {
	static void staircase(int n)
	{  
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i+j)>n)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		 
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter number of elements");
int n = s.nextInt();
staircase(n);
	}

}
