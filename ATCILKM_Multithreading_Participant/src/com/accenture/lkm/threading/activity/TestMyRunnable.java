package com.accenture.lkm.threading.activity;


public class TestMyRunnable {
	public static void main(String args[]) {
		System.out.println("Thread Name :" + Thread.currentThread().getName());
			
		//TODO 1 - Instantiate an object (say m1) of MyRunnableThread class 
				
		//TODO 2 - Create 2 objects of Thread class and pass m1 and a thread name as its parameters
				
		//TODO 3 - Start both the threads using start()
		
		MyRunnableThread m1 = new MyRunnableThread();
		
		// creating two thread objects
		Thread thread1 = new Thread(m1, "Thread-1");
		Thread thread2 = new Thread(m1, "Thread-2");
		
		// starting both the threads
		thread1.start();
		thread2.start();
		
	}
}
