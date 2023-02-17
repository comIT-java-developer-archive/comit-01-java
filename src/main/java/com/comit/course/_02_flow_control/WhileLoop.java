package com.comit.course._02_flow_control;

public class WhileLoop {

	/*
	 * Loops can execute a block of code while a condition is true.
	 * Book Pages 77-81
	 */
	public static void main(String[] args) {

		int i = 0;
		
		
		while( i < 10 ) {
		
			System.out.println(i);
			i++;

			/*
			if ( i == 5) {
				//break; //breaks out the loop
				continue; // continues with the next iteration
			}*/
			
		}
		
		i = 0;

		/*
		do {
			System.out.println(i);
			i++;			
		} while (i < 10);
		*/
		System.out.println("The end");
	}

}
