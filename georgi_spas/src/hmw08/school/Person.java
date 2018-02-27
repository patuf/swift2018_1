package hmw08.school;

public class Person implements NameAble  {

    final String namePerson;
    int ID;


    Person(String namePerson){
        this.namePerson=namePerson;
    }
    @Override
    public String getName() {
        return this.namePerson;
    }
}
