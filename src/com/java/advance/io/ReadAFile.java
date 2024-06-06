package com.java.advance.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAFile {// Text Files

	public static void main(String[] args) {

		File file = new File(FilePaths.SAMPLE_FILE_PATH);

		if (file.exists()) {

			try (FileInputStream fis = new FileInputStream(file);) {

				int ch;
				while ((ch = fis.read()) != -1) {
					System.out.print((char) ch);

				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.err.println("No file/folder exists !");
		}

	}

}
