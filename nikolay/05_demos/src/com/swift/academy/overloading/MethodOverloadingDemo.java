package com.swift.academy.overloading;

public class MethodOverloadingDemo {
    
    void printPersonInfo(String name){
        System.out.println(name);
    }
    
    void printPersonInfo(String name, int age){
        System.out.println(name + " is " + age + " years old.");
    }

    void printPersonInfo(String name, long age){
        System.out.println(name + " is " + age + " years old.");
    }


    public static void main(String[] args){
        MethodOverloadingDemo methodOverloading = new MethodOverloadingDemo();

        methodOverloading.printPersonInfo("Pesho");

        methodOverloading.printPersonInfo("Gosho", 15);
    }
}