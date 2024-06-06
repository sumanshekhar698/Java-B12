package com.java.advance.io;

import java.io.File;
import java.io.IOException;

public class FileCreationDeletion {

	public static void main(String[] args) {

		String path = FilePaths.NOTES_FOLDER_PATH + "/dummy.txt";
		File file = new File(path);

		if (file.exists()) {

			System.out.println("File ?" + file.isFile());
			System.out.println("Folder ?" + file.isDirectory());
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
			
			
			System.out.println("Deleting file in path " + path);
			file.delete();

		} else {
			System.err.println("No file/folder exists !");
			System.out.println("Creating new file in path " + path);
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
