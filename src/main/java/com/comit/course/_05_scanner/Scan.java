package com.comit.course._05_scanner;

import java.util.Scanner;

public class Scan {

	/*
	 * Scanner - Accepting User Input.
	 * 
	 * Page 59 - 62 from Book
	 * 
	 */
	public static void main(String[] args) {

        /*
         * Create a scanner that accepts user input from the keyboard (System.in)	
         * 
         * try with resources	
         */
		try (Scanner scan = new Scanner(System.in)){
			
			/* Read an integer number from the keyboard*/
			System.out.println("Please enter an integer: ");
			int i = scan.nextInt();
			
			System.out.println("Please enter an double: ");
			double d = scan.nextDouble();
			scan.nextLine(); /* clean the buffer, read the return key (13) left*/
			
			System.out.println("Please enter a String: ");
			String str = scan.nextLine();
			
			System.out.println("You input: " + i);
			System.out.println("You input: " + d);
			System.out.println("You input: " + str);
		}
		
		
		//scan.close();
	}


}
