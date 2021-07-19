package com.company;

import static java.lang.Thread.sleep;

public class Timer implements Runnable{
    public Runnable r;
    long time;
    public void put (Runnable r, long time) throws InterruptedException {
            Thread t = new Thread(r);

            t.sleep(time);
            t.start();

            t.join();
        }


    public void start() {
       synchronized (this){}
    }

    @Override
    public void run() {
    }
}
