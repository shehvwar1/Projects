package com.java.project5;
import java.io.*;
import java.util.Scanner;
public class FindingLongestWord {
	
	public static String longestWord() throws FileNotFoundException
	{
		String longest_Word = "";
		String current = "";
		Scanner sc = new Scanner(new File("D:\\ssoftwares\\sts\\workspace\\myFile.txt"));
		while(sc.hasNext())
		{
			if(current.length() > longest_Word.length())
			{
				longest_Word = current;
			}
		}
		System.out.println("\n"+longest_Word+"\n");
        return longest_Word;
	}

	public static void main(String[] args) throws FileNotFoundException {
		longestWord();
		
	}

}
