package com.gla.array.Level1;

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if natural number
        if (number <= 0) {
            System.out.println("Error! Not a natural number.");
            return;
        }

        int[] odd = new int[number];
        int[] even = new int[number];

        int oIndex = 0;
        int eIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[eIndex] = i;
                eIndex++;
            } else {
                odd[oIndex] = i;
                oIndex++;
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < oIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\nEven Numbers:");
        for (int i = 0; i < eIndex; i++) {
            System.out.print(even[i] + " ");
        }
    }
}

