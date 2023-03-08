package com.comit.course._15_access_modifiers._03_protected.same_package;


/*
 * The protected access modifier is same as default but we have access to the members via inheritance.
 */

public class MyClass {
   
	/*
	 * The members are default
	 */
	protected int num = 4;
	
	protected void doSomething() {
		System.out.println("I am doing something");
	}
}
