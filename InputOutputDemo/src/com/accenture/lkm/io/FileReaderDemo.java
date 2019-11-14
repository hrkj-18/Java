package com.accenture.lkm.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void readCharacterData(String fileName) throws IOException {
		try (FileReader fr = new FileReader(fileName);) {
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.println((char) ch);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		readCharacterData("C:\\Harsh\\Java\\InputOutputDemo\\src\\files\\FileWriterDemo.txt");
	}

}
