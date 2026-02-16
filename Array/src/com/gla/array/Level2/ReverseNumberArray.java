package com.gla.array.Level2;

import java.util.Scanner;

public class ReverseNumberArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Find the digits in the number and save them in an array
        int[] digits = new int[count];
        temp = num;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        //  Create an array to store the elements in reverse order
        int[] reverseArray = new int[count];

        for (int i = 0; i < count; i++) {
            reverseArray[i] = digits[count - 1 - i];
        }

        // e. Display the elements of the reverse array
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseArray[i]);
        }

        sc.close();
    }
}

