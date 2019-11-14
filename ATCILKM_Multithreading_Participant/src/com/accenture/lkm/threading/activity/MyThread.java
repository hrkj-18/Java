package com.accenture.lkm.threading.activity;

//TODO 1 - extend Thread class
class MyThread extends Thread {

//Overriding run method
	@Override
	public void run() {

		// TODO 2 - Write a for loop which runs 5 times and print below three
		// system.out.println statements with thread name and loop counter
		// 1. Entering into the method
		// 2. Inside the method
		// 3. Exiting from the method

		for (int i = 0; i < 5; i++) {
			System.out.println("Entering into the method " + Thread.currentThread().getName() + " " + i);
			System.out.println("Inside the method " + Thread.currentThread().getName() + " " + i);
			System.out.println("Exiting from the method " + Thread.currentThread().getName() + " " + i);
		}

	}
}
