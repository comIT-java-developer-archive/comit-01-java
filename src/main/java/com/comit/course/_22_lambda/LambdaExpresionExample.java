package com.comit.course._22_lambda;


/*
 * Book Page 174 Lambdas
 */

@FunctionalInterface
interface Sayable {
	
	String say();
}

@FunctionalInterface
interface Sayable2 {
	
	String say(String str);
}

class MyClass implements Sayable, Sayable2 {

	@Override
	public String say() {
		return "I love Java";
	}

	@Override
	public String say(String str) {
		return "I love Java - " + str;
	}
}

@FunctionalInterface
interface Addable {
	
	int add(int a, int b);
}

public class LambdaExpresionExample {

	public static void main(String[] args) {
		
		MyClass obj1 = new MyClass();
		//System.out.println(obj1.say());
		
		/*
		 * Define the say() abstract method without
		 * implementing the interface using a Lambda
		 * Expression.
		 */
		
		//Sayable obj2 = () -> { return "I love Lambda"; };
		Sayable obj2 = () -> "I love Lambda";
		//System.out.println(obj2.say());
		
		//Sayable2 obj3 = (String str) -> { return "I love Lambda - " + str; };
		Sayable2 obj3 = s -> "I love Lambda - " + s;
		//System.out.println(obj3.say("ComIT"));
		
		//Addable obj4 = (int a, int b) -> { b = b * 2; 
		//	                              return a + b;};
			                              
	    Addable obj4 = (a, b) -> { b = b * 2; 
			                       return a + b;};
		
		//System.out.println(obj4.add(4, 5));	  
		
		Sayable2 obj5 = str -> { String str1 = "I love Lambda - ";
		                         String str2 = str1 + str;
		                         return str2; };
		                         
		System.out.println(obj5.say("Hello"));                         
		
	}
}
