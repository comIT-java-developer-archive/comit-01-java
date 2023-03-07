package com.comit.course._13_abstract_class;


/* Page 129 -131
 * An Abstract class is a class that can only be extended.
 * 
 * Allows us to declare abstract methods to be defined in the 
 * Child Class.
 * We can also have non-abstract methods in the class.
 */
abstract class MyAbstractClass {
	
	abstract void print();
	
	void printHello() {
		System.out.println("Hello");
	}
}

class Child extends MyAbstractClass{
	
	void print() {
		System.out.println("I am Child");
	}
	
	void printChild() {
		System.out.println("Child");
	}
}


public class AbstractClassExample {

	public static void main(String[] args) {

		MyAbstractClass obj = new Child();
		
		((Child)obj).printChild();
	}

}
