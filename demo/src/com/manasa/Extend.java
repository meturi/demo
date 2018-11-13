package com.manasa;

public class Extend extends module2 {
	void display(int eid[],String name[])
	{
		System.out.println("ID  " + "  Name  "   );
		for(int i=0;i<5;i++)
		{
			System.out.println(+ eid[i]  + "   "  +name[i]);
			
		}
	}

	/*public static void main(String args[])
	{
		int eid[] = new int[5];
		String name[] = new String[5];
		double salary[] = new double[5];
	Scanner s = new Scanner(System.in);	
		module2 m = new module2();
		Extend e = new Extend();
		
		for(int i=0;i<5;i++)
		{
			eid[i]= s.nextInt();
			name[i]=s.next();
			salary[i]= s.nextDouble();
			
		}
		m.display(eid, name, salary);
		e.display(eid, name);
		
	}*/
}
