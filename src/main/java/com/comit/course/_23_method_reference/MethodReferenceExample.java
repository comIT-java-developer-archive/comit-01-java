package com.comit.course._23_method_reference;

import java.util.function.BiFunction;

@FunctionalInterface
interface Sayable {
	void say();
}

@FunctionalInterface
interface Sayable2 {
	void say(String str);
}

@FunctionalInterface
interface Sayable3 {
	ArithMethic say();
}

class ArithMethic {
	
	/*
	ArithMethic(){
	}*/
	
	int add(int a, int b) {
		return a + b;
	}
}

public class MethodReferenceExample {

	static void saySomething() {
		System.out.println("Hello, this is a method()");
	}

	void saySomething2() {
		System.out.println("Hello, this is a method2()");
	}
	
	public static void main(String[] args) {

		Sayable3 obj4 = ArithMethic::new;
		
		ArithMethic arith = obj4.say();
		
		Sayable obj = MethodReferenceExample::saySomething;
		
		//obj.say();
		
		Sayable2 obj2 = System.out::println;
		
		//obj2.say("Hello ComIT");
		
		//MethodReferenceExample methodReference = new MethodReferenceExample();
		
		//Sayable obj3 = methodReference::saySomething2;
		
		Sayable obj3 = new MethodReferenceExample()::saySomething2;
		
		//obj3.say();
			
		BiFunction<Integer,Integer,Integer> adder = new ArithMethic()::add;
		//int result = adder.apply(10, 20);
		
		System.out.println(adder.apply(10, 20));
		
	}

}
