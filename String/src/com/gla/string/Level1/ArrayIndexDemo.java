package com.gla.string.level1;

class ArrayIndexDemo {

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handled: " + e);
        }
    }

    public static void main(String[] args) {
        String[] names = {"John", "Alex", "Sam"};
        handleException(names);
    }
}
