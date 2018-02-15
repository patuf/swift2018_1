package Task0_Classes;

public class Person {
    public String name ;
    public int age ;

    public static void main(String[]args){
        Person person = new Person();
        person.greeting(20,"Pesho");
    }
    public Person(int newAge, String newName) {
        name = newName;
        age = newAge;
    }

    public Person() {
        name = "No name";
        age = -1;
    }

    public Person(String n) {
        name =n;
        age = -1;
    }

        public String greeting(int a, String n){
    if (a==0){
        return String.format("Hello, I am %s.",n);
    }
    else if(n==null){
        return String.format("I am %d years old.",a);
    }
    else if(a==0&n==null){
        return String.format("I am John Doe");
    }
    else return String.format("Hello, I am %s. I am %d years old.",n,a);
    }

    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}
