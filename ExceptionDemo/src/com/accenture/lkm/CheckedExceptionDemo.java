package com.accenture.lkm;
import java.io.*;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("src/files/welcome.txt");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
