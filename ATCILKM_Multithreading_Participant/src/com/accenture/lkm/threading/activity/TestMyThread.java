package com.accenture.lkm.threading.activity;

public class TestMyThread {
	public static void main(String args[]) {
		System.out.println("Thread Name :" + Thread.currentThread().getName());
			
		//TODO 1 - create 2 threads by creating objects of MyThread class and set thread name by calling setName method				
						
		//TODO 2 - Start both the threads by using start()
		
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();

		// starting both the threads
		thread1.start();
		thread2.start();
		
	}
}
