package com.gla.threads;

import java.util.Random;

class Ticket extends Thread {
    private int id;
    private String type;
    private int priority;

    public Ticket(int id, String type, int priority) {
        this.id = id;
        this.type = type;
        this.priority = priority;
        setPriority(priority);
    }

    public void run() {
        Random rand = new Random();
        int time = (rand.nextInt(5) + 1) * 1000;

        System.out.println("Ticket " + id + " [" + type + "] started by " + getName()
                + " | Priority: " + getPriority());

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ticket " + id + " completed by " + getName());
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        Ticket[] tickets = {
                new Ticket(1, "Critical Bug", 10),
                new Ticket(2, "Feature Request", 4),
                new Ticket(3, "General Query", 2),
                new Ticket(4, "Feedback", 1),
                new Ticket(5, "Critical Bug", 10),
                new Ticket(6, "General Query", 2),
                new Ticket(7, "Feature Request", 4),
                new Ticket(8, "Feedback", 1),
                new Ticket(9, "Critical Bug", 10),
                new Ticket(10, "General Query", 2)
        };

        for (Ticket t : tickets) {
            t.start();
        }
    }
}