package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
    public static void writeToFile(String contents, File file) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(contents);
        }
    }

    public static void main(String[] args) {
        // Example usage
        File file = new File("output.txt");
        try {
            writeToFile("Hello, World!", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
