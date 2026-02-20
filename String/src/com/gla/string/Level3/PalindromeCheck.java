package com.gla.string.level3;

import java.util.Scanner;

class PalindromeCheck {

    public static boolean checkPalindrome(String text) {
        int start = 0, end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Logic 1: " + checkPalindrome(text));
        System.out.println("Logic 2: " +
                checkPalindromeRecursive(text, 0, text.length() - 1));
    }
}

