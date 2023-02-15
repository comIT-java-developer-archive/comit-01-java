package com.comit.course._01_operators;

public class Logical {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = false;
		boolean c = false;
		
		boolean and = a && b; // The "and" operator returns true only if both operands are true.
		boolean or = a || b; // The "or" operator returns false only if both operands are false.
		boolean not = !a;    // The "not" returns the opposite.
		
		boolean exp = a && b || c;
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(not);
		
	}

}
