package com.java.project5;

import java.io.FileNotFoundException;
import java.io.*;

public class WritingToAFile {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileWriter fs = new FileWriter("D:\\ssoftwares\\sts\\workspace\\myFile.txt");
			fs.write("Files in Java might be tricky, but it is fun enough!");
			fs.close();
			System.out.println("Writing to a file is successful");
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
