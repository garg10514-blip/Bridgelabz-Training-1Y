package com.gla.wapper_classes;

import java.util.*;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {5, 4, 3};

        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(5);
        newRatings.add(null);
        newRatings.add(4);

        ArrayList<Integer> allRatings = new ArrayList<>();

        for (int rating : oldRatings) {
            allRatings.add(rating);
        }

        allRatings.addAll(newRatings);

        int sum = 0, count = 0;

        for (Integer rating : allRatings) {
            if (rating != null) {
                sum += rating;
                count++;
            }
        }

        System.out.println("Average rating: " + (sum / count));
    }
}
