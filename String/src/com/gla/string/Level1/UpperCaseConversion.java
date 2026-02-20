package com.gla.string.level1;

import java.util.Scanner;

class UpperCaseConversion {

    public static String convertToUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
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

        String userUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("User-defined: " + userUpper);
        System.out.println("Built-in: " + builtInUpper);
        System.out.println("Same? " +
                compareStrings(userUpper, builtInUpper));
    }
}

