package com.gla.wapper_classes;

import java.util.*;

public class EmployeeAgeProcessor {
    public static void main(String[] args) {
        int[] ages = {25, 30, 18, 40};

        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age);
        }

        System.out.println("Youngest: " + Collections.min(ageList));
        System.out.println("Oldest: " + Collections.max(ageList));
    }
}
