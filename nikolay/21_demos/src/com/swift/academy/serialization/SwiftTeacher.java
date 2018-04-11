package com.swift.academy.serialization;

import java.io.Serializable;

public class SwiftTeacher implements Serializable {

    String name;
    String subject;
    transient String phoneNo;
    
    public SwiftTeacher(String name, String subject, String phoneNo) {
        this.name = name;
        this.subject = subject;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return String.format("%s[%s] teaches %s", name, phoneNo, subject);
    }
}
