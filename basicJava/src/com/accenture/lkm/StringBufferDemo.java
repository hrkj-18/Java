package com.accenture.lkm;

import java.util.*;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
	
		System.out.println(s);
	
		s.append(" World");
	
		System.out.println(s);
	}
}
