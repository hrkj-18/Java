package com.accenture.lkm.interfaces;

interface IStatic {
	static void funTwo() {
		System.out.println("This is static method");
	}
}

class IStaticImpl implements IStatic {/*
										 * static void funTwo() { System.out.println("This is static method 2"); }
										 */
}

public class IStaticDemo {
	public static void main(String[] args) {
		IStatic.funTwo();
		// IStaticImpl.funTwo(); //error
	}
}
