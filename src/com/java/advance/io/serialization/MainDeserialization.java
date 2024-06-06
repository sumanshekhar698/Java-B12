package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.java.advance.io.FilePaths;

public class MainDeserialization {

	public static void main(String[] args) {

		// Serialization
		File file = new File(FilePaths.OBJECT_STORE_FILE_PATH);

		if (file.exists()) {

			try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis);) {

				Student st = (Student) ois.readObject();
				System.out.println(st);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else {
			System.err.println("No file/folder exists !");
		}

	}

}
