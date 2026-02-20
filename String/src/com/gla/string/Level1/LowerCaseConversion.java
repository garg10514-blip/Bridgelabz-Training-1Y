package com.gla.string.level1;

import java.util.Scanner;

class LowerCaseConversion {

    public static String convertToLower(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userLower = convertToLower(text);
        String builtInLower = text.toLowerCase();

        System.out.println("User-defined: " + userLower);
        System.out.println("Built-in: " + builtInLower);
        System.out.println("Same? " +
                compareStrings(userLower, builtInLower));
    }
}
