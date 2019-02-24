package com.manasa;

import java.util.Scanner;

public class DiagDiff {
public static int DiagonalDifference(int a[][], int n)

{
	int k =0, l=0 ,ad =0;
	for(int i=0; i<n ;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j)
				k += a[i][i];
			if(i == n- j - 1)
				l += a[i][j];
				
		}
	}
	  ad = Math.abs( k - l);
	  System.out.println("Absolutr difference is " +ad);
	  return ad;
}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter the length of matrix");
	n = sc.nextInt();
	int a[][] = new  int[n][n];
	

	System.out.println("enter matrix values");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j] = sc.nextInt();
		}
	}
	DiagonalDifference(a,n);
}
}
