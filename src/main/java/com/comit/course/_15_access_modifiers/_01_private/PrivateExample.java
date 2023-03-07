package com.comit.course._15_access_modifiers._01_private;

/*
 * The private access modifier can only be applied for attributes, constructors, methods
 * 
 * I cannot override private methods because they are not visible.
 * 
 * I can overload private methods.
 */

class MyClass {
	
    private int num;
	
    //private MyClass(){	
    //}
    
	void print() {
		System.out.println("MyClass: " + this.num);
	}

	private void print(String str) {
		System.out.println("MyClass: " + str);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

class MyChild extends MyClass {
	
	@Override
	void print() {
		System.out.println("MyChild: " + this.getNum());
	}
	
}


public class PrivateExample {

	public static void main(String[] args) {

		MyChild obj = new MyChild();
		
		obj.setNum(4);
		obj.print();
	}

}
