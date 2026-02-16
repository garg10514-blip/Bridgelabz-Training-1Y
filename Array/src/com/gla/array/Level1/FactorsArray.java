package com.gla.array.Level1;

import java.util.Scanner;
import java.util.Arrays;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxSize = 10;              // Initial array size
        int[] factors = new int[maxSize];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                // If array is full, increase size
                if (index == maxSize) {
                    maxSize = maxSize * 2;
                    factors = Arrays.copyOf(factors, maxSize);
                }

                factors[index] = i;
                index++;
            }
        }

        System.out.println("Factors are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}

