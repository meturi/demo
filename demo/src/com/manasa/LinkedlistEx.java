package com.manasa;
import java.util.*;
public class LinkedlistEx {
public static void main(String args[])
{
	LinkedList<String> ll = new LinkedList<String>();
	ArrayList<Character> ac = new ArrayList<Character>();
	ac.add('g');
	ac.add('e');
	System.out.println(ac);
	ll.add("venki");
	ll.add("Gopal");
	ll.add("Krishna");
	ll.add("Subramanyam");
	ll.add("Kittu");
	System.out.println(ll);
	Iterator i = ll.iterator();
	System.out.println("Using itearor loop");
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	ll.add("gayathri");
	System.out.println(ll);
	ListIterator li = ll.listIterator();
	System.out.println("Iterating in forward direction");
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println("Itearting in backward direction");
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}
	Iterator d = ll.descendingIterator();
	System.out.println("Iterating in reverse direction");
	while(d.hasNext())
	{
		System.out.println(d.next());
	}
	System.out.println("Cloning a linkedlist");
//	LinkedList<String> lc = (LinkedList<String>)ll.clone();
	LinkedList<String> lc = new LinkedList<String>();
	lc = (LinkedList)ll.clone();
	System.out.println(lc);
	System.out.println("Converting linkedlist to arraylist");
	ArrayList<String>  al = new ArrayList<String>(ll);
	System.out.println(al);
	System.out.println("Converting linkedlist to array");
	String[] arr = ll.toArray(new String[ll.size()]);
	for(int j=0;j<ll.size();j++)
	{
		System.out.println(arr[j]);
	}
}
	
}
