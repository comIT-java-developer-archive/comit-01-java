package com.comit.course._17_collections._01_lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringListExample {


	/*
	 * Book Pages 145 - 158
	 */
	public static void main(String[] args) {
		
		
		/*
		 * Declare and Allocate memory for an ArrayList
		 */
		/*
		 * ArrayList<String> list = new ArrayList<String>();
	     */
		
		/*
		 * As of Java 9
		 */
		//List<String> list = List.of("John","John","Jane");
		// List<String> list = new ArrayList<>(); // Use this when you don't need to add ore remove elements frequently
		List<String> list = new LinkedList<>(); // Use this when you are going to add or remove elements frequently
	
		list.add("John"); // 0
		list.add("John"); // 1
		list.add("Jane"); // 2
		list.add("Mike"); // 3
		list.add("Pete"); // 4
		list.add("Mike"); // 5 Append
		
		list.add(3,"Nick"); // Inserts an element
		list.set(3,"Lily"); // Replaces an element
		
		list.remove("Lily"); // Removes an element
		list.remove(1); // Removes an element by index
		
		list.clear(); // Removes all the elements in the list
		
		System.out.println(list);
		System.out.println(list.size());
		//System.out.println(list.get(2));
		//System.out.println(list.indexOf("Mike"));
		//System.out.println(list.contains("Mike"));
		
		/* loop over the array using the foreach loop */
		/* As of Java 5
		for (String str: list) {
			System.out.println(str);
		}*/
		
		/* loop over an array using the traditional for loop */
		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		/*
		 * As of Java 8
		 * 
		 * list.forEach(e -> System.out.println(e));
      	 * list.forEach(System.out::println);
		 */
     
		/*
		 * Collections in Java don't work with primitives, they use Wrapper classes instead.
		 * 
		 * Primitive Data Type	Wrapper Class
            byte	Byte
            short	Short
            int	    Integer
            long	Long
            float	Float
            double	Double
            boolean	Boolean
            char	Character
		 */
		List<Integer> nums = new ArrayList<>();
		
		nums.add(4);
		nums.add(6);
		nums.add(1);
		nums.add(7);
		
		System.out.println(nums);
	}

}
