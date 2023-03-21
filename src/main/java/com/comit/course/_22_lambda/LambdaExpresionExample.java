package com.comit.course._22_lambda;

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
		
		Sayable obj2 = () -> { return "I love Lambda"; };
		//System.out.println(obj2.say());
		
		
		Sayable2 obj3 = (String str) -> { return "I love Lambda - " + str; };
		System.out.println(obj3.say("ComIT"));
		
		Addable obj4 = (int a, int b) -> { b = b * 2; 
			                              return a + b;};
		
		System.out.println(obj4.add(4, 5));	                              
	}
}
