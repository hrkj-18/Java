package com.accenture.lkm;

public class StringConcatDemo {

	public static void main(String[] args) {
		String s = new String("Hello");
		
		s.concat(" World");
		
		System.out.println(s);
		System.out.println(s.concat(" World"));
		
		s=s.concat(" World");
		
		System.out.println(s);
		

	}

}
