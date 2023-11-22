package com.myproject.mavenproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 
/**
 * This to write characters to a text file 
 *
 */
public class TextFileWriting {
 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
}