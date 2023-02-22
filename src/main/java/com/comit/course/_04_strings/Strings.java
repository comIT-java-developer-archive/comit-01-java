package com.comit.course._04_strings;

public class Strings {
	
	/*
	 * Book Page 36 - 41
	 * A String is a data structure that holds a sequence of characters
	 * 
	 * Strings are immutable - cannot change.
	 * 
	 * More information:
	 *    https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		char[] chars = { 'C', 'o', 'm', 'I', 'T' };
		
		String str0 = new String(chars);
		System.out.println(str0);
		
		/* declare variable and initialize it */
		String str1 = "ComIT";
		System.out.println(str1);
		
		/* String size */
		System.out.println( str1.length() );
		
		/*
		 * String concatenation or join strings
		 */
		
		String str2 = "Hello";
		String str3 = str2 + " " + str1 + ", I love Java";
		//System.out.println( str2 + " " + str1 );
		
		String str4 = str2.concat(" ").concat(str1).concat(", I love Java."); // More object oriented.
		//System.out.println( str4 );
		
		/*
		 * String Trim
		 */
		String str5 = "    Hello    ";
		//System.out.println("-->" + str5.trim() + "<--");
		str5 = str5.trim();
		//System.out.println("-->" + str5 + "<--");
		
		String str6 = "Hello";
		/* index       01234 */
		
		/*
		 * Grab a String character.
		*/		
		//System.out.println( str6.charAt(3) );
		
		/*
		 * Checks if a string is a substring of another string.
		 */
		//System.out.println( str6.contains("el1"));
		
		/*
		 * String comparison
		 */
		
		System.out.println(str6.equals("hello"));
		System.out.println(str6.equalsIgnoreCase("hello"));
		
		/*
		 * String replace
		 */
		
		System.out.println(str6.replace("Hello", "ComIT, I love Java"));
		str6 = str6.replace("Hello", "ComIT, I love Java");
		System.out.println(str6);
		
		String str7 = "ComIT, I love Java";
		/*             012345678901234567*/
		
		/*
		 * Substrings
		 */
		System.out.println(str7.substring(7));
		System.out.println(str7.substring(9,13));
		
		
		
		
		
		
		
	}

}
