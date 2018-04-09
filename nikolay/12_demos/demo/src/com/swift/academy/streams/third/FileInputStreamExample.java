package com.swift.academy.streams.third;

import java.util.Arrays;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileInputStreamExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String filePath = "inputs/example.txt";

//        readWithFileInputStream(filePath);

//        readWithFileReader(filePath);

        readWithFilesClass(filePath);
    }

    /**
     * Using byte streaming
     */
    private static void readWithFileInputStream(String filePath) throws FileNotFoundException, IOException {

        FileInputStream fs = new FileInputStream(filePath);
        String result = "";

        System.out.println("====Reading with FileInputStream:====");

        byte[] bytes = new byte[200];

        while (fs.read(bytes) != -1) {
            result += new String(bytes);

            Arrays.fill(bytes, (byte) 0);
        }

        System.out.println(result);
    }

    /**
     * Using characters streaming
     */
    private static void readWithFileReader(String filePath) throws FileNotFoundException, IOException {
        String result = "";
        FileReader reader = new FileReader(filePath);

        System.out.println("=======Reading with FileReader:======");

        char[] chars = new char[200];

        while (reader.read(chars) != -1) {
            result += new String(chars);

            Arrays.fill(chars, '\0');
        }

        System.out.println(result);
    }

    private static void readWithFilesClass(String filePath) throws IOException {
        System.out.println("======Reading with Files class:======");

        byte[] allBytes = Files.readAllBytes(Paths.get(filePath));

        String result = new String(allBytes);

        System.out.println(result);
    }
}
