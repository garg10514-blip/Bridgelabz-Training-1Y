package com.gla.threads;

class ExamTask implements Runnable {
    private String task;
    private int delay;

    public ExamTask(String task, int delay) {
        this.task = task;
        this.delay = delay;
    }

    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(task + " started | State: " + Thread.currentThread().getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExamHall {
    public static void main(String[] args) {
        Thread entry = new Thread(new ExamTask("Student Entry", 0));
        Thread paper = new Thread(new ExamTask("Question Paper Distribution", 5000));
        Thread attendance = new Thread(new ExamTask("Attendance", 10000));
        Thread collection = new Thread(new ExamTask("Answer Sheet Collection", 15000));

        paper.setPriority(10);
        attendance.setPriority(8);
        entry.setPriority(5);
        collection.setPriority(7);

        entry.start();
        paper.start();
        attendance.start();
        collection.start();
    }
}
