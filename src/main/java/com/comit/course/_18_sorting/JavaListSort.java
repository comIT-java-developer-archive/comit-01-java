package com.comit.course._18_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaListSort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(24);
        list.add(2);
        list.add(45);
        list.add(20);
        list.add(56);
        list.add(75);
        list.add(2);
        list.add(56);
        list.add(99);
        list.add(53);
        list.add(12);

        System.out.println("Running Java ListSort");
        System.out.println("Input: " + list.toString());

        Collections.sort(list);

        System.out.println("Output: " + list.toString());
    }
}
