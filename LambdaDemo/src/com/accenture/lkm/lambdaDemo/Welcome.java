package com.accenture.lkm.lambdaDemo;

public class Welcome {

	public static void main(String[] args) {
		Greeting greeting = new Greeting() {
		
		@Override
		public void greet (String name) {
			System.out.println("Hello "+name);
		}
	};
		greeting.greet("Seeta");
		
		Greeting gre = name -> System.out.println("Hello "+name);
		gre.greet("Seeta");
	}	

}
