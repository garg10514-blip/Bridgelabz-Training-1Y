package com.gla.string.level2;

import java.util.Scanner;

class LengthWithoutBuiltIn {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.println("Length (User Method): " + findLength(text));
        System.out.println("Length (Built-in): " + text.length());
    }
}

