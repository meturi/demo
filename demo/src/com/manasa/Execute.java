package com.manasa;

import java.util.Scanner;

public class Execute {
	public static void main (String[] args){
		SbAccount sbAccount = new SbAccount();
		double amount;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter initial amount");
	     amount = s.nextDouble();
		
		
		InstanceOf.input(sbAccount, amount);
		
		
	}

}
