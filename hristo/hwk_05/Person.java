package swift2018_1.hristo.hwk_05;

public class Person {

    int age;
    String name;


    Person() {
        name = ("Noname");
        age = -1;
    }

    Person(String newName) {

        name = newName;
        age = -1;
    }

    Person(String newName, int newAge) {

        name = newName;
        age = newAge;
    }

    public void sentence () {

        if (name == null){
            System.out.println("I am John Doe");
        }
        else {

            if (age == 0) {
                System.out.println("Hello, i am " + name);
            } else {
                System.out.println("Hello, i am " + name + " .I am " + age + " years old.");
            }
        }

    }

    public static void main(String[] args) {

        Person gosho = new Person();
        gosho.sentence();

        Person stamat = new Person("Stamat", 0);
        stamat.sentence();

        Person pesho = new Person("pesho", 0);
        pesho.sentence();
    }


}









