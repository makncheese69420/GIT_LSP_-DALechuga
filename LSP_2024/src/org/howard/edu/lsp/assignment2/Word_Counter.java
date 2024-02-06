package org.howard.edu.lsp.assignment2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Word_Counter {

	public static void main(String[] args) throws IOException {
		// Input
		FileInputStream file = new FileInputStream("words.txt");
		Scanner reader = new Scanner(file); 
		
		
		//Array Lists
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Checking the file
		while(reader.hasNext()) {
			if(reader.hasNextInt()) {
				continue;
			}
			String newWord = reader.next().toLowerCase();
			if(newWord.length() <= 3) {
				continue;
			}
			if(words.contains(newWord)) {
				int Index = words.indexOf(newWord);
				numbers.set(Index,numbers.get(Index));
			}
			else {
				words.add(newWord);
				numbers.add(1);
			}
		}
		
		reader.close();
		file.close();
		
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i)+ ": "+ numbers.get(i));
		}
		

	}

}
