package com.example.java8note.part3;

public class Threads{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("T1", 10);
        MyThread t2 = new MyThread("T2", 10);

        t1.start();
        t2.start();


        MyRunnable myRun1 = new MyRunnable();
        myRun1.run();


        MyRunnable myRun2 = new MyRunnable();
        myRun2.run();


        Thread thread = new Thread(myRun1);
        thread.start();

        System.out.println("PSVM................");
    }
}

class MyThread extends Thread {
    private String name;
    private int i;

    public MyThread(String name, int i) {
        this.name = name;
        this.i = i;
    }


    @Override
    public void run() {
        for (int j = 0; j < i; j++) {
            try {
                System.out.println("ThreadName:" + name + "---" + j);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            try {
                System.out.println("ThreadName:" + "---" + j);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
