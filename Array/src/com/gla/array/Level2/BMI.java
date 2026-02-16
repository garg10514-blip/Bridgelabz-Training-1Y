package com.gla.array.Level2;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();


        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];


        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            // Weight validation
            do {
                System.out.print("Enter weight (kg): ");
                weight[i] = sc.nextDouble();
                if (weight[i] <= 0)
                    System.out.println("Weight must be positive. Try again.");
            } while (weight[i] <= 0);

            // Height validation
            do {
                System.out.print("Enter height (meters): ");
                height[i] = sc.nextDouble();
                if (height[i] <= 0)
                    System.out.println("Height must be positive. Try again.");
            } while (height[i] <= 0);

            // d. Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine status using BMI table
            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] >= 18.5 && bmi[i] < 24.9)
                status[i] = "Normal weight";
            else if (bmi[i] >= 25.0 && bmi[i] < 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        //  Display results
        System.out.println("\n----- BMI Report -----");

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
        }

        sc.close();
    }
}

