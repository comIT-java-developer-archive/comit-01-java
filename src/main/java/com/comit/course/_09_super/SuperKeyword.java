package com.comit.course._09_super;


/*
 * The super keyword in Java is a reference variable that refers the
 * immediate parent class
 */
class Parent {
	
	String color = "Parent color";
	
	Parent(String color){
		this.color = color;
		System.out.println("Parent Constructor");
	}
	
	void doSomething() {
		System.out.println("Parent Doing Something");
	}
}

class Child extends Parent{

	String color = "Child color";
	
	Child(String color){
		super(color);
	    System.out.println("Child Constructor");
	}
	
	void displayColor() {
		
		System.out.println( this.color );
		System.out.println( super.color );
	}

	@Override
	void doSomething() {
		System.out.println("Child Doing Something");
		super.doSomething();
	}
	
}

public class SuperKeyword {

	public static void main(String[] args) {

		Child obj = new Child("new color");
		
		obj.displayColor();
		obj.doSomething();
	}

}
