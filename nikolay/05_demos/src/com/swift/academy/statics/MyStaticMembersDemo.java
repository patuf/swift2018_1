package com.swift.academy.statics;

public class MyStaticMembersDemo{
    public void main(){

        Counter counter;
        counter = new Counter();
        counter = new Counter();
        counter = new Counter();
        counter = new Counter();
        counter = new Counter();

        int number = counter.numberOfInstances();

        System.out.println(number);


        //        Student pesho = new Student("Pesho", "Petrich");
//        Student gosho = new Student("Gosho", "Giurgevo");
//        Student lyubo = new Student("Lyubo", "Varna");
//        Student lyubo2 = new Student("Lyubo2", "Varna");
//        Student lyubo3 = new Student("Lyubo3", "Varna");
//        Student lyubo4 = new Student("Lyubo4", "Varna");
//
//        System.out.println("Total registered students: " + Student.count);
//        System.out.println(gosho.name + "'s student ID is: " + gosho.studentId);

        System.out.println("Setting B of the singleton: " + Singleton.getInstance().getSettingB());
        Singleton.getInstance().setSettingB("changed setting");
        System.out.println("New value of setting B of the singleton: " + Singleton.getInstance().getSettingB());
    }

    public static void main(String[] args) {
        MyStaticMembersDemo membersDemo = new MyStaticMembersDemo();
        membersDemo.main();
    }
}
