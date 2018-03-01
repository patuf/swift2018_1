package com.swift.academy.all;

import java.io.*;

public class ReadFileExample {

    public static void readFile(String fileName) {
        try {
            // Exceptions could be thrown below
            FileInputStream fis = new FileInputStream(fileName);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));

            String line = null;

            int countLines = 0;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                countLines++;
            }
            System.out.println(countLines);

            in.close();

            fis.close();
        } catch (FileNotFoundException e) {
            // Exception handler for FileNotFoundException
            // We just inform the client that there is not such file

            System.out.println("The file \"" + fileName + "\" does not exist! Unable to read it.");
            e.printStackTrace();
        } catch (IOException e) {
            // Exception handler for IOException
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile("C:\\missingFile.txt");
    }
}
