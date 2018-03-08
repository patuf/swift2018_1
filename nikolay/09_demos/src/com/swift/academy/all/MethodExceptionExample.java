package com.swift.academy.all;

import java.io.IOException;

public class MethodExceptionExample {

    public void read() throws Exception {
        // read some data
    }
    public void print() throws Exception {
        // write data to console
    }
    public void calculate() {
        try {
            // do some calculation
        } catch (Exception e) {
            // some error happened while doing all
        }
    }
    public void doAll() throws Exception {
        try {
            read();
        } catch (Exception e) {
            // handle error
        }

        // do calculation
        calculate();

        try {
            print();
        } catch (Exception e) {
            throw e;
        }

        // equals
        // print();
    }

    public void writeList() throws IOException, IndexOutOfBoundsException {
        // code may throw either IOException or IndexOutOfBoundsException
    }
}
