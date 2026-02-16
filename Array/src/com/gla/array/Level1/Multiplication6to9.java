package com.gla.array.Level1;

import java.util.Scanner;

public class Multiplication6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            int result= number*i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
