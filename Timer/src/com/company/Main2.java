package com.company;

public class Main2 {
    public static void main(String[] args){
        Timer timer = new Timer();
        try {
            timer.put(()->System.out.println("World"), 5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            timer.put(()->System.out.println("Hello"), 2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.start();
        System.out.println("Done");
    }
}
