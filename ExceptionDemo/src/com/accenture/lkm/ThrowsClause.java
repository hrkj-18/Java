package com.accenture.lkm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsClause {

	public static void read() throws IOException {
		FileReader fr=null;
		try {
			fr = new FileReader("src/files/users.txt");

			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
		} finally {
			fr.close();
		}

	}

	public static void main(String[] args)  {
		try {
			ThrowsClause.read();
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
