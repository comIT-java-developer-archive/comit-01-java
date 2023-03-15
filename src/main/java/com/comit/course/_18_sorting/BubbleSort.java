package com.comit.course._18_sorting;

import java.util.Arrays;

class BubbleSort {

    void sort(int array[]) {

        int n = array.length;
        int k;

        for (int m=n; m >= 0; m--) {   // 1  O(N^2)
        	
            for (int i = 0; i < n - 1; i++) { // 2
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            
            
        }
    }

    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };

        System.out.println("Running BubbleSort");
        System.out.println("Input: " + Arrays.toString(input));

        BubbleSort sorter = new BubbleSort();
        sorter.sort(input);

        System.out.println("Output: " + Arrays.toString(input));
    }
}


