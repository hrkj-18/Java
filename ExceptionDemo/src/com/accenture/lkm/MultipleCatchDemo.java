package com.accenture.lkm;
import java.util.*;
import java.io.*;
public class MultipleCatchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		try {
			System.out.println("Enter a and b");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/b;
			Thread.sleep(100);
			System.out.println("Result = "+c);
		}
		catch(InputMismatchException | ArithmeticException e){
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block Excecuted");
			sc.close();
		}
	}

}
