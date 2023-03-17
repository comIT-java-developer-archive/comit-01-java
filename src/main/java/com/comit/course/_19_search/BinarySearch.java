package com.comit.course._19_search;

import java.util.Arrays;

/*
 * Binary Search works with sorted Arrays or ArrayLists only.
 */
public class BinarySearch {

	// O(log n) - Time Complexity
    public static int binarySearch(int[] input, int key) {

        int start = 0;
        int end = input.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == input[mid]) {
                return mid;
            }
            if (key < input[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        /*
         * Binary Search requires a sorted input.
         */
        int[] input = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 14;

        System.out.println("Running Binary Search");

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("key: '" + key + "' found at index: " + binarySearch(input, key));

    }
}
