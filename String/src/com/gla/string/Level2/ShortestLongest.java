package com.gla.string.level2;

import java.util.Scanner;

class ShortestLongest {

    public static void findWords(String text) {
        String[] words = text.split(" ");

        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }

        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        findWords(text);
    }
}
