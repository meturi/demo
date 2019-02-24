package com.manasa;

public class ImplementInterface implements DefInterface,DefInterface2{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("General method");
	}
	
	@Override
	public void Example() {
		// TODO Auto-generated method stub
		DefInterface2.super.Example();
		System.out.println("Default method");   
		DefInterface.super.Example();
	}

	public static void main(String[] args) {
	
		ImplementInterface ii = new ImplementInterface();
		ii.Example();
		ii.method();
	}
}
