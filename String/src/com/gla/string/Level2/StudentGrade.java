package com.gla.string.level2;

import java.util.*;

class StudentGrade {

    public static String grade(double percent) {
        if (percent >= 90) return "A";
        if (percent >= 75) return "B";
        if (percent >= 60) return "C";
        if (percent >= 50) return "D";
        return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1));

            int phy = sc.nextInt();
            int chem = sc.nextInt();
            int math = sc.nextInt();

            int total = phy + chem + math;
            double percent = total / 3.0;

            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percent);
            System.out.println("Grade: " + grade(percent));
        }
    }
}

