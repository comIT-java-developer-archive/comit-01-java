package com.comit.course._02_flow_control;

import java.math.BigDecimal;

public class SwitchStatement {

	/*
	 * Switch statement is to select one of many code blocks to be executed.
	 * Book Page 69-74
	 */
	public static void main(String[] args) {
		
		/*
		 * Write a program that translates the day's number into the day's name according 
		 * to the following table.
		 * 
		 * 1 -> Monday
		 * 2 -> Tuesday
		 * 3 -> Wednesday
		 * 4 -> Thursday
		 * 5 -> Friday
		 * 6 -> Saturday
		 * 7 -> Sunday
		 */
		
		int day = 0;
		/*
		if (day==1) {
			System.out.println("Monday");
		} else if (day==2) {
			System.out.println("Tuesday");			
		} else if (day==3) {
			System.out.println("Wednesday");						
		}*/
		
		/*
		 * numeric (int,long, short, byte), String, char
		 */
		switch(day) {
		case -1,0,1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");		
			break;
		default:
			System.out.println("Invalid day");
			
		}

		/* Simplified Switch Statement from Java 12*/
		switch(day) {
		case -1,0,1 -> {
		 	        System.out.println("Hello");
		            System.out.println("Monday");
		}
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");
		default -> System.out.println("Invalid day");
		}

		/* Assigning values with the simplified switch statement
		 * A default case is required.
		 */
		String name = switch(day) {
		case 0,1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid day";
		};
		
		System.out.println(name);
		
		
	}
}
