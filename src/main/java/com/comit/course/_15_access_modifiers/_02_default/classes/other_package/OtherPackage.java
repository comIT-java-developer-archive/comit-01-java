package com.comit.course._15_access_modifiers._02_default.classes.other_package;

import com.comit.course._15_access_modifiers._02_default.classes.same_package.MyClass;

public class OtherPackage extends MyClass{

	public OtherPackage() {
		MyClass obj = new MyClass();
		
		obj.num = 4;
		obj.doSomething();
	}

}
