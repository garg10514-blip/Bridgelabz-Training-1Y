package com.gla.exception_handling;

public class ArrayAccessHandler {
    public static void main(String[] args) {
        int[] arr = null;

        try {
            System.out.println("Value: " + arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
