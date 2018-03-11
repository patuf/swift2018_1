package com.swift.academy.streams.second;

import java.io.*;

public class DataObjectStreamsExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Printing int[] as object: ");

        OutputStream outputStream = System.out;
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        oos.writeObject(new int[]{1, 2, 3, 4});

        System.out.println();

        System.out.println("Printing string as object: ");
        oos.writeObject("Test");

        System.out.println();

        System.out.println("Serializing/deserializing person object: ");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oosPesho = new ObjectOutputStream(baos);
        Person person = new Person("Pesho", 25);
        oosPesho.writeObject(person);
        byte[] myObj = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(myObj);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Person newPerson = (Person) ois.readObject();
        System.out.println("Brand new person's name is: " + newPerson.name);

        System.out.println();

        System.out.println("Printing char:");
        DataOutputStream dos = new DataOutputStream(System.out);
        dos.writeChar('a');
        dos.flush();
    }

}
