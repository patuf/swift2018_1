package com.swift.academy.xml;

import java.util.Date;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XMLDumpExample {

    public static void main(String[] args) throws JAXBException, IOException {
        String fileName = "data.xml";

        toXml(fileName);
        parseXml(fileName);
    }

    private static void toXml(String fileName) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Person person = new Person("15", "Pesho", new Date(96, 1, 22),
                new int[]{5, 4, 5, 6}, new Address("Peshovska", 11), "secretPa$$");

        try (FileOutputStream stream = new FileOutputStream(fileName)) {
            marshaller.marshal(person, stream);
        }
    }

    private static void parseXml(String fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        Person parsed = (Person) unmarshaller.unmarshal(new File(fileName));
        
        System.out.println(parsed.id);
        System.out.println(parsed.name);
        System.out.println(parsed.dateOfBirth);

        for (int grade : parsed.grades) {
            System.out.print(grade + " ");
        }
    }
}
