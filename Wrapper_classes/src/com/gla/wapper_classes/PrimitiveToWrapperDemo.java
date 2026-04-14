package com.gla.wapper_classes;

import java.util.Scanner;

public class PrimitiveToWrapperDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Integer wrapperNumber = Integer.valueOf(number);

        System.out.println("Primitive: " + number);
        System.out.println("Wrapper: " + wrapperNumber);
    }
}