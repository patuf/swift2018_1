package oop.classeobjectandmethods.hmwk05.task0_Classes;

public class Person {

    // instance fields(state-represent from data typee)

    String name;
    int age;

    // constructors;

    // 1)  without params

    Person(){// begin body constructor

         name="No name";//without key word this is the same the fields of bottom
        this.age=-1;// here is good practise to write key word this

    }   // end body constructor

    // 2)  pass one param

    Person(String  name ){// here we pass params
    this.name=name;// pass params and set value in instance fileds
    this.age=-1;// initialize
    }

    // 3) pass two params

    Person(String  name,int age ){// here we pass two paramsd
        this.name=name;// pass params and set value in instance fileds
        this.age=age;// initialize
    }

    // methody
    void printIntroduce(){
        System.out.println("Hello, I am "+name+'.'+"I am "+age);
    }


    // start program
    public static void main(String[] args) {

     // invoke the 3 types constructors and show initialize fields whit print

     // invoke 1) constructor
        Person pepi=new Person();// create object and make reference connection whit heap memory
        System.out.println("Person name "+pepi.name +" his age  "+pepi.age);

     // invoke 2) constructor
        Person georgi=new Person("Georgi");
        System.out.println("Person name "+georgi.name +" his age "+georgi.age);
        // invoke 3) constructor

      Person adi= new Person("name",12);
        System.out.println("Person name "+adi.name +" his age "+adi.age);

      // invoke method from objects
        pepi.printIntroduce();
        georgi.printIntroduce();
        adi.printIntroduce();
////////////////////////// demo car////////////////


    }



}
