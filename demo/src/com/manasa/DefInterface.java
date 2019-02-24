package com.manasa;

public interface DefInterface {
	void method();
	default void Example()
	{
		System.out.println("Default example1");
	}
	
	

}
