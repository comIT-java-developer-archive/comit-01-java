package com.comit.course;

import java.util.Random;

class Password{
	
	String password = "";
	int length = 8;
	
	Password(int length) {
		this.length = length;
		
		this.generatePassword();
	}
	
	void generatePassword(){
		
		/*Generates a Random password*/
		
		/* Create random numbers from 32 to 126 */
		
		Random rand = new Random(126);
		
		int counter = 0;
		
		while (counter < length) {
			
			int num = rand.nextInt();
			
			while (num < 32) {
				num = rand.nextInt();
			}
			
			char car = (char)num;
			
			password += car;
			
			counter++;
		}		
	}
	
	
}


public class ExercisePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Password[] passwords = new Password[5];
		
		

	}

}
