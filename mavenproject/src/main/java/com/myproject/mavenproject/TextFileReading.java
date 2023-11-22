package com.myproject.mavenproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
/**
 * This to read characters from a text file.
 */
public class TextFileReading {
 
	public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("MyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
