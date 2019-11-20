package com.accenture.lkm.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

public class OneTest {
	
	public OneTest(){
		System.out.println("I am here");
	}

	@BeforeEach
	 void test() {
		Assertions.assertEquals(2, 2, "1 + 1 = 2");
		System.out.println("I am inBefore each");
       // Assertions.assertEquals("My First Test", "My Figgrst Test", "TestInfo is injected correctly");
	}
	@BeforeAll
	 static void testAll() {
		Assertions.assertEquals(2, 2, "1 + 1 = 2");
		System.out.println("I am inBefore all");
      // Assertions.assertEquals("My First Test", "My Figgrst Test", "TestInfo is injected correctly");
	}

	@Test
	public void test1() {
		Assertions.assertEquals(2, 2, "1 + 1 = 2");
		System.out.println("I am in method1");
       // Assertions.assertEquals("My First Test", "My Figgrst Test", "TestInfo is injected correctly");
	}
	@Test
	public void test2() {
		Assertions.assertEquals(2, 2, "1 + 1 = 2");
		System.out.println("I am in method2");
       // Assertions.assertEquals("My First Test", "My Figgrst Test", "TestInfo is injected correctly");
	}


}
