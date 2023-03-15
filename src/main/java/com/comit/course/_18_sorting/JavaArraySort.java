package com.comit.course._18_sorting;

import java.util.Arrays;

class JavaArraySort {

    public static void main(String[] args) {

        int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };

        System.out.println("Running Java ArraySort");
        System.out.println("Input: " + Arrays.toString(input));

        Arrays.sort(input);

        System.out.println("Output: " + Arrays.toString(input));
    }
}

