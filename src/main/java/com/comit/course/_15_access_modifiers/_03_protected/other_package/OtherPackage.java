package com.comit.course._15_access_modifiers._03_protected.other_package;

import com.comit.course._15_access_modifiers._03_protected.same_package.MyClass;

public class OtherPackage extends MyClass{

	
	void doSomething2() {
		
		this.num = 5;
		this.doSomething();
	}
	
	
	public static void main(String[] args) {

		
		
		
		MyClass obj = new MyClass();
		
		//obj.num = 4;
		//obj.doSomething();
	}

}
