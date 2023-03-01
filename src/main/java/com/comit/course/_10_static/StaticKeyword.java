package com.comit.course._10_static;


/*
 * The keyword static indicates that the member belongs to the class and not the object.
 * 
 */
class MyClass{
	
	/*
	 * static class' attributes are shared across all the objects of the class 
	 */
	static int num;
	
	static int addNumbers(int a, int b) {
		return a + b;
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
		
		MyClass obj = new MyClass();
		System.out.println(obj.addNumbers(3, 5));
		
		System.out.println( MyClass.addNumbers(3,4) );
	}

}
