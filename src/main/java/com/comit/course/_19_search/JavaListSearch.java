package com.comit.course._19_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaListSearch {

    public static void main(String[] args) {
        /*
         * Binary Search requires a sorted input.
         */
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(16);

        int key = 14;

        System.out.println("Running Java List Binary Search");

        System.out.println("Input: " + list.toString());
        System.out.println("key: '" + key + "' found at index: " + Collections.binarySearch(list, key));

    }
}
