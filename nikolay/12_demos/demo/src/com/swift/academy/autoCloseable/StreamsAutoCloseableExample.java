package com.swift.academy.autoCloseable;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamsAutoCloseableExample {

    public static void main(String[] args) throws IOException {

        try (DataOutputStream os = new DataOutputStream(System.out)) {
            os.writeChar('h');
            os.writeChar('e');
            os.writeChar('l');
            os.writeChar('l');
            os.writeChar('o');
        }

    }

}
