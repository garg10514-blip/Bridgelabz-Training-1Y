package com.gla.wapper_classes;

import java.util.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        int n = 1000000;

        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long sumList = 0;
        for (int num : list) sumList += num;

        long end = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (end - start));

        start = System.currentTimeMillis();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        long sumArray = 0;
        for (int num : array) sumArray += num;

        end = System.currentTimeMillis();
        System.out.println("Array time: " + (end - start));
    }
}
