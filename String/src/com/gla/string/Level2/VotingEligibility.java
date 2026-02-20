package com.gla.string.level2;

import java.util.Scanner;

class VotingEligibility {

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[5];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();
        }

        String[][] result = checkVoting(ages);

        System.out.println("Age\tStatus");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
