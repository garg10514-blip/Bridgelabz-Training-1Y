package com.gla.string.level3;

import java.util.Scanner;

class FrequencyUsingUnique {

    public static void findFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                System.out.println(text.charAt(i) + " : " + freq[text.charAt(i)]);
                freq[text.charAt(i)] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        findFrequency(text);
    }
}
