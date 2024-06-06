package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.java.advance.io.FilePaths;

public class Main {

	public static void main(String[] args) {

		Student st1 = new Student(3, "Samantha");
		System.out.println(st1);

		// Serialization
		File file = new File(FilePaths.OBJECT_STORE_FILE_PATH);

		if (file.exists()) {

			try (FileOutputStream fos = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				oos.writeObject(st1);
				

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
