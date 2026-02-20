package com.gla.string.level2;

import java.util.Scanner;

class ManualTrim {

    public static String trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;

        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = trimSpaces(text);
        String builtIn = text.trim();

        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtIn);
    }
}
