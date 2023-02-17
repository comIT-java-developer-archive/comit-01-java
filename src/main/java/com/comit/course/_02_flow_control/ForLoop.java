package com.comit.course._02_flow_control;

public class ForLoop {

	/*
	 * The for-loop is used when you know exactly how many times you want 
	 * to loop through a block of code.
	 */
	public static void main(String[] args) {
		/*
		int i = 0;
		while( i < 10 ) {
			System.out.println(i);
			i++;	
		}*/
		
		/*initialization; termination; increment */
		for (int j=0; j<10; j++) {
			
			if (j==0) {
				continue;
			}
			
			//System.out.println(j);
		}
		
		/* for-each-loop, enhanced for-loop  As of Java 5 */
		
		int a = 5;
		int[] array = { 1, 2, 3, 4, 5 };
		
		for(int c: array) {
			System.out.println(c);
		}
		
	}

}
