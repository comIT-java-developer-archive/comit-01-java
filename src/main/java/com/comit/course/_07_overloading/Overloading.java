package com.comit.course._07_overloading;


/*
 * Book - Page 96
 * Overloading is a situation where in the same class, two or more methods/constructors
 * have the same name but different parameters.
 */
class MyClass {
	
	int num;
	String str;
	
	/*
	 * Overloading only works with methods and constructors
	 */

	/*
	 * 1. Constructor Overloading
	 */
	
	MyClass() {
	}

	MyClass(String str) {
		this.str = str;
	}

	MyClass(int num) {
		this.num = num;
	}

	MyClass(String str, int num) {
		this.str = str;
		this.num = num;
	}

	/*
	 * 2. Method Overloading
	 */
	
	/* Overloading by changing the type of the parameters */
	String concatenate(String str, int num) {
		return str + " " + num;
	}

	String concatenate(int num, String str) {
		return str + " " + num;
	}

	String concatenate(String str) {
		return "Hello " + str;
	}
	
	/* Overloading by changing the number of the parameters */
	int add(int a, int b) {
		return a + b;
	}

	double add(int a, int b, int c) {
		return a + b + c;
	}
}




public class Overloading {

	public static void main(String[] hello) {

		int a, b, c;
		
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass("ComIT");
		MyClass obj3 = new MyClass(1);
		MyClass obj4 = new MyClass("ComIT",1);
		
		/* 
		 * Java knows which overloaded method() you want to run 
		 * from the datatypes of the parameters
		 */
		
		System.out.println(obj1.concatenate("ComIT", 1));
		System.out.println(obj1.concatenate(1,"ComIT"));
		System.out.println(obj1.concatenate("ComIT"));
		
		System.out.println(obj1.add(1, 2));
		System.out.println(obj1.add(1, 2, 3));
		
	}
	
	public static void main() {
		
		System.out.println("Hello this is the main() method overloaded");
	}

}
