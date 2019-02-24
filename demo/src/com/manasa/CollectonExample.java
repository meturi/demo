package com.manasa;
import java.util.*;

public class CollectonExample {
	public static void main(String args[])
	{
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Manasa");
		alist.add("Gayathri");
		alist.add("Gopala Krishna");
		alist.add("BhuvanSripada");
		alist.add("Girija");
		System.out.println(alist);
		alist.add(0, "Vedavati");
		alist.add(1, "PrasadRao");
		System.out.println("After adding" +alist);
		alist.remove("Gayathri");
		alist.remove(0);
		System.out.println("After removing" +alist);
		alist.set(0, "Vedavati");
		int pos = alist.indexOf("Manasa");
		String s = alist.get(3);
		int i = alist.size();
		boolean a = alist.contains("gowri");
		System.out.println("Before sorting:");
		for(String str:alist)
			System.out.println(str);
		Collections.sort(alist);
		System.out.println("After sorting:");
		for(String str:alist)
			System.out.println(str);
		System.out.println("Sorting in descending order");
//		Collections.sort(alist, Collections.reverseOrder());
		Collections.reverse(alist);
		System.out.println(alist);
		System.out.println("Getting an element in a given index  " +  s);
		System.out.println("Size of arraylist  " +  i);
		System.out.println("Postion of a element  " +  pos);
		System.out.println("Searching for an element  " +a);
		ArrayList<Integer> b = new ArrayList<Integer>(Collections.nCopies(7, 5));
		ArrayList<Integer> f = new ArrayList<Integer>(b.subList(1, 3));
		System.out.println("Sublist elements are" +f);
		Iterator d = b.iterator();
		while(d.hasNext())
		{
			System.out.println(d.next());
		}
		ArrayList<String> c = new ArrayList<String>(Collections.nCopies(7, "Manasa"));
		c.addAll(alist);
		System.out.println("All elements" +c);
		Iterator e = c.listIterator();
		while(e.hasNext())
		{
			System.out.println(e.next());
		}
		
	}

}
