package com.gla.wapper_classes;

public class AgeValidationSystem {

    public static boolean isValidAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            return age >= 18;
        } catch (Exception e) {
            return false;
        }
    }
}