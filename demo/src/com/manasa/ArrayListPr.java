package com.manasa;
import java.util.*;



public class ArrayListPr 
{
	/*public static void insert(ArrayList<String> clist,String e)
	{
		clist.add(e);
	}
	public static void frequency(ArrayList<String> clist, String c)
	{
		int count =0;
		for(int i=0; i<clist.size();i++)
		{
			if(clist.get(i).equals(c))
			{
				count++;
			}
			if(count==0)
			{
				System.out.println("Not present");
			}
			else
			{
				System.out.println("Frequency of " +c +"is" +count);
			}
		}
	}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	ArrayList<String> clist = new ArrayList<String>();
	System.out.println("Enter character vlues");
	
	String c,a;
	
	for(int i=0;i<5;i++)
	{
		c = sc.nextLine();
		clist.add(c);
	}
	System.out.println("ENter the string to be searched");
	a = sc.nextLine();
	ArrayListPr.insert(clist, a);
	ArrayListPr.frequency(clist,a);
}*/
	
	
	/*public static void main(String args[])
	{
		ArrayList<Integer> ai = new ArrayList<Integer>(5);
		String s;
		
		ArrayList<Character> ac =  new ArrayList<Character>();
		ac.add('m');
		ac.add('a');
		ac.add('n');
		ac.add('a');
		ac.add('s');
		ac.add('a');
		System.out.println("Frquency of letter is" +Collections.frequency(ac, 'a'));
//		char c = 'a';
//		Iterator i = ac.iterator();
//		while(i.hasNext())
//		{
//			if(ac.contains('a'))
//			{
//				System.out.println("Frquency of letter is" +Collections.frequency(ac, 'a'));
//			}
//			else
//				System.out.println("Not present");
//		}
//		
	}
}
*/
	/*public static void insert(ArrayList<Character> clist,char e)
	{
		clist.add(e);
	}
	public static void frequency(ArrayList<Character> clist, char e)
	{
		int count =0;
		for(int i=0; i<clist.size();i++)
		{
			if(clist.get(i)==e)
			{
				count++;
			}
		}
			if(count==0)
			{
				System.out.println("Not present");
			}
			else
			{
				System.out.println("Frequency of " +e +"is" +count);
			}
		}
	
	public static void main(String args[])
	{
		ArrayList<Character> clist = new ArrayList<Character>();
		String s;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		s = sc.next();
		for(int i=0; i<s.length();i++)
		{
			clist.add(s.charAt(i));
		}
		System.out.println("Enter the chracter to be counted");
		c = sc.next().charAt(0);
		ArrayListPr.frequency(clist, c);
		
	}*/
	
	/*
			static int arr[];
	public  int getSum(int arr[], int a, int b, int length)
	{
	
		int c =0 ;
		for(int i=0; i <arr.length;i++)
		{
			c += arr[a] + arr[b];
		}
		System.out.println("sum is " +c);
		return c;
	}
	public static void main(String args[])
	{
		int arr[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("enter the range of index to add");
		int a = s.nextInt();
		int b = s.nextInt();
		ArrayListPr.getSum()
	}
*/	

public static int[] compareTriplets(int[] a, int[]  b)
{
	int k=0 ,l= 0;
	for(int i=0;i<3;i++)
	{
			
		if(a[i] >b[i])
			 k++;
		if(a[i]<b[i])
			l++;
	
	}
  int	c[] = {k , l};
System.out.println("Bob score is" +k);
System.out.println("Alice score is " +l);
	return c;	
}
	

public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	int a[] = new int [3];
	int b[] = new int [3];
	System.out.println("enter score ot bob and alice");
	for(int i =0 ; i<3; i++)
	{
		a[i] = s.nextInt();
		b[i] = s.nextInt();
	}
	

compareTriplets(a ,b);
	
}
}
