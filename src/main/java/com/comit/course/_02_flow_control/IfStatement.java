package com.comit.course._02_flow_control;

public class IfStatement {

	public static void main(String[] args) {

		int a = 28;
		int b = 28;

		// Format your code on Eclipse 
		// Mac - Command + A
		//       Command + Shift + F
		// Win - Control + A
		//       Control + Shift + F
		
		// 1 Scenario

		if (a > b) {
			System.out.println("a is greater than b");
		} 
		else if (a < b) {
			System.out.println("a is less than b");
		} 
		else {
			System.out.println("a is equal to b");
		}

		// 2 Scenario

		if (a > b) {
			System.out.println("a is greater than b");
		}
		if (a < b) {
			System.out.println("a is less than b");
		}
		if (a == b) {
			System.out.println("a is equal to b");
		}

		// 3 Scenario - Nested If

		int c = 25;

		if (a > b) {

			if (a < c) {
				System.out.println("a is equal to b");
			}
		}

	}

}
