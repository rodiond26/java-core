package com.github.rodiond26.multithreading.p03_thread_name_and_priority;

public class ThreadStartAndRunDifference implements Runnable {
    @Override
    public void run() {
        System.out.println("Метод run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadStartAndRunDifference());
        thread.start();
        thread.run();
        System.out.println("Метод main. Thread name = " + Thread.currentThread().getName());
    }
}
