package com.gla.exception_handling;

public class NestedExceptionHandler {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int index = 5;
        int divisor = 0;

        try {
            int value = arr[index];
            try {
                System.out.println("Result: " + (value / divisor));
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
