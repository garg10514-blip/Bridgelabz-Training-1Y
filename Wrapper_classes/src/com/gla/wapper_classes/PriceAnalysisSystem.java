package com.gla.wapper_classes;

import java.util.*;

public class PriceAnalysisSystem {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};

        ArrayList<Double> priceList = new ArrayList<>();
        for (double price : prices) {
            priceList.add(price);
        }

        double highest = Collections.max(priceList);

        double sum = 0;
        for (double price : priceList) {
            sum += price;
        }

        System.out.println("Highest price: " + highest);
        System.out.println("Average price: " + (sum / priceList.size()));
    }
}