package com.gla.array.Level2;

import java.util.Scanner;
import java.util.Arrays;

public class DynamicDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                digits = Arrays.copyOf(digits, maxDigit);
            }

            digits[index++] = number % 10;
            number /= 10;
        }

        System.out.println("Total digits stored: " + index);
    }
}

