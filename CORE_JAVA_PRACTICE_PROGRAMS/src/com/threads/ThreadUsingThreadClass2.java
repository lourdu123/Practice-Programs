package com.threads;

import java.util.Date;

public class ThreadUsingThreadClass2 extends Thread {

    public void run() {
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am inside run method of ThreadUsingThreadClass2 class:"
                + Thread.currentThread().getName() + "," + new Date());
    }
}
