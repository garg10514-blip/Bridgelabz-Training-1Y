package com.gla.wapper_classes;

public class SensorDataLogger {

    public static void logTemperature(Double value) {
        System.out.println("Logged value: " + value);
    }

    public static void main(String[] args) {
        double temp1 = 25.5;
        Double temp2 = 30.5;

        logTemperature(temp1);
        logTemperature(temp2);
    }
}