package com.swift.academy.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectsToBytestreamExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String fileName = "teacherInfo.dat";

        try (OutputStream outFile = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(outFile)) {

            out.writeInt(2);
            out.writeObject(new SwiftTeacher("Ivan", "C#", "1981231231"));
            out.writeObject(new SwiftTeacher("Stoyan", "JAVA", "813812831283"));
        }

        try (InputStream inFile = new FileInputStream(fileName);
                ObjectInputStream in = new ObjectInputStream(inFile)) {

            int count = in.readInt();
            System.out.println(count);

            for (int i = 0; i < count; i++) {
                System.out.println((SwiftTeacher) in.readObject());
            }
        }

    }
}
