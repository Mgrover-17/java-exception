package com.bridgelabz.javaException;
import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
