package com.accenture.lkm.threading.activity;

import com.accenture.lkm.threading.activity.AlphaGenerator.Generator;

//Code that generates output synchronized from 2 threads
//First thread prints a number from 1-26 and the other prints alphabets against those numbers 

public class AlphabetNumberTest {
	public static void main(String[] args) {
		Generator obj = new Generator();

		// TODO 1 - Create objects of both the thread classes - NumGenerator and
		// AlphaGenerator
		// and pass obj as a parameter to them
		NumGenerator n1 = new NumGenerator(obj);
		AlphaGenerator a1 = new AlphaGenerator(obj);

		// TODO 2 - Start both the threads
		n1.start();
		a1.start();

	}
}

class NumGenerator extends Thread {
	public Generator obj;

	public NumGenerator(Generator obj) {
		this.obj = obj;
	}

	public void run() {
		// TODO 3 - Run a loop from 1-26 (say i is the variable) and
		// call printNumber method passing i as its parameter
		for (int i = 1; i < 27; i++) {
			obj.printNumber(i);

		}

	}
}

class AlphaGenerator extends Thread {
	public Generator obj;

	public AlphaGenerator(Generator obj) {
		this.obj = obj;
	}

	public void run() {

		// TODO 4 - Run a loop from A-Z (say c is the variable) and
		// call printAlbhabet method passing c as its parameter
		for (int c = 65; c <= 90; c++) {
			obj.printAlphabet((char) c);

		}
	}
}
class Generator {
	boolean numPrinted = false;
	public synchronized void printNumber(int number)
	{
		//TODO 5 - Check if numPrinted is true, then call wait().
		//         It requires InterruptedException to be caught
		
		if(numPrinted==true) {			
			try { //call wait so that receiver can receive the message before sending another message
				wait();
			} 
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		//TODO 6 - print the number here using System.out.print(number + ": ")
		
		System.out.print(number + ": ");
		//TODO 7 - numPrinted should be assigned true here
		
		numPrinted = true;
		//TODO 8 - Notify the waiting thread using notify()
		notifyAll();
		
		
	}
	public synchronized void printAlphabet(char alphabet)
	{
		//TODO 9 - Check if numPrinted is false, then call wait().
		//         It requires InterruptedException to be caught
		if(numPrinted==false) {			
			try { //call wait so that receiver can receive the message before sending another message
				wait();
			} 
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		
		//TODO 10 - print the alphabet here using System.out.println(alphabet)
		System.out.println(alphabet);
		
		//TODO 11 - numPrinted should be assigned false here
		
		numPrinted = false;
		//TODO 12 - Notify the waiting thread using notify()
		notifyAll();
	}
}