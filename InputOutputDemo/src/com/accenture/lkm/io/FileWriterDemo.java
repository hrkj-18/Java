package com.accenture.lkm.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void write() throws IOException {
		try (FileWriter fw = new FileWriter("C:\\Harsh\\Java\\InputOutputDemo\\src\\files\\FileWriterDemo.txt", true)) {
			System.out.println(System.lineSeparator());
			fw.write(System.lineSeparator());
			fw.write("Pleasant to meet you.");
			System.out.println("Data writtern to file");
			fw.close();
		}

	}

	public static void main(String[] args) throws IOException {
		write();
	}

}
