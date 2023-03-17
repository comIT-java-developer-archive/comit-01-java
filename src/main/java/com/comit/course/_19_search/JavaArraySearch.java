package com.comit.course._19_search;

import java.util.Arrays;

public class JavaArraySearch {

    public static void main(String[] args) {
        /*
         * Binary Search requires a sorted input.
         */
        int[] input = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 14;

        System.out.println("Running Java Array Binary Search");

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("key: '" + key + "' found at index: " + Arrays.binarySearch(input, key));

    }
}
