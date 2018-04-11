package com.swift.academy.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxParser {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        File inputFile = new File("students.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        MyEventHandler userhandler = new MyEventHandler();
        saxParser.parse(inputFile, userhandler);
    }

    private static class MyEventHandler extends DefaultHandler {
        boolean bFirstName = false;
        boolean bLastName = false;
        boolean bNickName = false;
        boolean bGrade = false;

        @Override
        public void startElement(String uri,
                                 String localName, String qName, Attributes attributes) throws SAXException {

            if (qName.equalsIgnoreCase("student")) {
                String rollNo = attributes.getValue("rollno");
                System.out.println("Roll No : " + rollNo);
            } else if (qName.equalsIgnoreCase("firstname")) {
                bFirstName = true;
            } else if (qName.equalsIgnoreCase("lastname")) {
                bLastName = true;
            } else if (qName.equalsIgnoreCase("nickname")) {
                bNickName = true;
            }
            else if (qName.equalsIgnoreCase("grade")) {
                bGrade = true;
            }
        }

        @Override
        public void endElement(String uri,
                               String localName, String qName) throws SAXException {
            if (qName.equalsIgnoreCase("student")) {
                System.out.println("End Element :" + qName);
            }
        }

        @Override
        public void characters(char ch[], int start, int length) throws SAXException {

            if (bFirstName) {
                System.out.println("First Name: "
                        + new String(ch, start, length));
                bFirstName = false;
            } else if (bLastName) {
                System.out.println("Last Name: " + new String(ch, start, length));
                bLastName = false;
            } else if (bNickName) {
                System.out.println("Nick Name: " + new String(ch, start, length));
                bNickName = false;
            } else if (bGrade) {
                System.out.println("Grade: " + new String(ch, start, length));
                bGrade = false;
            }
        }
    }
}
