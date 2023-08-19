package com.github.rodiond26.multithreading.p02_create_thread;

public class CreatingThreads_anonymousClass {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello 1");
            }
        }).start();

        new Thread(() -> System.out.println("hello 2")).start();
    }
}
