package com.accenture.lkm.threading.sample;

public class ThreadDemo extends Thread {

	@Override
	public void run() {
		// print out the name of the thread which is executing this method
		System.out.println("Thread name :" + Thread.currentThread().getName());
	}

}
