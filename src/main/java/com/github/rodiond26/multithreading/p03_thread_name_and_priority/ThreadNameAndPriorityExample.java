package com.github.rodiond26.multithreading.p03_thread_name_and_priority;

public class ThreadNameAndPriorityExample {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        System.out.println("myThread5 name: " + myThread5.getName());
        System.out.println("myThread5 priority: " + myThread5.getPriority());

        MyThread5 myThread6 = new MyThread5();
        System.out.println("myThread6 name: " + myThread6.getName());
        System.out.println("myThread6 priority: " + myThread6.getPriority());

        MyThread5 myThread7 = new MyThread5();
        System.out.println("myThread7 name: " + myThread7.getName());
        System.out.println("myThread7 priority: " + myThread7.getPriority());
        myThread7.setName("new name of myThread7");
        myThread7.setPriority(9);
        System.out.println("myThread7 name: " + myThread7.getName());
        System.out.println("myThread7 priority: " + myThread7.getPriority());

        myThread7.setPriority(Thread.MIN_PRIORITY);
        myThread7.setPriority(Thread.NORM_PRIORITY);
        myThread7.setPriority(Thread.MAX_PRIORITY);
    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("hello");
    }
}
