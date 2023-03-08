package com.comit.course._16_exceptions;

import java.util.Scanner;
/*
 * Book Page 82 to Page 87
 * And Exception is an abnormal situation. Java has a mechanism to handle those abnormal 
 * situations.
 *  
 *  UnChecked Exceptions: Those are exceptions that Java doesn't force us to handle.
 *  Are Children of RuntimeException
 *  
 */
public class ExceptionExample {


	void process() throws HelloException {
			
		int a = -1;
		int num = -1;
		
		Scanner scan;
		
		if (a > 0) {
			throw new HelloException("a cannot be less than 10");			
		}
		
		while (num<=0) {
			
			try {
				
				scan = new Scanner(System.in);
				
				System.out.println("Please input a number");
				
				String str = scan.nextLine();

				num = Integer.valueOf(str);
				
				
				a = 5/num;
				
				if (a < 10) {
					
				}
				
				String hello = null;
				
				hello.length();
				
				System.out.println("Right before closing the scanner");
				
				
			} catch(NumberFormatException | ArithmeticException | NullPointerException  ex ) {
				
				ex.printStackTrace();
				
				num = -1;
				System.out.println("Dear User, invalid input, please try again.");
			} 
		}
		
		System.out.println("Result is :" + a);
		
	}
	
	public static void main(String[] args) throws HelloException {
		
		ExceptionExample obj = new ExceptionExample();
		
		obj.process();
		
	}

}
