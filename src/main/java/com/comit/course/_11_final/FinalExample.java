package com.comit.course._11_final;

/*
 * The final keyword can be applied on Classes, methods and variables.
 */

/*
 * A class final cannot be extended.
 * For instance: String, Integer
 */
class Parent{

	/*
	 * A final method cannot be overridden by a child class.
	 */
	void print() {
		System.out.println("I am the Parent class");
	}
}

class Child extends Parent {
	
	@Override
	void print() {
		System.out.println("I am the Child class");
	}
}



public class FinalExample {
	
	/* 
	 * A final class attribute cannot be updated -> constant 
	 * A constant in Java is defined as static final. 
	 * By Convention constants names in Java must all in upper-case letters.
	 */
	
	static final int NUM = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
