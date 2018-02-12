public class Person {

    String name;
    int age;

    // Constructor 1
    Person() {
        name = "No name";
        age = -1;
    }

    // Constructor 2
    Person(String nameValue) {
        name = nameValue;
        age = -1;
    }

    // Constructor 3
    Person(String nameValue, int ageValue) {
        name = nameValue;
        age = ageValue;
    }

    void setName(String nameValue) {
        if (nameValue != null && !nameValue.isEmpty()){
            this.name = nameValue;
        } else {
            System.out.println("Enter valid name");
        }

    }

    String getName() {
        return this.name;
    }

    void setAge(int ageValue) {
        if (0 <= ageValue && ageValue <= 120) {
            this.age = ageValue;
        } else {
            System.out.println("Enter valid age");
        }
    }

    int getAge() {
        return this.age;
    }

    String sayHello() {
        String message = "";
        if (name.equals("No Name")) {
            message = "I am John Doe";
            return message;
        } else if (age == -1) {
            return "Hello I am " + name;
        } else {
            return "Hello I am " + name + ". I am " + age + " years old.";
        }
    }
}
