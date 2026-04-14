package com.gla.threads;

class BankAccountUser implements Runnable {
    private String name;
    private String type;

    public BankAccountUser(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " (" + type + ") checking balance | Priority: "
                    + Thread.currentThread().getPriority());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        Thread premium = new Thread(new BankAccountUser("User1", "Premium"));
        Thread regular = new Thread(new BankAccountUser("User2", "Regular"));
        Thread basic = new Thread(new BankAccountUser("User3", "Basic"));

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}
