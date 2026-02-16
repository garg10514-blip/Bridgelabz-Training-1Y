package com.gla.array.Level2;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Create 2D array and status array
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];


        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            // Weight input validation
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive. Try again.");
                }
            } while (personData[i][0] <= 0);

            // Height input validation
            do {
                System.out.print("Enter height (meters): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive. Try again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI
            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];

            // Determine weight status
            if (bmi <= 18.4)
                weightStatus[i] = "Underweight";
            else if (bmi >= 18.5 && bmi < 24.9)
                weightStatus[i] = "Normal weight";
            else if (bmi >= 25.0 && bmi < 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        //  Display results
        System.out.println("\n----- BMI Report -----");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
