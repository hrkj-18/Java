package com.accenture.lkm.interfaces;

interface IDefault {
	/* public */ /* static final */ int i = 10;

	/* public */ /* abstract */ void meth();

	default void fun() {
		System.out.println("Hello Priya");
	}
}

interface IDefault2 {

	default void fun() {
		System.out.println("Hello Pooja");
	}
}

class DefaultImpl implements IDefault, IDefault2 {

	@Override
	public void meth() {
		System.out.println("Hello Mayuri");
	}
	/*
	 * public void fun() { System.out.println("Hello Hiten");
	 * 
	 * }
	 */

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		IDefault2.super.fun();
		IDefault.super.fun();

		// your code
	}

}

public class Java8Changes {

	public static void main(String[] args) {
		IDefault default1;
		default1 = new DefaultImpl();
		default1.fun();
	}
}
