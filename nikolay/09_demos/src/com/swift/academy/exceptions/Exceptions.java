package com.swift.academy.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exceptions {

    public static void main(String[] args) {
        String s = null;
        s.charAt(0);

        String ss = args[4];

//        readFile();
    }

    public static void readFile() throws FileNotFoundException {

        InputStream is = new FileInputStream(new File("myFile.txt"));

    }
}
