package com.swift.academy.streams.first;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[10];

        System.out.print("Enter String: ");

        InputStream in = System.in;
        in.read(bytes);

        String text = new String(bytes);
        
        System.out.println("Converted to string: " + text);

        String newTest = text + " small change.";

        OutputStream out = System.out;
        System.out.print("Printed on the stream as bytes: ");

        out.write(newTest.getBytes());
    }
}
