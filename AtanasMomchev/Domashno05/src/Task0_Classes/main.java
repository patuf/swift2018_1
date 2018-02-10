package Task0_Classes;

public class main {
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person("Pesho");
        Person p2 = new Person("Gosho", 15);

        p.printPerson();
        p1.printPerson();
        p2.printPerson();
        p1.setName("Strahil");
        p1.setYear(60);
        p1.printPerson();
    }
}
