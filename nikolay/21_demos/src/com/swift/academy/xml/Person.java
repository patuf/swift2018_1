package com.swift.academy.xml;

import java.util.Date;
import javax.xml.bind.annotation.*;

@XmlRootElement
class Person {

    @XmlAttribute
    String id;

    @XmlElement
    String name;

    @XmlElement
    Date dateOfBirth;

//    @XmlElementWrapper
    @XmlElement(name = "grade")
    int[] grades;

    @XmlElement
    Address address;

    String password;

    Person() {
        //No-op
    }

    public Person(String id, String name, Date dateOfBirth, int[] grades, Address address, String password) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;
        this.address = address;
        this.password = password;
    }
}
