package com.github.rodiond26.multithreading.p02_create_thread;

public class CreatingThreads_implementsRunnable {
    public static void main(String[] args) {
        Thread myThread3 = new Thread(new MyThread3());
        Thread myThread4 = new Thread(new MyThread4());
        myThread3.start();
        myThread4.start();
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
