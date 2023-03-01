package com.comit.course;

public class Hello {

	static int a = 4;
	
	public static void main(String[] args) {

		int a = 3;
		
		System.out.println("main(): " + a);
		System.out.println("main(): " + Hello.a);
		
		//process();
	}
	
	
	public void process() {
		int a = 2;
		System.out.println("process(): " + this.a);
	}

}
