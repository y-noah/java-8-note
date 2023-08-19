package com.example.java8note.part3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            MyPool myPool = new MyPool(i);
            executorService.submit(myPool);
        }

        executorService.shutdown();
    }
}

class MyPool implements Runnable {

    private int id;

    public MyPool(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(id + "----" + Thread.currentThread().getName());
    }
}
