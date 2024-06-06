package com.java.advance.io;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {

		File file = new File(FilePaths.SAMPLE_FILE_PATH);

		if (file.exists()) {
			System.out.println("File ?" + file.isFile());
			System.out.println("Folder ?" + file.isDirectory());
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());

		} else {
			System.err.println("No file/folder exists !");
		}

	}

}
