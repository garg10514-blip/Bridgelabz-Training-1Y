package com.gla.wapper_classes;

public class StudentMarksProcessor {
    public static void main(String[] args) {
        Object[] data = {"85", 95, Integer.valueOf(88), "null"};

        int sum = 0, count = 0;

        for (Object obj : data) {
            try {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!str.equals("null")) {
                        sum += Integer.parseInt(str);
                        count++;
                    }
                } else if (obj instanceof Integer) {
                    sum += (Integer) obj;
                    count++;
                }
            } catch (Exception e) {
                // ignore invalid
            }
        }

        System.out.println("Average marks: " + (sum / count));
    }
}
