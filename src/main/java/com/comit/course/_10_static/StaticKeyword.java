package com.comit.course._10_static;


/*
 * The keyword static indicates that the member belongs to the class and not the object.
 * 
 * The Java Math built-in class is a good example as all its methods are static. 
 */
class MyClass{
	
	/*
	 * static class' attributes are shared across all the objects of the class 
	 */
	static int num;
	
	/* static method() belongs to the class */
	static int addNumbers(int a, int b) {
		
		/* 
		 * If the logic inside method depends only on the parameters 
		 * then the method should be static. 
		 */
		
		/* We cannot call non-static methods from static methods */
        //print(a,b);
		return a + b;
	}
	
	/* non-static method() belongs to the object*/
	void print(int a, int b) {
		
		/*
		 * If inside the method we use class attributes then the method must be non-static
		 */
		/* We can call static methods from non-static methods */
		int num = addNumbers(a,b);
		System.out.println(a + b);
	}
}


public class StaticKeyword {

	public static void main(String[] args) {

		/*
		MyClass obj1 = new MyClass();
		obj1.num = 10;
		
		MyClass obj2 = new MyClass();
		obj2.num = 20;
		
		MyClass obj3 = new MyClass();
		obj3.num = 30;
		
		System.out.println( obj1.num ); */// 10 or 20 ???
		

		/* We can call an static method directly using the class name */
		System.out.println( MyClass.addNumbers(3,4) ); 
		
		/* We can call an static method using an object as well but it is not recommended. */
		MyClass obj = new MyClass();
		System.out.println(obj.addNumbers(3, 5));
		
		/* Two ways to call methods from a main() method*/
		
		/* 1. Make the method we want to call static*/
		// hello();
		
		/* 2. Create an object of the class and use it to call the method */
		
		StaticKeyword obj4 = new StaticKeyword();
		obj4.hello();
		
		/* 2^3 */
		
		System.out.println( Math.pow(2, 3) );
		
	}
	
	void hello() {
		System.out.println("Hello");
	}

}
