package com.gla.wapper_classes;

public class WrapperToPrimitiveDemo {
    public static void main(String[] args) {
        Double value = 45.67;

        double primitiveDouble = value;
        int convertedInt = (int) primitiveDouble;

        System.out.println("Double: " + primitiveDouble);
        System.out.println("Int: " + convertedInt);
    }
}
