package com.accenture.lkm.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		read("C:\\Harsh\\Java\\InputOutputDemo\\src\\files\\BufferedOutputStream.txt");

	}

	public static void read(String fileName) throws IOException {
		try (FileInputStream fin = new FileInputStream(fileName);
				BufferedInputStream bin = new BufferedInputStream(fin);) {
			System.out.println(bin.available());

			byte[] data = new byte[bin.available() / 2];
			while (bin.read(data) != -1) {
				System.out.println(new String(data) + " ************");
				System.out.println("remaining:" + bin.available());

			}

		}

	}

}
