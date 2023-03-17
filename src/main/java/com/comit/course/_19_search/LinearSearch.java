package com.comit.course._19_search;

import java.util.Arrays;

/*
 * Works with sorted and unsorted Arrays or ArrayLists.
 */
public class LinearSearch {

	
	// O(n) - Linear Time Complexity
    public static int linearSearch(int[] arr, int key){

        int size = arr.length;

        for (int i=0; i<size; i++) {
        	
            if(arr[i] == key){
                return i;
            }    
        }

        return -1;
    }

    public static void main(String a[]){

        int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };
        int key = 999;

        System.out.println("Running Linear Search");

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("key: '" + key + "' found at index: " + linearSearch(input, key));
    }

}
