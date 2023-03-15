package com.comit.course._18_sorting;


import java.util.Arrays;

class QuickSort {

    private int array[];
    private int length;

    public void sort(int[] input) {

        if (input == null || input.length == 0) {
            return;
        }
        this.array = input;
        length = input.length;
        doQuickSort(0, length - 1);
    }

    private void doQuickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        /*
         * Calculate pivot number, I am taking pivot as middle index number
         */
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];

        /*
         *  Divide into two arrays
         */
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                /*
                 * Move index to next position on both sides
                 */
                i++;
                j--;
            }
        }
        /*
         * Call doQuickSort() method recursively
         */
        if (lowerIndex < j) {
            doQuickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            doQuickSort(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String a[]){

        int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };

        System.out.println("Running QuickSort");
        System.out.println("Input: " + Arrays.toString(input));

        QuickSort sorter = new QuickSort();
        sorter.sort(input);

        System.out.println("Output: " + Arrays.toString(input));
    }
}

