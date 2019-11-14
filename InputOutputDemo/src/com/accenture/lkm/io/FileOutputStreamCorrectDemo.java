package com.accenture.lkm.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamCorrectDemo {

	public static void write() throws FileNotFoundException, IOException {
		try (FileOutputStream fout = new FileOutputStream(
				"C:\\Harsh\\Java\\InputOutputDemo\\src\\files\\FileOutputStreamDemoIntExample.txt", true);) {
			fout.write(System.lineSeparator().getBytes());
			String message = "Good Morning..!!";
			fout.write(message.getBytes());
			fout.write(Integer.valueOf(1234).toString().getBytes());
			fout.write(Double.valueOf(98.99).toString().getBytes());
			fout.flush();
			System.out.println("data written to file");

		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		write();

	}

}
