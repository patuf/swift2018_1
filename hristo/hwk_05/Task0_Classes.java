package swift2018_1.hristo.hwk_05;

public class Task0_Classes{} //Ако затварящата скоба я сложа накрая ми гърми static и програмата не тръгва

 class Person {

    int age;
    String name;


    public Person() {

        Person p1 = new Person();
        p1.age = -1;
        p1.name = "Noname";
    }

     Person(String n) {

        name = n;
        age = -1;
        Person p2 = new Person("Stamat");
    }

     Person(String n, int a) {

        name = n;
        age = a;


    }

     String getName() {
        return name;
    }

     int getAge() {
        return age;
    }
/*Остава ми само да напиша логиката*/

    public static void main(String[] args) {

        Person pesho = new Person("Peter", 25);
        System.out.println("Hello, i am " + pesho.name + ". I am " + pesho.age + " years old.");
        System.out.println("Hello, i am " + pesho.getName() + ". I am " + pesho.getAge() + " years old.");
    }



}





