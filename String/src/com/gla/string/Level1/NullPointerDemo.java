package com.gla.string.level1;

class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception handled: " + e);
        }
    }

    public static void main(String[] args) {
        // Uncomment to generate exception
        // generateException();

        handleException();
    }
}
