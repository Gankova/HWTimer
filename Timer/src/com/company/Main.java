package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	Timer timer = new Timer();
	Thread thread = new Thread(() -> {
		synchronized (timer)
		{
			try {
				timer.put(()->System.out.println("World"),5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	});
	Thread thread2 = new Thread(() -> {
			synchronized (timer)
			{
				try {
					timer.put(()->System.out.println("Hello"),2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		thread2.start();
		thread.join();
		thread2.join();



	timer.start();
	System.out.println("Done");
    }
}
