package com.accenture.lkm;

import java.util.InputMismatchException;
import java.util.*;

public class ThrowClause {
	public void division() {

		System.out.println("Enter Nr and dr");

		int q = 0;
		Scanner sc = new Scanner(System.in);
		try {
			int nr = sc.nextInt();
			int dr = sc.nextInt();

			q = nr / dr;

		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println(e);
		}
		sc.close();
		System.out.println("quotient = " + q);

	}

	public static void main(String[] args) {
		ThrowClause a = new ThrowClause();
		try {
			a.division();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}