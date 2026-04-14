package com.gla.threads;

class Order implements Runnable {
    private int id;
    private String restaurant;
    private int deliveryTime;

    public Order(int id, String restaurant, int deliveryTime) {
        this.id = id;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    public void run() {
        long start = System.currentTimeMillis();

        System.out.println("Order " + id + " picked up by " + Thread.currentThread().getName());
        try {
            Thread.sleep(deliveryTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Order " + id + " delivered by " + Thread.currentThread().getName());

        long end = System.currentTimeMillis();
        System.out.println("Total time for Order " + id + ": " + (end - start) + " ms");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order(1, "KFC", 3), "Agent1");
        Thread o2 = new Thread(new Order(2, "Dominos", 2), "Agent2");
        Thread o3 = new Thread(new Order(3, "Burger King", 4), "Agent3");
        Thread o4 = new Thread(new Order(4, "Pizza Hut", 1), "Agent4");
        Thread o5 = new Thread(new Order(5, "Subway", 5), "Agent5");

        o1.setPriority(10);
        o2.setPriority(5);
        o3.setPriority(3);
        o4.setPriority(10);
        o5.setPriority(5);

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}
