package com.java.advance.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAFile {// Text Files

	public static void main(String[] args) {

		File file = new File(FilePaths.SAMPLE_FILE_PATH);
		String msg = "Hi How \n high\tare you!!";

		if (file.exists()) {

			try (FileOutputStream fos = new FileOutputStream(file);) {
				fos.write(msg.getBytes());

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
