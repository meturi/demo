package com.manasa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx {
public static void main(String args[])
{
	Vector<String> v = new Vector<String>();
	v.add("Mythili");
	v.add("Gayathri");
	v.add("Pavan");
	v.add("Gowri");
	v.add("VenkateswaraSarma");
	System.out.println("Elements before sorting:");
	System.out.println(v);
	System.out.println("After sorting");
	Collections.sort(v);
	System.out.println("Enumeration of vector elements");
	Enumeration en = v.elements();
	while(en.hasMoreElements())
	{
		System.out.println(en.nextElement());
	}
	System.out.println("Adding elements at a particular index");
	v.add(3,"kittu");
	System.out.println(v);
	System.out.println("Replacing element");
	v.set(4, "BhuvanSripada");
	System.out.println(v);
	System.out.println("Creating sublist");
	List slist = v.subList(2,5);
	System.out.println("Traversing in forward direction");
	ListIterator li = slist.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	
	System.out.println("Traversing in forward direction");
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}
	System.out.println("Converting vector to list");
	List<String> list = Collections.list(v.elements());
	System.out.println(list);
	System.out.println("Converting vector to Arraylist");
	ArrayList<String> av = new ArrayList<String>(v);
	System.out.println(av);
	System.out.println("Converting vector to String array");
	String[] arr = v.toArray(new String[v.size()]);
	for(int k=0;k<arr.length;k++)
	{
	System.out.println(arr[k]);
}
}
}