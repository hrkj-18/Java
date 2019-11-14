package com.accenture.lkm.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void write(String fileName) throws IOException {
		try (FileOutputStream fout = new FileOutputStream(fileName, true);
				BufferedOutputStream bout = new BufferedOutputStream(fout);) {
			String greeting = "Have a nice day..!!";
			bout.write(System.lineSeparator().getBytes());
			bout.write(greeting.getBytes());
			bout.write(77777);
			
			bout.flush();
			System.out.println("message written");
		}
	}

	public static void main(String[] args) throws IOException {
		write("C:\\Harsh\\Java\\InputOutputDemo\\src\\files\\BufferedOutputStream.txt");
	}

}
