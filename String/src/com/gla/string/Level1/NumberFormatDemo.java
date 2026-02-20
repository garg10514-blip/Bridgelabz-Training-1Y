package com.gla.string.level1;

import java.util.Scanner;

class NumberFormatDemo {

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String text = sc.next();

        handleException(text);
    }
}
